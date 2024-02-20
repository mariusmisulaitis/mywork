package generics1;

public class Main {
    public static void main(String[] args) {

        Integer[] skaiciai = {1, 2, 3};
        String[] zodziai = {"Hello", "World"};

        spausdintiBendraInfo(skaiciai, zodziai);

    }

    public static <T> void spausdintiBendraInfo(T[] masyvas1, T[] masyvas2) {
        spausdintiMasyvoInfo(masyvas1);
        spausdintiMasyvoInfo(masyvas2);
    }

    private static <T> void spausdintiMasyvoInfo(T[] masyvas) {
        for (T elementas : masyvas) {
            System.out.println(elementas + " ");
        }
        System.out.println();
    }
}
