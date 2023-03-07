package practica_1;

import java.util.ArrayList;
import java.util.Iterator;

/*
    @author Davidcp97
*/

public class Practica_1 
{
    public static void main(String[] args) 
    {
    // clientes
        
        ArrayList<Cliente> AL_clientes = new ArrayList<> ();        // creo ArrayList de tipo Cliente
        
        Cliente.INSERTAR_TXT(AL_clientes);                        // inserto los datos de los clientes
                
        Iterator<Cliente> Iterador = AL_clientes.iterator();        // creo el iterador para el ArrayList de clientes
        
        int Cant_Clientes;
        
        Cant_Clientes = AL_clientes.size();
        
        System.out.println("\nNumero de clientes: " + Cant_Clientes);
        
        System.out.println("\nLista de clientes: \n");
        
        Cliente.MOSTRAR_ArrayList(Iterador, AL_clientes);               // imprimo el ArrayList de clientes
        
    // productos del banco    
        
        ArrayList<Productos_Banco> Productos = new ArrayList<> ();          // creo ArrayList de tipo Productos_Banco
        
        Productos_Banco.INSERTAR_TXT(Productos);                          // inserto los datos de los productos
        
        int Cant_Productos;
        
        Cant_Productos = Productos.size();
        
        System.out.println("Numero de productos: " + Cant_Productos);
        
        Iterator<Productos_Banco> Iterador_P = Productos.iterator();        // creo el iterador para el ArrayList de productos
        
        System.out.println("\nLista de productos: \n");
        
        Productos_Banco.MOSTRAR_ArrayList(Iterador_P, Productos);       // imprimo el ArrayList de productos del banco
        
    // elegir producto
    
        Iterador = AL_clientes.iterator();                                  // actualizamos el iterador
    
        Cliente.ELEGIR_PRODUCTO(Iterador, AL_clientes);
        
        Iterador = AL_clientes.iterator();                                  // actualizamos el iterador
        
    // metodos adicionales
        
        Cliente.MENU(Iterador, AL_clientes);     
    }  
}
