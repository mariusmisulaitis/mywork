package generics1;

public class Main {
    public static void main(String[] args) {

        Integer[] skaiciai = {1, 2, 3};
        String[] zodziai = {"Hello", "World"};

        spausdintiMasyvoInfo(skaiciai);
        spausdintiMasyvoInfo(zodziai);

    }

    private static <T> void spausdintiMasyvoInfo(T[] masyvas) {
        for (T elementas : masyvas) {
            System.out.println(elementas + " ");
        }
        System.out.println();
    }
}
