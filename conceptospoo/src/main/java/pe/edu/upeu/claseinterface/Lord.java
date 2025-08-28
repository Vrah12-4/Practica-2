package pe.edu.upeu.claseinterface;

public class Lord implements Animal {
    @Override
    public void emitirsonido() {
        System.out.println("hola amigo, no seas flojo");
    }

    @Override
    public void dormir() {
        System.out.println("no molestar que me da Zzz.....Zzzz..");

    }
}
