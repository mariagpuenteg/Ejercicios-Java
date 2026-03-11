import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("\n--- Menu de operaciones ---");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            
            //leer la opcion del usuario
            opcion = sc.nextInt();

            //estructura switch 
            switch (opcion) {
                case 1:
                    System.out.print("ingrese primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese segundo nmero: ");
                    num2 = sc.nextDouble();
                    System.out.println("resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("ingrese primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("ingrese primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("saliendo del programa. ¡Adios!");
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo.");
            }

        } while (opcion != 4); //se repite si la opción no es 4

        sc.close();
    }
}
