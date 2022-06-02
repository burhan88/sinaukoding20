public class Java1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.print("Angka");
            else if ((i % 3) == 0) System.out.println("Habis Dibagi 3");
            else if ((i % 5) == 0) System.out.println("Habis Dibagi 5");
            else System.out.println(i);
        }
    }
}
