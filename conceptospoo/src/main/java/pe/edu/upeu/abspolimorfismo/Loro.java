package pe.edu.upeu.abspolimorfismo;

public class Loro extends Animal {

    @Override
    void emitirsonido() {
        System.out.println("miau.....miau...");

    }
    @Override
    void dormir() {
        super.dormir();
        System.out.println("dejame dormir.."+
                "Zzzz.....Zzzz..");
    }



}
