package eva1.practica16.anidad;

import java.util.Scanner;

public class EVA1PRACTICA16ANIDAD {

    public static void main(String[] args) {
        int dia;
        Scanner xd = new Scanner(System.in);
        System.out.println("Captura el numero del dia de la semana: ");
        dia = xd.nextInt();
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Lunes");
        } else if (dia == 3) {
            System.out.println("Martes");
        } else if (dia == 4) {
            System.out.println("Miercoles");
        } else if (dia == 5) {
            System.out.println("Jueves");
        } else if (dia == 6) {
            System.out.println("Viernes");
        } else if (dia == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Numero no valido");
        }

    }

}
