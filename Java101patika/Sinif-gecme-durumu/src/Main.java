import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double mat, fizik,turkce,kimya,muzik;
      double toplam = 0.0;
        System.out.print("Matematik notu:");
      mat = input.nextDouble();
      if((mat<=100) &&(mat>=0)){
        toplam +=mat;
      }else {
        toplam += 0;
      }
        System.out.print("Fizik notu:");
      fizik =input.nextDouble();
      if((fizik<=100) &&(fizik>=0)){
        toplam +=fizik;
      }else {
        toplam += 0;
      }
        System.out.print("Türkçe notu:");
      turkce =input.nextDouble();
      if((turkce<=100) &&(turkce>=0)){
        toplam +=turkce;
      }else {
        toplam += 0;
      }
        System.out.print("Kimya notu:");
      kimya =input.nextDouble();
      if((kimya<=100) &&(kimya>=0)){
        toplam +=kimya;
      }else {
        toplam += 0;
      }
        System.out.print("wMüzik notu:");
      muzik =input.nextDouble();
      if((muzik<=100) &&(muzik>=0)){
        toplam +=muzik;
      }else {
        toplam += 0;
      }

      System.out.println("Ortalama:"+ toplam/5);
    }
}