import java.util.Scanner;

public class Java4 {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    String lg = "y";
        while (lg.equals("y")) {
        System.out.println("Silahkan pilih menu untuk menghitung luas dan keliling : \n1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran ");
        System.out.print("Masukkan Pilihan anda : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                while (lg.equals("y")) {
                System.out.print("Masukkan Nilai Sisinya : ");
                double s = in.nextDouble();
                Persegi p = new Persegi();
                p.HPersegi(s);
                while (lg.equals("y")) {
                    System.out.print("Pilih Menu \n 1. Luas \n 2. Keliling \n Masukkan Pilihan Anda : ");
                    int menu = in.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Hasil Luas Persegi : " + p.luas());
                            break;
                        case 2:
                            System.out.println("Hasil Keliling Persegi : " + p.keliling());
                            break;
                    }
                    System.out.println("Apakah anda ingin melihat hasil luas keliling dengan sisi " + s + " lagi (y/t)? ");
                    lg = in.next();
                }
                    System.out.println("Apakah anda ingin memasukkan nilai sisi lagi pada bangun persegi  (y/t)? ");
                    lg = in.next();
                }
                break;
            case 2:
                while (lg.equals("y")) {
                System.out.print("Masukkan Nilai Panjang : ");
                double pa = in.nextDouble();
                System.out.print("Masukkan Nilai Lebar : ");
                double l = in.nextDouble();
                PersegiPanjang pp = new PersegiPanjang();
                pp.HPersegiPanjang(pa,l);
                while (lg.equals("y")) {
                    System.out.print("Pilih Menu \n 1. Luas \n 2. Keliling \n Masukkan Pilihan Anda : ");
                    int menu = in.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Hasil Luas Persegi Panjang : " + pp.luas());
                            break;
                        case 2:
                            System.out.println("Hasil Keliling Persegi Panjang: " + pp.keliling());
                            break;
                    }
                    System.out.println("Apakah anda ingin melihat hasil luas atau keliling pada bangun persegi panjang dengan panjang " + pa + " lebar " +l+" lagi (y/t)? ");
                    lg = in.next();
                }
                    System.out.println("Apakah anda ingin memasukkan nilai panjang dan lebar pada bangun persegi panjang (y/t)? ");
                    lg = in.next();
                }
                break;
            case 3:
                while (lg.equals("y")) {
                    System.out.print("Masukkan Nilai Sisi Alas : ");
                    double sa = in.nextDouble();
                    System.out.print("Masukkan Nilai Sisi Tinggi : ");
                    double st = in.nextDouble();
                    System.out.print("Masukkan Nilai Sisi Miring : ");
                    double sm = in.nextDouble();
                    Segitiga se = new Segitiga();
                    se.HSegitiga(sa,st,sm);
                    while (lg.equals("y")) {
                        System.out.print("Pilih Menu \n 1. Luas \n 2. Keliling \n Masukkan Pilihan Anda : ");
                        int menu = in.nextInt();
                        switch (menu){
                            case 1:
                                System.out.println("Hasil Luas Segitiga : " + se.luas());
                                break;
                            case 2:
                                System.out.println("Hasil Keliling Segitiga: " + se.keliling());
                                break;
                        }
                        System.out.println("Apakah anda ingin melihat hasil luas atau keliling bangun segitiga dengan masing-masing sisi " + sa + " , " + st + " , " + sm +" lagi (y/t)? ");
                        lg = in.next();
                    }
                    System.out.println("Apakah anda ingin memasukkan nilai masing - masing sisi lainnya pada bangun segitiga (y/t)? ");
                    lg = in.next();
                }
                break;
            case 4:
                while (lg.equals("y")) {
                    System.out.print("Masukkan Nilai Rusuk : ");
                    double r = in.nextDouble();
                    Lingkaran l = new Lingkaran();
                    l.HLingkaran(r);
                    while (lg.equals("y")) {
                        System.out.print("Pilih Menu \n 1. Luas \n 2. Keliling \n Masukkan Pilihan Anda : ");
                        int menu = in.nextInt();
                        switch (menu){
                            case 1:
                                System.out.println("Hasil Luas Lingkaran : " + l.luas());
                                break;
                            case 2:
                                System.out.println("Hasil Keliling Lingkaran: " + l.keliling());
                                break;
                        }
                        System.out.println("Apakah anda ingin melihat hasil luas atau keliling Lingkaran dengan rusuk " + r  +" lagi (y/t)? ");
                        lg = in.next();
                    }
                    System.out.println("Apakah anda ingin memasukkan nilai rusuk pada bangun Lingkaran (y/t)? ");
                    lg = in.next();
                }
                break;
            default:
                System.out.println("WARNING : Pilihan anda tidak terdaftar");
        }
        System.out.println("Apakah anda ingin memilih menu bangun datar lagi (y/t)? ");
        lg = in.next();
    }
        System.out.println("Terima Kasih");
}
}
interface BangunDatar{

}
class Persegi implements BangunDatar{
    double s;
    public void HPersegi(double s){
        this.s=s;
    }
    public double luas(){
        return s*s;
    }
    public double keliling(){
        return s*4;
    }
}

class PersegiPanjang implements BangunDatar{
    double pa;
    double l;
    public void HPersegiPanjang(double pa, double l){
        this.pa=pa;
        this.l=l;
    }
    public double luas(){
        return pa*l;
    }
    public double keliling(){
        return 2*(pa+l);
    }
}
class Segitiga implements BangunDatar{
    double sa; //Sisi Alas
    double st; //Sisi Tinggi
    double sm; //Sisi Miring
    public void HSegitiga(double sa, double st, double sm){
        this.sa=sa;
        this.st=st;
        this.sm=sm;
    }
    public double luas(){
        return (sa*st)/2;
    }
    public double keliling(){
        return sa+st+sm;
    }
}

class Lingkaran implements BangunDatar{
    double r;
    public void HLingkaran(double r){
        this.r=r;
    }
    public double luas(){
        return (22*r*r)/7;
    }
    public double keliling(){
        return (22*2*r)/7;
    }
}
