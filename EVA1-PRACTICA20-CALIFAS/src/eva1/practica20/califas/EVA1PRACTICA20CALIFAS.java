package eva1.practica20.califas;

import java.util.Scanner;

public class EVA1PRACTICA20CALIFAS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double califa;
        System.out.println("Introduce tu calificacion");
        califa = teclado.nextDouble();

        if (califa >= 90 && califa <= 100) {
            System.out.println("Tu nota es: A");
        } else if (califa >= 80 && califa <= 89) {
            System.out.println("Tu nota es: B");
        } else if (califa >= 70 && califa <= 79) {
            System.out.println("Tu nota es: C");
        } else if (califa >= 60 && califa <= 69) {
            System.out.println("Tu nota es: D");
        } else {
            System.out.println("Tu nota es: F");
        }

    }

}
