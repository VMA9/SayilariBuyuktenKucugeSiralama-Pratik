import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralamaPratik {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Sayıları Büyükten Küçüğe Sıralar. Eşit İfadeler Yazılabilir.");

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a = input.nextInt();

        System.out.print("2. Sayı : ");
        b = input.nextInt();

        System.out.print("3. Sayı : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c ");
            } else if (c > b) {
                System.out.println("a > c > b ");
            }
        }
        if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c ");
            } else if (c > a) {
                System.out.println("b > c > a ");
            }
        }
        if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c > a > b ");
            } else if (b > a) {
                System.out.println("c > b > a ");
            }
        }
        if (a == b) {
            if (b < c) {
                System.out.println("c > a = b ");
            } else if (b > c) {
                System.out.println("a = b > c ");
            }
        }
        if (a == c) {
            if (a > b) {
                System.out.println("a = c > b ");
            } else if (b > a) {
                System.out.println("b > a = c ");
            }
        }
        if (b == c) {
            if (c > a) {
                System.out.println("b = c > a ");
            } else if (c < a) {
                System.out.println("a > b = c ");
            }
        }
        if (a == b){
            if(b == c){
                System.out.println("a = b = c");
            }
        }
        System.out.println("Başarılı bir şekilde sıralanmıştır. ");

    }
}
