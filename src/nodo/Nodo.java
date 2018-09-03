
package nodo;

public class Nodo{
    Nodo siguiente;
    Nodo delete;
    Persona Persona;

    public Nodo(Nodo siguiente, Nodo delete) {
        this.siguiente = null;
        this.delete = delete;
    }

    Nodo(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
       
        
        public Nodo pSiguiente(){
        
         return siguiente;
            
        }
        
        public Nodo Delete(){
         return delete;
            
        }
    
    
     
        
         

   
   //     virtual ~Lista();

    void siguiente(Nodo temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

    

   


    
}

