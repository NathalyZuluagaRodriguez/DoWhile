import java.util.Scanner;

public class DoWhileSeg {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número positivo: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("El número no es positivo. Inténtalo de nuevo.");
            }
        } while (numero < 0);

        System.out.println("Número positivo introducido: " + numero);
        entrada.close();
    }
}
