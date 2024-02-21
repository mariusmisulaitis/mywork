package generics2a;

import generics2a.medis.sulapais.Azuolas;
import generics2a.medis.sulapais.Berzas;
import generics2a.medis.suspygliais.Egle;
import generics2a.medis.suspygliais.Kadagys;
import generics2a.medis.suspygliais.Pusis;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        azuolas.turi();

        Egle egle = new Egle();
        egle.turi();

        Kadagys kadagys = new Kadagys();
        kadagys.turi();

        Pusis pusis = new Pusis();
        pusis.turi();

        Berzas berzas = new Berzas();
        berzas.turi();
    }
}
