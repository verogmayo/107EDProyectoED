//Programa en Java que toma dos números y devuelve la suma
import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        sc.close();
    }
}
