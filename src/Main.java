public class Main {
    public static void main(String[] args) {

        //Creamos el objeto y le damos datos
        Persona papa = new Persona();
        papa.setNombre("Paco");
        papa.setEdad(55);
        papa.setTelefono(666666666);

        //Imprimimos los datos
        System.out.println(papa.getNombre());
        System.out.println(papa.getEdad());
        System.out.println(papa.getTelefono());
    }
}


