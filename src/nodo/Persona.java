
package nodo;

public class Persona {
   protected char inicial;
   protected int peso;
   protected int edad;
   protected double altura;
   
   public void Persona(Persona persona){
       
   }

    public Persona(char inicial, int peso, int edad, double altura) {
        this.inicial = inicial;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
         public Nodo Mostrar(){
            return null;
        }
        
        public Persona Buscar(char inicial){
         return null;
            
        }
        public boolean Modificar (Nodo update){
         return true;
          
        }
         public void Nacer(Persona persona){
            
        }
        void Suicidar (Persona persona){
            
        }
        void Ensenar (Persona persona){
            
        }
   
}
