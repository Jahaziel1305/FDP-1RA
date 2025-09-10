package com.mycompany.eva1.practica15.mayor;

import java.util.Scanner;

public class EVA1PRACTICA15MAYOR {

    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Introduce el primer número: ");
        Scanner xd = new Scanner(System.in);
        num1 = xd.nextInt();

        System.out.println("Introduce el segundo número para determinar si es mayor o menor al primero: ");
        num2 = xd.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + ">" + num2);
        } else {
            System.out.println(num1 + "<" + num2);
        }

    }
}
