package pe.edu.upeu.claseinterface;

public class gato implements Animal {
    @Override
    public void emitirsonido() {
        System.out.println("miau.....miau...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzzz...Zzzz..");

    }
}
