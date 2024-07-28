
public class DoWhileTer {
	public static void main(String[] args) {
        int numero = 1;
        int suma = 0;

        do {
            suma += numero;
            numero++;
        } while (numero <= 3);

        System.out.println("La suma de los primeros 3 números naturales es: " + suma);
    }
}
