import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        String entrada;
        boolean continuar = true;

        System.out.println("sumador de numeros ");
        System.out.println("escribe numeros para sumar. escribe 'no' para terminar.");

        while (continuar) {
            System.out.print("introduce un numero o 'no': ");
            entrada = scanner.nextLine();

            //comprobar si el usuario quiere terminar
            if (entrada.equalsIgnoreCase("no")) {
                continuar = false;
            } else {
                try {
                    double numero = Double.parseDouble(entrada);
                    suma += numero;
                    contador++;
                } catch (NumberFormatException e) {
                    System.out.println("entrada invalida. introduce un numero o 'no'.");
                }
            }
        }

        System.out.println("--------------------------");
        System.out.println("total de numeros ingresados: " + contador);
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
