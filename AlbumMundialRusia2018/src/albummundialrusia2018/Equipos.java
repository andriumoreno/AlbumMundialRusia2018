
package albummundialrusia2018;

public class Equipos {
    int Codigo;
    String Nombre_equipo;
    int Mundiales; 
    Equipos siguiente;
    Equipos anterior;
    ListaJugadores lista = new ListaJugadores();
    public Equipos(int d,String nombre,int ganados){
        this(d,nombre,ganados,null,null);
    }
    
    public Equipos(int d,String nombre,int ganados,Equipos s,Equipos a){
        Codigo = d;
        Nombre_equipo = nombre;
        Mundiales = ganados;
        siguiente = s;
        anterior = a;
    }
    
}
