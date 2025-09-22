import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int ano;
        System.out.println("Introduce tu año: ");
        ano = teclado.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("El año es bisiesto");
        } else if (ano % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
