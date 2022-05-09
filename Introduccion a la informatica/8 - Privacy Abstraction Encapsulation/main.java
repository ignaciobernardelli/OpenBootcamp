/*Encapsulation*/
public class Main {
    public static void main(String[] args) {
        Persona myPersona = new Persona();
        myPersona.setEdad(38);
        myPersona.setNombre("Nacho");
        myPersona.setTelefono(1122334455);

        System.out.println("Edad: " + myPersona.getEdad());
        System.out.println("Nombre: " + myPersona.getNombre());
        System.out.println("Telefono: " + myPersona.getTelefono());
    }

    public static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        //Getter
        public int getEdad(){
            return edad;
        }
        public String getNombre(){
            return nombre;
        }
        public int getTelefono(){
            return telefono;
        }

        //Setter
        public void setEdad(int newEdad){
            this.edad = newEdad;
        }
        public void setNombre(String newNombre){
            this.nombre = newNombre;
        }
        public void setTelefono(int newTelefono){
            this.telefono = newTelefono;
        }

    }
}