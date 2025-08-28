package pe.edu.upeu.herencia;

public class carro extends  Vehiculo {

    public static void main(String[] args) {
        carro c = new carro();
        System.out.println("caracteristicas:");
        c.marca="toyota";
        System.out.println("Marca"+c.marca);
        System.out.println("modelo"+c.marca);
        System.out.println("color:"+"no se puede heredar"+
                        "por ser privado");
        c.sonido();

    }
}
