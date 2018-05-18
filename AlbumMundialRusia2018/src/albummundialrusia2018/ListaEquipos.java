
package albummundialrusia2018;

import javax.swing.JOptionPane;

public class ListaEquipos {
    Equipos inicio,fin;
    String Mostrar;
    int mostrar=0;
    
    Equipos auxiliar = inicio;
    public ListaEquipos(){
        inicio=fin= null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    
    public void agregaralfinal(int d,String nombre,int ganados){
        if(!vacia()){
            fin = new Equipos(d,nombre,ganados,null,fin);
            fin.anterior.siguiente= fin;
        }else{
            inicio=fin= new Equipos(d,nombre,ganados);
        }
    }
    
    public void agregaralinicio(int d,String nombre,int ganados){
        if(!vacia()){
            inicio = new Equipos(d,nombre,ganados,fin,null);
            inicio.siguiente.anterior= inicio;
        }else{
            inicio=fin= new Equipos(d,nombre,ganados);
        }
    }
    
    public void mostrar(){
            Mostrar = Mostrar + " " +auxiliar.Nombre_equipo;
            auxiliar = auxiliar.siguiente;  
            if(auxiliar!=null){
            mostrar();
            }
    }
    
    public void mostrar2(){
         if(!vacia()){
            Equipos auxiliar = fin;
            while(auxiliar!=null){
            Mostrar = Mostrar + " " +auxiliar.Nombre_equipo;
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
    
    public void eliminar(String nombre){
       Equipos Random = inicio;
       while(Random != null){
           if(Random.Nombre_equipo.equals(nombre)){
               Random.siguiente.anterior = Random.anterior;
               Random.anterior.siguiente = Random.siguiente; 
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    
    public void modificar(String nombre){
       Equipos Random = inicio;
       while(Random != null){
           if(Random.Nombre_equipo.equals(nombre)){
               System.out.println("Entro");
           }
           Random = Random.siguiente;
       }
       System.out.println("Salir");
    }
    
}
