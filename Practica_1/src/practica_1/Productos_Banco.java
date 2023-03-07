package practica_1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    @author Davidcp97
*/
public class Productos_Banco 
{
    // atributos   
    private String Beneficios;
    private String Tipo;
    private String Politica_uso;

    // constructor
    public Productos_Banco(String Beneficios, String Tipo, String Politica_uso) 
    {
        this.Beneficios = Beneficios;
        this.Tipo = Tipo;
        this.Politica_uso = Politica_uso;
    }
    
    // constructor vacio
    public Productos_Banco() 
    {
        
    }

    // getters and setters
    public String getBeneficios() 
    {
        return Beneficios;
    }

    public void setBeneficios(String Beneficios) 
    {
        this.Beneficios = Beneficios;
    }

    public String getTipo() 
    {
        return Tipo;
    }

    public void setTipo(String Tipo) 
    {
        this.Tipo = Tipo;
    }

    public String getPolitica_uso() 
    {
        return Politica_uso;
    }

    public void setPolitica_uso(String Politica_uso) 
    {
        this.Politica_uso = Politica_uso;
    } 
    
    // metodos adicionales
    
    // llena el ArrayList a partir de un archivo txt
    public static void INSERTAR_TXT (ArrayList<Productos_Banco> n)
    {
        File fichero = new File("Productos.txt");
        Scanner s = null;   // 
  
        try 
        {            
            // Leemos el contenido del fichero
            s = new Scanner(fichero);

            // Obtengo los datos de los productos del fichero
            while (s.hasNextLine())
            {
                String linea = s.nextLine();                                      // Obtengo una linea o fila del fichero (un producto)
                String [] cortarString = linea.split("::");                  // Creo el arreglo donde voy a almacernar cada dato (separando cada atributo por ::)
                
                Productos_Banco producto = new Productos_Banco();                 // Creo el objeto de la clase producto

                // Pongo los atributos al objeto "producto" 
                producto.setTipo(cortarString[0]);
                producto.setBeneficios(cortarString[1]);    
                producto.setPolitica_uso(cortarString[2]);
                
                n.add(producto);                                                // Añadimos el objeto "producto" al ArrayList
            }

        }   
        catch (Exception e)     
        {
            e.printStackTrace();
        } 
    }
    
    public static void MOSTRAR_ArrayList (Iterator<Productos_Banco> i, ArrayList<Productos_Banco> n)
    {
        while(i.hasNext())    
        {
            Productos_Banco producto = i.next();
            System.out.println("Tipo: " + producto.getTipo() + "\nBeneficios: " + producto.getBeneficios() + "\nPolitica de uso: " + producto.getPolitica_uso() + " \n");
        }
    }
}


