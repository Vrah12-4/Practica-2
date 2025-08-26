package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {

    public static void main(String[] args) {
        Persona p = new Persona();
        //p.nombre = "Vladimir";
        //p.apellido = "Ronald";
        p.setNombre("Vladimir");
        p.setEdad(25);
        p.apellido = "apaza";
        p.saludo();

        Persona p2 = new Persona("vladimir", "apaza", 25);
        p2.saludo();


        Trabajador t = new Trabajador();
        t.setNombre("vladimir");
        t.setEdad(25);
        t.setApellido("apaza");
        t.setArea("sistemas");
        t.setGenero('M');
        System.out.println(t);
    }
}