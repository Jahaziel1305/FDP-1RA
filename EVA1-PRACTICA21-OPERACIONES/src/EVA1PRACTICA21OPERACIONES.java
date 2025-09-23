public class EVA1PRACTICA21OPERACIONES {
    public static void main(String[] args) {
        int valor = 2, expo = 3;
        double resultado;
        resultado = Math.pow(valor, expo);
        System.out.println("2 al cubo es = " + resultado);

        int valor2 = 100;
        double resultado2;
        resultado2 = Math.sqrt(valor2);
        System.out.println("Raiz cuadrada de 100 es = " + resultado2);

        int valor3 = 125;
        double resultado3;
        resultado3 = Math.pow(valor3, 1.0 / 3.0);
        System.out.println("La raiz cubica de 125 es = " + resultado3);
        System.out.println(1 / 3); // <----Java lo interpreta como solamente entero
        System.out.println(1.0 / 3.0); // <---Se le agrega el decimal para que Java entienda que queremos decimales

    }
}