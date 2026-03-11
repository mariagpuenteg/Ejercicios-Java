import java.util.Scanner; // Importar la clase Scanner para leer datos

public class Calculadora {
    public static void main(String[] args) {
        
        //creacion de objeto para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // solicitar numeros
        System.out.print("Introduce primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce segundo número: ");
        double num2 = scanner.nextDouble();

        // Menu de opciones
        System.out.println("Selecciona una operación: (+, -, *, /)");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacionValida = true;

        // switch para decidir la operación
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Manejo de división entre 0
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error, No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no valida.");
                operacionValida = false;
        }

        // Mostrar resultado
        if (operacionValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
