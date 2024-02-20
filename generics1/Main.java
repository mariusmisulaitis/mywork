package generics1;


public class Main {
    public static void main(String[] args) {

        Integer[] skaiciai = {1, 2, 3};
        String[] zodziai = {"Hello", "World"};

        spausdintiInfo(skaiciai, zodziai);

    }

    public static <T> void spausdintiInfo(T[]... masyvai) {
        for (T[] masyvas : masyvai) {
            for (T elementas : masyvas) {
                System.out.println(elementas + " ");
            }
            System.out.println();
        }
    }
}
