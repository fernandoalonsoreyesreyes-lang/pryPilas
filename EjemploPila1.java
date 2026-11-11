package ejemplopila1;

import java.util.Scanner;

/**
 *
 * @author BRS
 * Descripción: Ejemplificar el uso de pilas. en este proyecto crear una pila
 *          de 10 elementos que inserte nombres de personas.
 * FEcha: 28/10/2026
 */
public class EjemploPila1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaNombres objPila = new PilaNombres(); 
        Scanner leer = new Scanner(System.in); 
        int opcion = 0;
        
        do {
            System.out.println("\n===========================");
            System.out.println("      MENU DE PILA         ");
            System.out.println("===========================");
            System.out.println("1. Poner elemento en la Pila");
            System.out.println("2. Quitar elemento de la pila");
            System.out.println("3. Mostrar elementos de la pila");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre a insertar: ");
                        String nombre = leer.nextLine();
                        System.out.println(objPila.pone(nombre));
                        break;
                        
                    case 2:
                        System.out.println("Elemento extraido: " + objPila.quita());
                        break;
                        
                    case 3:
                        objPila.mostrar();
                        break;
                        
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                        
                    default:
                        System.out.println("Opcion no valida. Intenta de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un numero valido.");
                leer.next(); // Limpiar entrada incorrecta
            }
            
        } while (opcion != 4);
        
        leer.close();
    
        
    }
    
}
