import java.util.Scanner;
public class Quest10 {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        Double n1 = sc.nextDouble();
        
        System.out.print("Escreva o segundo número: ");
        Double n2 = sc.nextDouble();
        
        if (n1>n2) {
            System.out.println("O maior número é: "+n1);
        }else{
            System.out.println("O maior númeoro é : "+n2);
        }
   
       sc.close();  
    }
}
