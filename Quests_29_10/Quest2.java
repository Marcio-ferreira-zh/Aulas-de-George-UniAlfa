import java.util.Scanner;
public class Quest2 {
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println ("Escreva o  primeiro numero: ");
         int n1 = sc.nextInt();

         System.out.println ("Escreva o  segundo numero: ");
          int n2 =sc.nextInt();
          int R = n1 + n2;
        System.out.println(" O resultado entre a soma entre os dois é : " + R);

         sc.close();

    }
}