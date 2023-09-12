import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        //Değişkenlerimizi oluşturuyoruz.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scaner sınıfımızı tanımladık.
        Scanner inp =new Scanner(System.in);

        //Kullanıcıdan değeleri al.
        System.out.print("Matematik notunuz:");
        mat =inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik =inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya =inp.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce =inp.nextInt();

        System.out.print("Tarih notunuz:");
        tarih =inp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik =inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce +tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println(sonuc > 60.0);
    }
}
