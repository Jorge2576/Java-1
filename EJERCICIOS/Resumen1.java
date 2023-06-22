import java.util.Scanner;

/**
 *
 * @author hmj03
 */
public class Resumen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumaTotal = 0;
        int suma = 0;
        int filas = 4;
        int columnas = 4;
        
        
        int [][] matriz = new int[filas][columnas];
        
        System.out.println("Elija una operecion:");
        System.out.println("1. Calcular la suma de los elementos");
        System.out.println("2. Calcular el promedio de los elementos");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        
        do{
            switch (opcion){
                case 1:
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {        
                            System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }
                    for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                 suma += matriz[i][j];
                            }                     
                        }
                    System.out.println("La suma de los elementos es: " + suma);
                    System.out.println();
                    System.out.println("Elija una operecion:");
                    System.out.println("1. Calcular la suma de los elementos");
                    System.out.println("2. Calcular el promedio de los elementos");
                    System.out.println("3. Salir");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                        
                break;
                case 2: 
                    for (int i = 0; i < filas; i++) {
                        
                        for (int j = 0; j < columnas; j++) {
                            System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }
                    for (int i = 0; i < filas; i++) {
                        
                        for (int j = 0; j < columnas; j++) {
                            sumaTotal += matriz[i][j];
                        }
                    }
                        int totalElementos = filas * columnas;
                        double promedio = (double) sumaTotal / totalElementos;

                        System.out.println("El promedio de los elementos es: " + promedio);
                        System.out.println();
                        System.out.println();
                        System.out.println("Elija una operecion:");
                        System.out.println("1. Calcular la suma de los elementos");
                        System.out.println("2. Calcular el promedio de los elementos");
                        System.out.println("3. Salir");
                        System.out.print("Opción: ");
                        opcion = sc.nextInt();
                break;
                case 3:
                        System.out.println("¡Hasta luego!");
                break;
                default: 
                        System.out.println("Opción inválida. Intente nuevamente.");
                        System.out.println("Elija una operecion:");
                        System.out.println("1. Calcular la suma de los elementos");
                        System.out.println("2. Calcular el promedio de los elementos");
                        System.out.println("3. Salir");
                        System.out.print("Opción: ");
                        opcion = sc.nextInt();
                break;
            
                } 
            
        } while(opcion != 3);
       
        
  
    }
    
}