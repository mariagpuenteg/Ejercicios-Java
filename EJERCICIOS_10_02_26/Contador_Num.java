import java.util.Scanner;

public class Contador_Num {
    public static void main(String[] args) {
        // objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);
        
        //pedir que ingrese el dato
        System.out.print("Introduce un numero entero: ");
        int numeroIngresado = scanner.nextInt(); //numeroingresado es tu variable 
        
         //inicializar variables para el bucle y la suma
        int sumaTotal = 0;
        
        System.out.println("numeros del 1 al " + numeroIngresado + ":");
        
        // bucle for para mostrar nmeros y calcular la suma
        for (int i = 1; i <= numeroIngresado; i++) {
            System.out.print(i + " "); // muestra el numero
            sumaTotal += i;           // acumula la suma (suma = suma + i)
        }
        
        //muestra la suma total
        System.out.println("\n-------------------------");
        System.out.println("La suma total es: " + sumaTotal);
        
        scanner.close();
        
    }
}
