import java.util.Scanner;

public class Java3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Java3 j = new Java3();
        String lg = "y";
        while (lg.equals("y")) {

            System.out.println("Silahkan pilih menu untuk menghitung luas : ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("Masukkan Pilihan anda : ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    j.persegi();
                    break;
                case 2:
                    j.persegipanjang();
                    break;
                case 3:
                    j.segitiga();
                    break;
                case 4:
                    j.lingkaran();
                    break;
                default:
                    System.out.println("WARNING : Pilihan anda tidak terdaftar");
            }
            System.out.println("Apakah anda ingin memilih menu lagi (y/t)? ");
            lg = in.next();
        }
        System.out.println("Terima Kasih");
    }
    void persegi(){
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Masukkan Sisi: ");
        int s = in.nextInt();
        int luas = s*s;
        System.out.println("Luas dari Persegi dengan sisi " + s + " adalah " + luas);
    }
    void segitiga(){
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan Alas: ");
        double a = in.nextInt();
        System.out.print("Masukkan Tinggi: ");
        double t = in.nextInt();
        double luas = (a*t)/2;
        System.out.println("Luas dari Segitiga dengan alas " + a + " dan tinggi " + t + " adalah " + luas);
    }
    void persegipanjang(){
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang: ");
        int p= in.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = in.nextInt();
        int luas = p*l;
        System.out.println("Luas dari Persegi Panjang dengan " + p + " dan lebar " + l +" adalah " + luas);
    }
    void lingkaran(){
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan Rusuk: ");
        double r = in.nextInt();
        double luas = 22/7*r*r;
        System.out.println("Luas dari Lingkaran dengan rusuk " + r +" adalah " + luas);
    }
}
