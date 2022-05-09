public class Main {
    public static void main(String[] args) {
        
        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

    }

    public static class Coche {
        public int numeroDePuertas = 4;

        public void sumarPuertas(){
            this.numeroDePuertas++;
        }
    }
}
