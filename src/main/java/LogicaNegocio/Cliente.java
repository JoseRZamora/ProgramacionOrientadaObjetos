/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author chvesjc
 */
public class Cliente {
    private String nombre;
    private String apellido; 
    private int cedula;
    private String correoElectronico; 
    private int telefono; 
    
    //Metodo constructor
    
    public Cliente(){
    nombre = "";
    apellido ="";
    cedula =0;
    correoElectronico =""; 
    telefono =0; 
    }
    
    //C.Sobrecargado
    
    public Cliente(String nombre,String apellido, int cedula, String correoElectronico, int telefono){ 
        this.nombre= nombre;
        this.apellido = apellido;
        this.cedula= cedula; 
        this.correoElectronico= correoElectronico; 
        this.telefono= telefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // Metodo ToString
    @Override
    public String toString (){
        return this.getNombre() + this.getApellido() + this.getCedula() + this.getCorreoElectronico() + this.getTelefono() ; 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si es el mismo objeto
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si es null o no es la misma clase
        }
        Cliente other = (Cliente) obj; // Convertimos a Cliente para comparar atributos
        return cedula == other.cedula; // Comparamos el atributo que identifica único
}
    //esto fue una recomendacion del neatbeans
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cedula;
        return hash;
    }

}
