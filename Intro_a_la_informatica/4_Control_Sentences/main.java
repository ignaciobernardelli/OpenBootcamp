/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.

También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

public class Main {
    public static void main(String[] args) {

        /*IF*/
        var numeroIf = 3;
        if (numeroIf == 0) {
            System.out.println("El numero es cero");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        /*Bucle While*/
        var numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /*Bucle Do While*/
        do {
            System.out.println(numeroWhile);
        }
        while (numeroWhile == 0);

        /*Bucle For*/
        var numeroFor = 0;
        for (;numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        /*Switch*/
        var estacion = "calor";
        switch(estacion) {
            case "verano":
                System.out.println("Estas en verano");
                break;
            case "invierno":
                System.out.println("Estas en invierno");
                break;
            case "otoño":
                System.out.println("Estas en otoño");
                break;
            case "primavera":
                System.out.println("Estas en primavera");
                break;
            default:
                System.out.println("Eso no es una estacion");
        }
    }
}