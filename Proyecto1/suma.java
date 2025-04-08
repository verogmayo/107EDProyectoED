import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float n1;
        float n2;

        System.out.println("Introduce el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        n2 = teclado.nextInt();

        float suma = n1 + n2;

        System.out.println("La suma es: " + suma);

        }
}
