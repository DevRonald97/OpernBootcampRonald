/*Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores. */

public class ejercicio {
    public static void main(String[] args) {
        suma(10, 20, 30);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }
}
