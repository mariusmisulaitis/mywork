package generics2b;

import generics2b.medis.Medis;
import generics2b.medis.Miskas;
import generics2b.medis.sulapais.Azuolas;
import generics2b.medis.sulapais.Berzas;
import generics2b.medis.suspygliais.Egle;
import generics2b.medis.suspygliais.Kadagys;
import generics2b.medis.suspygliais.Pusis;
import generics2b.medis.tipas.Spygliuotis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Medis> ivairusMedziai = new ArrayList<>();
        ivairusMedziai.add(new Kadagys("Kadagys"));
        ivairusMedziai.add(new Pusis("Pusis"));
        ivairusMedziai.add(new Egle("Egle"));
        ivairusMedziai.add(new Berzas("Berzas"));
        ivairusMedziai.add(new Azuolas("Azuolas"));


        List<Spygliuotis> spygliuociuMedziai = new ArrayList<>();
        spygliuociuMedziai.add(new Egle("Egle"));
        spygliuociuMedziai.add(new Pusis("Pusis"));
        spygliuociuMedziai.add(new Kadagys("Kadagys"));


        List<Medis> berzuMedziai = new ArrayList<>();
        berzuMedziai.add(new Berzas("Berzas"));
        berzuMedziai.add(new Pusis("Pusis"));
        berzuMedziai.add(new Kadagys("Kadagys"));


        Miskas.ivairusMiskas(ivairusMedziai);
        System.out.println();
        Miskas.spygliuociuMiskas(spygliuociuMedziai);
        System.out.println();
        Miskas.berzuMiskas(berzuMedziai);
    }
}
