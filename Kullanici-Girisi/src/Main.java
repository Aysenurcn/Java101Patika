import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String cashPassword = "";

        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adı giriniz=");
        userName = input.nextLine();
        System.out.print("Şifreyi sıfırlamak için 1'ye basınız\nBu aşamayı geçmek için 2'e basınız.\n");
        select = input.nextInt();

        if(select == 1) {
            cashPassword = input.nextLine();

        }else {
            System.out.println("Bu işlem geçildi.");

        }
        Scanner inp = new Scanner(System.in);
        System.out.println("Şifreniz=");
        password = inp.nextLine();

            if (userName.equals("patika") && (password.equals("java123") || (password.equals(cashPassword))))
            {
                System.out.println("Giriş yaptınız.");
            }else {
                System.out.println("Bilgileriniz yanlış.");
            }
        }
}