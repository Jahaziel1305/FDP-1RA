package com.mycompany.eva1.practica13.lf;

import java.util.Scanner;

public class EVA1PRACTICA13Lf {

    public static void main(String[] args) {
        int edad;
        System.out.println("Introduce tu edad: ");
        Scanner xd = new Scanner(System.in);
        edad = xd.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes comprar alcohol");
        } else {
            System.out.println("No puedes comprar alcohol");
        }

    }
}
