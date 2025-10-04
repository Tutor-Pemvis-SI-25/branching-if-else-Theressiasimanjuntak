//12S25029-Theressia Olivia Simanjuntak
//12S25026-Andre Bonaran Situngkir
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b1, bil2, c1, c2;

        b1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (b1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (b1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b1 == bil2) {
                System.out.println("Kedua bilangan sama besar");
            } else {
                System.out.println("Bilangan kedua lebih besar");
            }
        }
        if (b1 % 2 == 0 && bil2 % 2 == 0) {
            c1 = b1 + bil2;
            System.out.println("Hasil penjumlahan: " + c1);
        } else {
            if (b1 % 2 != 0 && bil2 % 2 != 0) {
                c2 = b1 * bil2;
                System.out.println("Hasil perkalian: " + c2);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
