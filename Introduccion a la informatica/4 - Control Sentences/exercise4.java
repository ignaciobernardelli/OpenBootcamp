/*Estructuras de control*/
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