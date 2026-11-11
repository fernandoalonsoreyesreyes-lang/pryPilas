package ejemplopila1;

public class PilaNombres {
    final int MAX = 3;
    String[] pila;
    int tope;
    
    public PilaNombres(){
        pila = new String[MAX];
        tope = -1;
    }
    
    private boolean pilaVacia(){
        return (tope == -1);
    }
    
    private boolean pilaLlena(){
        return (tope == (MAX - 1));
    }
    
    public String pone(String dato){
        if(pilaLlena())
            return "Pila llena";
        else{
            tope++;
            pila[tope] = dato;
            return "Elemento insertado en la pila"; 
        }                                
    }   
    
    public String quita(){
        String dato;
        if(pilaVacia()){
            return "Subdesbordamiento - Pila Vacia";
        }
        else{
            dato = pila[tope];
            tope--;
            return dato;
        }
    }
    
    public void mostrar() {
        if (pilaVacia()) {
            System.out.println("La pila está vacía, no hay elementos que mostrar.");
        } else {
            System.out.println("\n--- Elementos en la Pila (del fondo al tope) ---");
            for (int i = 0; i <= tope; i++) {
                System.out.println("[" + i + "] -> " + pila[i]);
            }
        }
    }
}