import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        int nu=1,ru=1,rus=1;
        int nur;
        double sonuc;

        System.out.print("Faktöriyel için iki sayı giriniz:");
        n = input.nextInt();
        r =input.nextInt();
        nur=n-r;

        for (int i=1;i<=n;i++)
        {
            nu=nu*i;

        }
        for (int i=1;i<=r;i++){
            ru=ru*i;

        }
        for (int i=1;i<=nur;i++)
        {
            rus=rus*i;

        }
        sonuc = nu/(ru*rus);
        System.out.println("C("+n+","+r+") 'in sonucu: "+sonuc);
    }
}