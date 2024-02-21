package generics2b.medis.tipas;

import generics2b.medis.Medis;

public class Lapuotis extends Medis {
    public Lapuotis(String pavadinimas) {
        super(pavadinimas);
    }

    @Override
    public void turi() {
        System.out.println(super.toString() + " turi lapus");
    }
}

