
package albummundialrusia2018;

import javax.swing.JOptionPane;

public class ListaUsuarios {
    UsuariosNodo inicio,fin;
    String Mostrar;
    int mostrar=0;
    
    UsuariosNodo auxiliar = inicio;
    public ListaUsuarios(){
        inicio=fin= null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    
    public void agregaralfinal(int d,String nombre,String correo,String usuario,int contraseña){
        if(!vacia()){
            fin = new  UsuariosNodo( d, nombre,correo, usuario,contraseña,null,fin);
            fin.anterior.siguiente= fin;
        }else{
            inicio=fin= new  UsuariosNodo( d, nombre,correo, usuario,contraseña);
        }
    }
    
    public void agregaralinicio(int d,String nombre,String correo,String usuario,int contraseña){
        if(!vacia()){
            inicio = new  UsuariosNodo( d, nombre,correo, usuario,contraseña,fin,null);
            inicio.siguiente.anterior= inicio;
        }else{
            inicio=fin= new  UsuariosNodo( d,  nombre, correo, usuario, contraseña);
        }
    }
    
    public void mostrar(){
            Mostrar = Mostrar + " " +auxiliar.Nombre;
            auxiliar = auxiliar.siguiente;  
            if(auxiliar!=null){
            mostrar();
            }
    }
    
    public void mostrar2(){
         if(!vacia()){
            UsuariosNodo auxiliar = fin;
            while(auxiliar!=null){
            Mostrar = Mostrar + " " +auxiliar.Nombre;
            auxiliar = auxiliar.anterior; 
            
            }
           JOptionPane.showMessageDialog(null,"la lista es: " +Mostrar,"lista",JOptionPane.INFORMATION_MESSAGE);  
           Mostrar = null;
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
    
    public void eliminar(String Nombre){
       UsuariosNodo Random = inicio;
       while(Random != null){
           if(Random.Nombre.equals(Nombre)){
               Random.siguiente.anterior = Random.anterior;
               Random.anterior.siguiente = Random.siguiente; 
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    public void modificar(String nombre){
       UsuariosNodo Random = inicio;
       while(Random != null){
           if(Random.Nombre.equals(nombre)){
              Random.Nombre = JOptionPane.showInputDialog(null,"numero de usuario"); 
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    
}
