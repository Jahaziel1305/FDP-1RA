package eva1.practica9.captura;

import java.util.Scanner;

public class EVA1PRACTICA9CAPTURA {

    public static void main(String[] args) {
        //Declaracion de variables
        String nombre;
        int edad;
        Double promedio;
        System.out.println("Introduce tu nombre completo");
        //CAPTURA DE DATOS
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine(); //CAPTURA TEXTO ( nextLine(); )
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Captura tu promedio de preparatoria");
        promedio = input.nextDouble();
        //DATOS CAPTURADOS
        System.out.println("El nombre capturado es: " + nombre);
        System.out.println("La edad capturada es: " + edad);
        System.out.println("El promedio capturado es: " + promedio);
    }

}
