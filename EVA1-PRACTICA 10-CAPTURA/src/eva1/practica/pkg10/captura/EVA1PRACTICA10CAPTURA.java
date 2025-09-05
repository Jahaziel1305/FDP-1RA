package eva1.practica.pkg10.captura;

import java.util.Scanner;

public class EVA1PRACTICA10CAPTURA {

    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        Double velocidad, distancia, tiempo;
        Scanner input = new Scanner(System.in);
        //CAPTURA DE DATOS
        System.out.println("Introduce la distancia en metros: ");
        distancia = input.nextDouble();
        System.out.println("Introduce el tiempo en segundos: ");
        tiempo = input.nextDouble();
        velocidad = distancia / tiempo;
        //DATOS CAPTURADOS
        System.out.println("La distancia capturada es: " + distancia);
        System.out.println("El tiempo capturado es: " + tiempo);
        System.out.print("La velocidad es :" + velocidad + " m/s");

    }

}
