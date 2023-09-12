import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kenarları giriniz:");

        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();

        int cevre = a + b + c;
        int u = cevre/2;
        int Alan = u*(u-a)*(u-b)*(u-c);

        System.out.println("Üçgenin çevresi:" + cevre + "\nÜçgenin alanı:" +Alan);

    }
}
