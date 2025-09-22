public class EVA1PRACTICA23CONVERSIONES {
    public static void main(String[] args) {
        double tempDecimal = 25.8;
        int temp = (int) tempDecimal;
        System.out.println(temp);

        String cade, mensaje;
        mensaje = "La temperatura es: ";
        cade = mensaje + temp; // Concatenacion
        System.out.println(cade);
    }
}
