public class NumPares {
    public static void main(String[] args) {
        

        System.out.println("Numeros pares del 1 al 100:");

       int contadorPares = 0; //variable para contar los pares

        //for 
        for (int i = 1; i <= 100; i++) {
            // Condicion para saber si los numeros son divisibles entre 2
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contadorPares++;
            }
        }

        System.out.println("\n\nTotal de numeros pares: " + contadorPares);
    }
}

