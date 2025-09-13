package com.mycompany.eva1.practica18.antro;

import java.util.Scanner;

public class EVA1PRACTICA18ANTRO {

    final static String INE = "Si";

    public static void main(String[] args) {
        int edad;
        String ine;
        System.out.println("Introduce tu edad: ");
        Scanner xd = new Scanner(System.in);
        edad = xd.nextInt();
        xd.nextLine(); //Para consumir el salto de linea de edad 
        if (edad >= 18) {
            System.out.println("Cuentas con tu identificación a la mano? (Si o No)");
            ine = xd.nextLine();
            if (ine.equalsIgnoreCase(ine)) {
                System.out.println("Adelante, puedes ingresar");
            } else {
                System.out.println("Necesitas una identificacion para poder pasar");

            }

        } else {
            System.out.println("Ocupas ser mayor de edad para ingresar");
        }
    }
}
