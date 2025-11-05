import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String N = sc.nextLine();
        System.out.println("Seu nome é :"+ N);
        
        sc.close();
    }
}
