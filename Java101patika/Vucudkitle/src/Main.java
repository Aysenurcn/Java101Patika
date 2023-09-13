import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kg,kitle;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz:");
        boy = inp.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kg = inp.nextDouble();
        kitle = kg/(boy* boy);
        System.out.println("Vücud kitle indeksiniz:"+ kitle);
    }
}