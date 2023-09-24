import java.util.Scanner;

public class Main {
    /* static boolean isPalindrome(String str){
          int i=0,j=str.length()-1;
          while (i<j){
              if(str.charAt(i)!=str.charAt(j)){
                  return false ;
              }
              i++;
              j--;
          }
          return true;
      }*/
    static boolean isPalindrome(String word)
    {
        String reverse ="";
        for (int i = word.length()-1;i>=0;i--){
            reverse+= (word.charAt(i));
        }
        if (word.equals(reverse)){
            return true;}
        else{
            return false;}
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word =inp.nextLine();
        System.out.println(isPalindrome(word));
    }
}