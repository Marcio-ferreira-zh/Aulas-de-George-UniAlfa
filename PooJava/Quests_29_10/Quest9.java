import java.util.Scanner;
public class Quest9 {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o número 1");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0){
        System.out.println("Seu número é par");
        }else{
            System.out.println("Seu número é impar");
        }
   
       sc.close();  
    }
}
