/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
 
import LogicaNegocio.Cliente;
import LogicaNegocio.CuentaBancaria; 
import java.util.*; 

/**
 *
 * @author chvesjc
 */
public class main {
    static Scanner sc = new Scanner (System.in);
    static List<Cliente> clientes = new ArrayList<>(); 
    static List<CuentaBancaria> cuentas = new ArrayList<>();
    
    public static void main(String[] args) {
    int opcion; 
    
    do {
        System.out.println("\n--- Menu Principal --");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Modificar cliente");
        System.out.println("3. Listar clientes");
        System.out.println("4. Eliminar clientes");
        System.out.println("5. Registrar cuenta bancaria");
        System.out.println("6. Modificar cuenta bancaria");
        System.out.println("7. Listar cuentas bancarias");
        System.out.println("8. Eliminar cuenta bancaria");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt(); 
        sc.nextLine(); //limpiar
        
        switch (opcion) {
               case 1:
                registrarCliente();
                break;
            case 2:
                modificarCliente();
                break;
            case 3:
                listarClientes();
                break;
            case 4:
                eliminarCliente();
                break;
            case 5:
                registrarCuenta();
                break;
            case 6:
                modificarCuenta();
                break;
            case 7:
                listarCuentas();
                break;
            case 8:
                eliminarCuenta();
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
            }
        } while (opcion != 9);
    
    
    }
    // ====== MÉTODOS CLIENTES ======
    private static void registrarCliente() {
        System.out.print("Ingrese cédula: ");
        int cedula = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (Cliente c : clientes) {
            if (c.getCedula() == cedula) {
                System.out.println("Ya existe un cliente con esa cédula.");
                return;
            }
        }

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese correo electrónico: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese teléfono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        Cliente nuevo = new Cliente(nombre, apellido, cedula, correo, telefono);
        clientes.add(nuevo);
        System.out.println("Cliente registrado con éxito.");
    }
    
    private static void modificarCliente() {
        System.out.print("Ingrese cédula del cliente a modificar: ");
        int cedula = sc.nextInt();
        sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getCedula() == cedula) {
                System.out.print("Nuevo nombre: ");
                c.setNombre(sc.nextLine());
                System.out.print("Nuevo apellido: ");
                c.setApellido(sc.nextLine());
                System.out.print("Nuevo correo electrónico: ");
                c.setCorreoElectronico(sc.nextLine());
                System.out.print("Nuevo teléfono: ");
                c.setTelefono(sc.nextInt());
                sc.nextLine();

                System.out.println("Cliente modificado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }
    
     private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println(c); // Usa el método toString() de tu clase Cliente
        }
    }
     
     private static void eliminarCliente() {
        System.out.print("Ingrese cédula del cliente a eliminar: ");
        int cedula = sc.nextInt();
        sc.nextLine();

        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCedula() == cedula) {
                it.remove();
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }
     
      // ====== MÉTODOS CUENTAS BANCARIAS ======

    private static void registrarCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        int numeroCuenta = sc.nextInt();
        sc.nextLine();

        for (CuentaBancaria c : cuentas) {
            if (c.getNumeroCuenta() == numeroCuenta) {
                System.out.println("Ya existe una cuenta con ese número.");
                return;
            }
        }

        System.out.print("Ingrese número IBAN: ");
        int numeroIBAN = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese cédula del cliente: ");
        int cedula = sc.nextInt();
        sc.nextLine();

        boolean clienteExiste = false;
        for (Cliente cl : clientes) {
            if (cl.getCedula() == cedula) {
                clienteExiste = true;
                break;
            }
        }

        if (!clienteExiste) {
            System.out.println("No existe un cliente con esa cédula.");
            return;
        }

        CuentaBancaria nueva = new CuentaBancaria(cedula, numeroCuenta, numeroIBAN);
        cuentas.add(nueva);
        System.out.println("Cuenta bancaria registrada correctamente.");
    }

    private static void modificarCuenta() {
        System.out.print("Ingrese número de cuenta a modificar: ");
        int numero = sc.nextInt();
        sc.nextLine();

        for (CuentaBancaria c : cuentas) {
            if (c.getNumeroCuenta() == numero) {
                System.out.print("Nuevo número IBAN: ");
                c.setNumeroIBAN(sc.nextInt());
                sc.nextLine();
                System.out.println("Cuenta modificada correctamente.");
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }

    private static void listarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
            return;
        }

        for (CuentaBancaria c : cuentas) {
            System.out.println(c);
        }
    }

    private static void eliminarCuenta() {
        System.out.print("Ingrese número de cuenta a eliminar: ");
        int numero = sc.nextInt();
        sc.nextLine();

        Iterator<CuentaBancaria> it = cuentas.iterator();
        while (it.hasNext()) {
            CuentaBancaria c = it.next();
            if (c.getNumeroCuenta() == numero) {
                it.remove();
                System.out.println("Cuenta eliminada correctamente.");
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }
     
    }
    
    

