import java.util.Scanner;
public class Java2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int angka, awal, akhir;

        System.out.println("Menampilkan Deret Bilangan Prima atau tidak: ");
        System.out.print("Masukkan angka pertama: ");
        awal= input.nextInt();
        System.out.print("Masukkan Angka Terakhir: ");
        akhir= input.nextInt();
        System.out.println("----------------------------------------------");
        for (int n=awal; n <= akhir; n++){
            angka=0;
            for (int j=1;j<=n; j++){
                if(n%j==0){
                    angka=angka+1;
                }
            }
            if(angka==2){
                System.out.println( n + " : Bilangan Prima");
            }
            else {
                System.out.println(n + " : Bukan Bilangan Prima");
            }
        }
    }
}
