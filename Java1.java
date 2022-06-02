public class Java1 {
    public static void main(String[] args) {
        System.out.println("Bilangan Habis dibagi 3 dan 5");
        for(int i = 1; i <= 50; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0));
            else if ((i % 3) == 0) System.out.println("Habis Dibagi 3");
            else if ((i % 5) == 0) System.out.println("Habis Dibagi 5");
            else System.out.println(i);
        }
        System.out.println();
    }
}
