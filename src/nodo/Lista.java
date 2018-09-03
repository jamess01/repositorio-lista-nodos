/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import static java.nio.file.Files.delete;

/**
 *
 * @author Jaime
 */
public class Lista extends Persona{
    int contador;
    int cantidad,posicion;
    Nodo aux;
    Nodo nuevo;
    Nodo inicio;
    protected Nodo aux (){
        return null;
        
    }
    protected Nodo nuevo(){
        return null;
        
    }
    
    protected Nodo inicio(){
        return null;
        
    }
    
    
    public Lista Deleted(){
        return null;
        
    }
    
    
    @Override
        void Suicidar (Persona persona){
            
        }
    @Override
        void Ensenar (Persona persona){
            
        }
    @Override
     public Nodo Mostrar(){
            return null;
        }
        
    @Override
        public Persona Buscar(char inicial){
         return null;
            
        }
    @Override
        public boolean Modificar (Nodo update){
         return false;
          
        }
        
       
    
    public Lista(char inicial, int peso, int edad, double altura) {
        super(inicial, peso, edad, altura);
    }
    
    
    public Lista Lista(){
        aux = nuevo= inicio = null;
        cantidad =  posicion =0;
        return null;
    }
    
    @Override
     public void Nacer (Persona persona){
        nuevo =new Nodo(null,null);
        if (cantidad==0){
            inicio = nuevo.pSiguiente();
        } else{
            aux = inicio;
            while(aux.siguiente != 0 )
                posicion++;
        }
        aux = nuevo;
        nuevo.Persona = persona;
        cantidad++;
    }
     
     
     public void Suicidar(Object obj){
        if(obj == null){
            obj = new Nodo(obj);
        }else{
            Nodo temp = (Nodo) obj;
            Nodo nuevo = new Nodo(obj);
            nuevo.siguiente(temp);
            obj = nuevo;
        }
        
        contador++;
    }
     
     
  
     public void Enseñar(Persona persona){
     }
}
