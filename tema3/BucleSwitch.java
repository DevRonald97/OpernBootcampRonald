/*Por último, para el Switch, deberás crear la variable estacion,
y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable
 estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la variable no sea una estación. */

public class BucleSwitch {
    public static void main(String[] args) {
        String estacion;
        estacion = "invierno";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otono":
                System.out.println("Es Otoño");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No existe ese estado del año");
                break;
        }
    }
}
