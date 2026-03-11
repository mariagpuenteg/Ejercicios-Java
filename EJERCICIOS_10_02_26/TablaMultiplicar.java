import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pedir el numero de la tabla
        System.out.print("¿Qué tabla de multiplicar quieres ver? ");
        int numero = scanner.nextInt();
        
        //pedir hasta que numero multiplicar
        System.out.print("¿Hasta que numero quieres multiplicar? ");
        int limite = scanner.nextInt();
        
        System.out.println("\n--- Tabla del " + numero + " (hasta el " + limite + ") ---");
        
        // bucle for para calcular y mostrar la tabla
        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        System.out.println("---------------------------------");
        scanner.close();
    }
}

