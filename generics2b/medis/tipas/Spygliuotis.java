package generics2b.medis.tipas;

import generics2b.medis.Medis;

public class Spygliuotis extends Medis {
    public Spygliuotis(String pavadinimas) {
        super(pavadinimas);
    }

    @Override
    public void turi() {
        System.out.println(super.toString() + " turi spyglius");
    }
}
