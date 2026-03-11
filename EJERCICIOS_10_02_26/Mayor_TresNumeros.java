import java.util.Scanner;

public class Mayor_TresNumeros {
    public static void main(String[] args) {
         // objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        // Pedir los numeros
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int num3 = scanner.nextInt();


        // Math.max permite comparar dos valores secuencialmente para poder encontrar el num mayor
        int maxMath = Math.max(num1, Math.max(num2, num3));
        System.out.println("El mayor es: " + maxMath);

        // verificar si hay números iguales
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los numeros son iguales.");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Hay numeros iguales entre ellos.");
        } else {
            System.out.println("Todos los numeros son distintos.");
        }

        scanner.close();
    }
}
