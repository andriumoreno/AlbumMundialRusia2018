
package albummundialrusia2018;

public class UsuariosNodo {
    int Cui;
    String Nombre;
    String Correo;
    String Usuario;
    int Contraseña;
    
    UsuariosNodo siguiente;
    UsuariosNodo anterior;
    
    public UsuariosNodo(int d, String nombre,String correo,String usuario,int contraseña){
        this(d,nombre,correo,usuario,contraseña,null,null);
    }
    
    public UsuariosNodo(int d,String nombre,String correo,String usuario,int contraseña,UsuariosNodo s,UsuariosNodo a){
        Contraseña = contraseña;
        Usuario = usuario;
        Correo = correo;
        Nombre = nombre;
        Cui = d;
        siguiente = s;
        anterior = a;
    }
    
}
