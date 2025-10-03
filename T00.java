12S25029-Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b1, bil2, c1, c2;

        b1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (b1 % 2 == 0) {
            System.out.println(Integer.toString(b1) + "bilangan genap");
        } else {
            System.out.println(Integer.toString(b1) + "bilangan ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println(Integer.toString(bil2) + "bilangan genap");
        } else {
            System.out.println(Integer.toString(bil2) + "bilangan ganjil");
        }
        if (b1 > bil2) {
            System.out.println(Integer.toString(b1) + "lebih besar dari" + bil2);
        } else {
            if (b1 == bil2) {
                System.out.println(Integer.toString(b1) + "=" + bil2);
            } else {
                System.out.println(Integer.toString(b1) + "lebih kecil" + bil2);
            }
        }
        if (b1 % 2 == 0 && bil2 % 2 == 0) {
            c1 = b1 + bil2;
            System.out.println(c1);
        } else {
            if (b1 % 2 == 0 && bil2 % 2 == 0 && b1 % 2 != 0 && bil2 % 2 != 0) {
                c2 = b1 * bil2;
                System.out.println(c2);
            } else {
                System.out.println("beda jenis");
            }
        }
    }
}
