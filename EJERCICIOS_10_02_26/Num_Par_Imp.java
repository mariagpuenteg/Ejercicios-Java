import java.util.Scanner;

public class Num_Par_Imp {
    public static void main(String[] args) {
        // objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce numero entero: ");
        int numero = scanner.nextInt();
        
        // verificar si es cero
        if (numero == 0) {
            System.out.println("El numero es cero (y es par).");
        } else {
            // verificar par o impar usando el operador modulo (%)
            if (numero % 2 == 0) {
                System.out.print("El numero " + numero + " es Par");
            } else {
                System.out.print("El numero " + numero + " es Impar");
            }
            
            // verificar si es positivo o negativo
            if (numero > 0) {
                System.out.println(" y Positivo.");
            } else {
                System.out.println(" y Negativo.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

