import java.util.Scanner;
public class Quest11 {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        Double n1 = sc.nextDouble();
        
        System.out.print("Escreva o segundo número: ");
        Double n2 = sc.nextDouble();
        
        System.out.print("Escreva o terceiro número: ");
        Double n3 = sc.nextDouble();
        
        double menor = n1;
        
        if (n2<menor) {
            menor = n2;
        }
        if  (n3 < menor){
            menor = 3;
         }
             System.out.println("O menor número é: "+menor);
   
       sc.close();  
    }
}
