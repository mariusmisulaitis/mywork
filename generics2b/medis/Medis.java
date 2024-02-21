package generics2b.medis;

public class Medis {
    private final String pavadinimas;

    public Medis(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void turi() {
        System.out.println(pavadinimas + " turi");
    }

    @Override
    public String toString() {
        return pavadinimas;
    }
}
