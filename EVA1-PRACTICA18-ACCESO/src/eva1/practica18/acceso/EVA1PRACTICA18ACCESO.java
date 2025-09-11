package eva1.practica18.acceso;

import java.util.Scanner;

public class EVA1PRACTICA18ACCESO {
    //CONSTANTES

    final static String USUARIO = "jahaziel73";
    final static String PW = "130507";

    public static void main(String[] args) {
        String usu, contra;
        System.out.println("Introduce tu usuario: ");
        Scanner xd = new Scanner(System.in);
        usu = xd.nextLine();

        System.out.println("Contraseña: ");
        contra = xd.nextLine();

        if (usu.equals(USUARIO)) {
            System.out.println("El usuario es correcto");
            if (contra.equals(PW)) {
                System.out.println("ACCESO CONCEDIDO");
            } else {
                System.out.println("ACCESO DENEGADO");
            }
        } else {
            System.out.println("ACCESO DENEGADO");
        }

    }

}
