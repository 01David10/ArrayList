package practica_1;

import java.io.File;
import java.util.ArrayList;
import java.time.LocalDate;         // libreria para la fecha
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
    @author Davidcp97
*/

public class Cliente 
{
    // atributos
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private int Edad;                   // validar que sea mayor de 18
    private String Direccion;           // validar la direccion. Cada posicion tendra una parte de la direccion, al final se imprime todo junto
    private long Celular;               // validar que tengo 10 digitos
    private String producto;    
    private LocalDate Fecha_Vencimiento;

    // constructor
    public Cliente(String Cedula, String Nombres, String Apellidos, int Edad, String Direccion, long Celular, String producto, LocalDate Fecha_Vencimiento) 
    {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.producto = producto;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    // constructor vacio
    public Cliente() 
    {
        
    }
    
    // getters and setters
    public String getCedula() 
    {
        return Cedula;
    }

    public void setCedula(String Cedula) 
    {
        this.Cedula = Cedula;
    }

    public String getNombres() 
    {
        return Nombres;
    }

    public void setNombres(String Nombres) 
    {
        this.Nombres = Nombres;
    }

    public String getApellidos() 
    {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) 
    {
        this.Apellidos = Apellidos;
    }

    public int getEdad() 
    {
        return Edad;
    }

    public void setEdad(int Edad) 
    {
        this.Edad = Edad;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }

    public long getCelular() 
    {
        return Celular;
    }

    public void setCelular(long Celular) 
    {
        this.Celular = Celular;
    }

    public String getProducto() 
    {
        return producto;
    }

    public void setProducto(String producto) 
    {
        this.producto = producto;
    }

    public LocalDate getFecha_Vencimiento() 
    {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(LocalDate Fecha_Vencimiento) 
    {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    } 
    
    public static void Configurar_Direccion ()
    {
        /*
        
            Scanner s = null;   // variable Scanner

            Cliente cliente = new Cliente();    // objeto

            String d[] = null;  // direccion

            System.out.println("\nIngrese el tipo de vía (calle, carrera o diagonal): ");
            s = new Scanner (System.in);
            d[0] = s.nextLine();
            Direccion[0]=d[0];

            System.out.println("\nIngrese el numero): ");
            s = new Scanner (System.in);
            d[1] = s.nextLine();
            Direccion[1]=d[1];

            System.out.println("\nIngrese el numero de la calle): ");
            s = new Scanner (System.in);
            d[2] = s.nextLine();
            Direccion[2]=d[2];

            System.out.println("\nIngrese el numero de la puerta): ");
            s = new Scanner (System.in);
            d[3] = s.nextLine();
            Direccion[3]=d[3];

            System.out.println("\nIngrese el nombre del barrio): ");
            s = new Scanner (System.in);
            d[4] = s.nextLine();
            Direccion[4]=d[4];
        */
    }
    
    // metodos adicionales
    public static String Validar_Pregunta (String ask)    // tiene que retornar para que el while del principal funcione bien
    {   
        Scanner s = new Scanner (System.in);
        
        while (!"si".equalsIgnoreCase(ask) && !"no".equalsIgnoreCase(ask))
        {
            if (!"si".equalsIgnoreCase(ask) && !"no".equalsIgnoreCase(ask)) 
            {
                System.out.println("Error\n");
            }
            else
            {
                return ask;
            }
            System.out.println("Desea agregar mas clientes (si/no): ");
            ask = s.nextLine();
        }
        return ask;
    }
    
    // validaciones
    public static void Validar_Edad (int edad)
    {   
        Scanner s = new Scanner (System.in);
        
        while (edad <18)
        {
            if (edad <18) 
            {
                System.out.println("Solo se permiten mayores de edad\n");
            }
            else
            {
                return;
            }
            System.out.println("Ingrese la edad: ");
            edad = s.nextInt();
        }
    }
    
    public static void Validar_Direccion (String []direccion)
    {

    }
    
    public static void Validar_Celular (long celular)
    {
        
        Scanner s = new Scanner (System.in);

        while (celular <999999999)
        {
            if (celular <999999999) 
            {
                System.out.println("Por favor ingrese un numero de 10 digitos\n");
            }
            else
            {
                return;
            }
            System.out.println("\nIngrese el celular: ");
            celular = s.nextLong();
        }
    }
    
    // metodos adicionales
    public static void INSERTAR_MANUAL (ArrayList<Cliente> n)
    {   
        String Nuevo_Cliente = "si";
        Scanner leer = new Scanner (System.in);
        
        Scanner s = null;   // variable Scanner

        Cliente cliente = new Cliente();    // objeto
        
        do
        {        
            String a;           // apellidos, nombres, cedula
            String d = null;    // direccion
            int e;              // edad
            long c;             // celular       

            System.out.println("\nIngrese los nombres: ");
            s = new Scanner (System.in);
            a = s.nextLine();
            cliente.setNombres(a);

            System.out.println("\nIngrese los apellidos: ");
            s = new Scanner (System.in);
            a = s.nextLine();
            cliente.setApellidos(a);

            System.out.println("\nIngrese la cedula: ");
            s = new Scanner (System.in);
            a = s.nextLine();
            cliente.setCedula(a);

            System.out.println("\nIngrese la direccion: ");
            s = new Scanner (System.in);
            d = s.nextLine();
            cliente.setDireccion(d);

            System.out.println("\nIngrese la edad: ");
            s = new Scanner (System.in);
            e = s.nextInt();    // para los enteros
            Validar_Edad(e);
            cliente.setEdad(e);

            System.out.println("\nIngrese el celular: ");
            s = new Scanner (System.in);
            c = s.nextLong();    // para los long
            Validar_Celular(c);
            cliente.setCelular(c);     

            n.add(cliente);                                                     // añadimos el "objeto" cliente a el ArrayList

            System.out.println("Desea agregar un cliente nuevo? \n");           
            Nuevo_Cliente = leer.nextLine ();   
            Nuevo_Cliente = Cliente.Validar_Pregunta(Nuevo_Cliente); 
        }
        while("si".equalsIgnoreCase(Nuevo_Cliente));    
    }
    
    // llena el ArrayList a partir de un archivo txt
    public static void INSERTAR_TXT (ArrayList<Cliente> n)
    {
        File fichero = new File("Clientes.txt");
        Scanner s = null;   // 
  
        try 
        {            
            // Leemos el contenido del fichero
            s = new Scanner(fichero);

            // Obtengo los datos de los clientes del fichero
            while (s.hasNextLine())
            {
                String linea = s.nextLine();                            // Obtengo una linea o fila del fichero (un cliente)
                String [] cortarString = linea.split("::");	// Creo el arreglo donde voy a almacernar cada dato (separando cada atributo por ::)
                
                Cliente cliente = new Cliente();                        // Creo el objeto de la clase Cliente

                // Pongo los atributos al objeto "partido"
                cliente.setNombres(cortarString[0]);    
                cliente.setApellidos(cortarString[1]);
                cliente.setCedula(cortarString[2]);
                cliente.setDireccion(cortarString[3]);
                cliente.setEdad(Integer.parseInt(cortarString[4]));
                // Validar_Edad(Integer.parseInt(cortarString[4]));
                cliente.setCelular(Long.parseLong(cortarString[5]));      
                // Validar_Celular(Long.parseLong(cortarString[5]));
                
                n.add(cliente);                                             // Añadimos el objeto "cliente" al ArrayList
            }

        }   
        catch (Exception e)     
        {
            e.printStackTrace();
        } 
    }
    
    public static void MOSTRAR_ArrayList (Iterator<Cliente> i, ArrayList<Cliente> n)
    {
        while(i.hasNext())    
        {
            Cliente cliente = i.next();     
            System.out.println(cliente.getNombres()+ " " + cliente.getApellidos()+ "\nCedula: " + cliente.getCedula()+ "\nDireccion: " + cliente.getDireccion() + "\nEdad: " + cliente.getEdad() + "\nCelular: " + cliente.getCelular() + " \n");
        }
    }
    
    public static void ELEGIR_PRODUCTO (Iterator<Cliente> i, ArrayList<Cliente> n)
    {
        int opc;
        
        LocalDate Fecha_Actual = LocalDate.now();
        
        while(i.hasNext()) 
        {
            Cliente cliente = i.next();     
            
            opc = Integer.parseInt(JOptionPane.showInputDialog("Elija el producto que desea adquirir: \n"
            + "1. Tarjeta credito\n"
            + "2. Tarjeta debito\n"
            + "3. Cuenta corriente\n"));

            switch (opc) 
            {
                case 1:
                    cliente.setProducto("Tarjeta credito");
                    LocalDate Fecha_Vencimiento_TC = Fecha_Actual.plusYears(5);
                    cliente.setFecha_Vencimiento(Fecha_Vencimiento_TC);
                break;

                case 2:
                    cliente.setProducto("Tarjeta debito");
                    LocalDate Fecha_Vencimiento_TD = Fecha_Actual.plusYears(10);
                    cliente.setFecha_Vencimiento(Fecha_Vencimiento_TD);
                break;   

                case 3:
                    cliente.setProducto("Tarjeta corriente");
                    LocalDate Fecha_Vencimiento_CC = Fecha_Actual.plusYears(8);
                    cliente.setFecha_Vencimiento(Fecha_Vencimiento_CC);
                break;

                default:
                    return;
            }
        }
        
        i = n.iterator();  // actualizamos el iterador
        
        System.out.println("\nLista de clientes con sus respectivos productos: \n");

        while(i.hasNext())    
        {
            Cliente cliente = i.next();     
            System.out.println(cliente.getNombres()+ " " + cliente.getApellidos()+ "\nCedula: " + cliente.getCedula()+ "\nDireccion: " + cliente.getDireccion() + "\nEdad: " + cliente.getEdad() + "\nCelular: " + cliente.getCelular() + "\nProducto: "+ cliente.getProducto() + "\nFecha vencimiento: " + cliente.getFecha_Vencimiento() + "\n");
        }
    }
    
    public static void MENU (Iterator<Cliente> i, ArrayList<Cliente> n)
    {
        int opc;
        
        do // menu forma 1
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n"
                    + "1. Lista de clientes por producto\n"
                    + "2. Porcentaje de clientes por producto\n"
                    + "3. Lista de clientes que tienen productos por vencer\n"
                    + "0. Salir\n"));
            switch (opc) 
            {
                case 1:
                    // submenu 1
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Submenu 1: \n"
                    + "1. Clientes con tarjeta de credito\n"
                    + "2. Clientes con cuenta ahorros\n"
                    + "3. Clientes con cuenta corriente\n"));
                    
