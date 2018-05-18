
package albummundialrusia2018;

public class Jugadores {
    int Camisola;
    String Nombre;
    String Posicion; 
    String Titular;
    Jugadores siguiente;
    Jugadores anterior;
    public Jugadores(int d,String nombre,String posicion,String titular){
        this(d,nombre,posicion,titular,null,null);
    }
    
    public Jugadores(int d,String nombre,String posicion,String titular,Jugadores s,Jugadores a){
        Camisola = d;
        Nombre = nombre;
        Posicion = posicion;
        Titular = titular;
        siguiente = s;
        anterior = a;
    }
    
}
