
package albummundialrusia2018;

import javax.swing.JOptionPane;

public class ListaJugadores {
    Jugadores inicio,fin;
    String Mostrar;
    int mostrar=0;
    
    Jugadores auxiliar = inicio;
    public ListaJugadores(){
        inicio=fin= null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    
    public void agregaralfinal(int d,String nombre,String posicion,String titular){
        if(!vacia()){
            fin = new Jugadores(d,nombre,posicion,titular,null,fin);
            fin.anterior.siguiente= fin;
        }else{
            inicio=fin= new Jugadores(d,nombre,posicion,titular);
        }
    }
    
    public void agregaralinicio(int d,String nombre,String posicion,String titular){
        if(!vacia()){
            inicio = new Jugadores(d,nombre,posicion,titular,fin,null);
            inicio.siguiente.anterior= inicio;
        }else{
            inicio=fin= new Jugadores(d,nombre,posicion,titular);
        }
    }

    public void eliminarinicio(){
        if(inicio==fin){
            inicio= fin=null;
        }else{
            inicio= inicio.siguiente;
            inicio.anterior=null;
        }
    }
    
    public void eliminarfinal(){
        if(inicio==fin){
            inicio= fin=null;
        }else{
            fin = fin.anterior;
            fin.siguiente=null;
        } 
    }
    
    public void eliminar(String nombre){
       Jugadores Random = inicio;
       while(Random != null){
           if(Random.Nombre.equals(nombre)){
               Random.siguiente.anterior = Random.anterior;
               Random.anterior.siguiente = Random.siguiente; 
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    public void modificar(String nombre){
       Jugadores Random = inicio;
       while(Random != null){
           if(Random.Nombre.equals(nombre)){ 
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    
}
