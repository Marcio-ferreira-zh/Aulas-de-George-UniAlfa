import java.util.Scanner;
public class Quest12 {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        Double n1 = sc.nextDouble();
        
        if (n1>0){
            System.out.println (" O número é positivo. ");
        }
        if (n1<0) {
            System.out.println("O número é negativo.");
        }
        if (n1==0) {
            System.out.println("O número é zero");
        }

   
       sc.close();  
    }
}

