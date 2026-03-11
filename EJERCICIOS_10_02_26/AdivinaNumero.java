import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        int contadorIntentos = 0;
        boolean haAdivinado = false;
        //generar numero aleatorio entre 1 y 50
        Random random = new Random();
        int numeroSecreto = random.nextInt(50) + 1; 
        
        System.out.println("Bienvenido. Adivina el numero entre 1 y 50.");

        //bucle para solicitar intentos
        do {
            System.out.print("introduce tu numero: ");
            intento = scanner.nextInt();
            contadorIntentos++; 

            //operadores relacionales para pistas
            if (intento < numeroSecreto) {
                System.out.println("el numero secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("el numero secreto es menor.");
            } else {
                haAdivinado = true;
                System.out.println("Felicidades. Adivinaste en " + contadorIntentos + " intentos.");
            }
        } while (!haAdivinado);

        scanner.close();
    }
}
