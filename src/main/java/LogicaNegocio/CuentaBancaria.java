/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author chvesjc
 */
public class CuentaBancaria {
    private int cedula; 
    private int numeroCuenta; 
    private int numeroIBAN; 
    
    //Metodo constructor
    
    public CuentaBancaria(){
    cedula =0;
    numeroCuenta =0; 
    numeroIBAN =0; 
    }
    
    //C.Sobrecargado
    
    public CuentaBancaria(int cedula,int numeroCuenta, int numeroIBAN){ 
        this.cedula= cedula; 
        this.numeroCuenta= numeroCuenta; 
        this.numeroIBAN= numeroIBAN;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the numeroIBAN
     */
    public int getNumeroIBAN() {
        return numeroIBAN;
    }

    /**
     * @param numeroIBAN the numeroIBAN to set
     */
    public void setNumeroIBAN(int numeroIBAN) {
        this.numeroIBAN = numeroIBAN;
    }
    
    // Metodo ToString
    @Override
    public String toString() {
        return "Cedula: " + this.getCedula()
                + ", NumeroCuenta: " + this.getNumeroCuenta()
                + ", NumeroIBAN: " + this.getNumeroIBAN();
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CuentaBancaria other = (CuentaBancaria) obj;
        return numeroCuenta == other.numeroCuenta; // Asumiendo que Número de cuenta identifica única
}
//esto fue una recomendacion del neatbeans
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numeroCuenta;
        return hash;
    }

}
