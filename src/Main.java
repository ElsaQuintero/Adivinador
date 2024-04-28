import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adivina adivinador el número entero del 1 al 100 en 5 intentos!");
        Scanner teclado = new Scanner(System.in);
        int num = new Random().nextInt(100);
        int i = 0;

            while (i < 5) {
                System.out.println("Intenta adivinar");
                int intento = teclado.nextInt();
                i++;

                if (intento == num) {
                    System.out.println("Adivinaste el número en " + i + " intentos");
                    break;
                } else if( intento < num){
                    System.out.println("El número que escribiste es menor que el secreto");
                } else {
                    System.out.println("El número que escribiste es mayor que el secreto");
                }
            }

            if (i == 5) {
                System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + num);
            }
    }
}