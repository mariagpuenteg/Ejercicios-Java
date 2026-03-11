import java.time.Year;
import java.util.Scanner; 

public class HolaProgramador {
//metodo statico principal (main) metodo que se ejecuta 
    public static void main(String[] args) {
        // declaracion de objeto (Scanner lee datos)
        //instanciando un objeto de tipo scanner 
        Scanner scanner = new Scanner(System.in);

        //Solicitar y leer el nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); 

        //leer y solicitar la edad
        System.out.print("Ingresa edad: ");
        int edad = scanner.nextInt();

        //calcular el año de nacimiento -> debemos obtener el año actual automaticamente
        int añoActual = Year.now().getValue();
        int añoNacimiento = añoActual - edad;

        //imprimir el mensaje final concatenando las variables
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java! :), naciste en el año " + añoNacimiento + "");

        scanner.close();
    }
}