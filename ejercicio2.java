/* Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/

public class ejercicio2 {
    public static void main(String[] args) {
        coche Elcoche = new coche();
        Elcoche.ContarPuertas();

        System.out.println(Elcoche.puertas + " Puerta");

    }

}

class coche {
    int puertas = 0;

    public void ContarPuertas() {
        this.puertas++;
    }

}