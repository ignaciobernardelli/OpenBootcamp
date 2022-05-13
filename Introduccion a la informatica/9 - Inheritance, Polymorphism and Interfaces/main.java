/* Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 38;
        cliente.nombre = "Panchito";
        cliente.telefono = 11223344;
        cliente.credito = 350000;

        System.out.println("Nombre cliente : " + cliente.nombre);
        System.out.println("Edad cliente : " + cliente.edad);
        System.out.println("Telefono cliente : " + cliente.telefono);
        System.out.println("Credito cliente : " + cliente.credito);

        trabajador.edad = 25;
        trabajador.nombre = "Juancito";
        trabajador.telefono = 338884455;
        trabajador.salario = 50000;

        System.out.println("Nombre trabajador : " + trabajador.nombre);
        System.out.println("Edad trabajador : " + trabajador.edad);
        System.out.println("Telefono trabajador : " + trabajador.telefono);
        System.out.println("Credito trabajador : " + trabajador.salario);
    }

    static class Persona {
        int edad;
        String nombre;
        int telefono;
    }

    static class Cliente extends Persona {
        int credito;
    }

    static class Trabajador extends Persona {
        double salario;
    }
}

