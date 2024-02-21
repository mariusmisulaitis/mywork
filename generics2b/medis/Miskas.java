package generics2b.medis;

import generics2b.medis.sulapais.Berzas;
import generics2b.medis.tipas.Spygliuotis;

import java.util.List;

public class Miskas {
    public static <T extends Medis> void ivairusMiskas(List<T> medziai) {
        System.out.println("Ivairus miskas:");
        for (T medis : medziai) {
            medis.turi();
        }
    }

    public static <T extends Spygliuotis> void spygliuociuMiskas(List<T> medziai) {
        System.out.println("Spygliuociu miskas:");
        for (T medis : medziai) {
            medis.turi();
        }
    }

    public static void berzuMiskas(List<? extends Medis> medziai) {
        System.out.println("Berzu miskas:");
        for (Medis medis : medziai) {
            if (medis instanceof Berzas) {
                medis.turi();
            }
        }
    }
}