                    switch (opc) 
                    {
                        case 1:
                            Cliente.Lista_Clientes_TC(i, n);
                        break;

                        case 2:
                            
                        break;   
                        
                        case 3:
                            
                        break;
                        
                        default:
                            return;
                    }
                break;
                
                case 2:
                    // submenu 2
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Submenu 2: \n"
                    + "1. Porcentaje de clientes con tarjeta de credito\n"
                    + "2. Porcentaje de clientes con cuenta ahorros\n"
                    + "3. Porcentaje de clientes con cuenta corriente\n"));
                    
                    switch (opc) 
                    {
                        case 1:
                            
                        break;

                        case 2:
                            
                        break;   
                        
                        case 3:
                            
                        break;
                        
                        default:
                            return;
                    }
                break;
                
                case 3:
                    
                break;
                
                case 0:
                    return;
                
                default:
                    return;
            }
        }
        while (opc !=0);
    }
    
    public static void Lista_Clientes_TC (Iterator<Cliente> i, ArrayList<Cliente> n)
    {
        while(i.hasNext())    
        {
            Cliente cliente = i.next(); 
            if ("Tarjeta credito".equalsIgnoreCase(cliente.getProducto())) 
            {
                System.out.println(cliente.getNombres()+ " " + cliente.getApellidos()+ "\n");
            }
        }
    }
    
    
}


