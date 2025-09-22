import java.util.Scanner;

public class EVA1PRACTICA24AGUILASELLO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Usuario;
        double random = Math.random();
        System.out.println("Aguila o sello? (1/0)");
        Usuario = teclado.nextInt();
        System.out.println(random);

        if (Usuario == 1) {
            System.out.println("Has escogido Aguila");
            if (random >= .50) {
                System.out.println("Has ganado");

            } else {
                System.out.println("Has perdido");
            }

        } else if (Usuario == 0) {
            System.out.println("Has escogido sello");
            if (random <= .49) {
                System.out.println("Has ganado");
            } else {
                System.out.println("Has perdido");
            }
        }

    }

}
