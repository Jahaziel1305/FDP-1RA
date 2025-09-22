import java.util.Scanner;

public class EVA1PRACTICA24AGUILASELLO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Usuario;
        double random = Math.random();
        System.out.println("Aguila o sello? (1=Aguila/0=Sello)");
        Usuario = teclado.nextInt();
        if (Usuario != 0 && Usuario != 1) {
            System.out.println("Valor invalido. Debes ingresar 1 si deseas aguila o 0 si deseas sello");
        } else
            System.out.println(random);
        if (Usuario == 1) {
            System.out.println("Has escogido aguila");
            if (random >= .5) {
                System.out.println("Has ganado!");
            } else {
                System.out.println("Has perdido!");
            }
        } else if (Usuario == 0) {
            System.out.println("Has escogido sello");
            if (random < .5) {
                System.out.println("Has ganado!");
            } else {
                System.out.println("Has perdido!");
            }
        }
    }
}