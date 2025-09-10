package com.mycompany.eva1.practica12.lf;

import java.util.Scanner;

public class EVA1PRACTICA12LF {

    public static void main(String[] args) {
        int califa;
        System.out.println("Introduce tu calificación: ");
        Scanner xd = new Scanner(System.in);
        califa = xd.nextInt();
        if (califa >= 70) {
            System.out.println("Acreditaste la materia");
        } else {
            System.out.println("No acreditaste la materia");
        }

    }
}
