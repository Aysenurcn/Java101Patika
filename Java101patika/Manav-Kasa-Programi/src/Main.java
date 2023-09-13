import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int armut, muz, elma, dometes,patlican;
       double newarmut, newmuz, newelma, newdomates, newpatlican;
       double sArmut = 2.14 ;
        double sElma =3.67 ;
        double sDomates = 1.11 ;
        double sMuz= 0.95 ;
        double sPatlıcan = 5.00;

        System.out.print("Armut kaç kilo aldınız: ");
        armut = inp.nextInt();
        newarmut = sArmut*armut;

        System.out.print("Elma kaç kilo aldınız: ");
        elma = inp.nextInt();
        newelma = sElma*elma;

        System.out.print("Dometes kaç kilo aldınız: ");
        dometes = inp.nextInt();
        newdomates = sDomates*dometes;

        System.out.print("Muz kaç kilo aldınız: ");
        muz = inp.nextInt();
        newmuz =sMuz*muz;

        System.out.print("Patlıcan kaç kilo aldınız: ");
        patlican = inp.nextInt();
        newpatlican=sPatlıcan*patlican;

        System.out.println("Armut tutarı:"+ newarmut +"TL\nElma tutarı:"+newelma+"TL\nDomates tutarı:"+newdomates+"TL\nMuz tutarı:"
                +newmuz+"TL\nPatlıcan tutarı:"+newpatlican);
    }
}