import java.util.Scanner;

public class suma2num1 {

       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Introduce el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        n2 = teclado.nextInt();

        int suma = n1 + n2;

        System.out.println("La suma es: " + suma);
    }
}
