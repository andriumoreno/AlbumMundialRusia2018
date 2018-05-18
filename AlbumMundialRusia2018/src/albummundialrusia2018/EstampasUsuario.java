
package albummundialrusia2018;

public class EstampasUsuario {
    int dato;
    EstampasUsuario siguiente;
    EstampasUsuario anterior;
    public EstampasUsuario (int d){
        this(d,null,null);
    }
    
    public EstampasUsuario(int d,EstampasUsuario s,EstampasUsuario a){
        dato = d;
        siguiente = s;
        anterior = a;
    }
    
}
