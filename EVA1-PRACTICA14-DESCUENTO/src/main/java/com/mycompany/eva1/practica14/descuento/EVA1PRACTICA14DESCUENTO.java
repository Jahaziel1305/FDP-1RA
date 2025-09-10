package com.mycompany.eva1.practica14.descuento;

import java.util.Scanner;

public class EVA1PRACTICA14DESCUENTO {

    public static void main(String[] args) {
        double monto, montoTotal;
        System.out.println("Introduce el monto: ");
        Scanner xd = new Scanner(System.in);
        monto = xd.nextDouble();

        if (monto >= 1000) {
            montoTotal = monto - (monto * .15);
            System.out.println("Al ser un monto mayor de 1000 pesos tiene un descuento del 15%");
            System.out.println("Su monto total a pagar es: " + montoTotal);
        } else {
            System.out.println("Su monto a pagar es: " + monto);
        }

    }
}
