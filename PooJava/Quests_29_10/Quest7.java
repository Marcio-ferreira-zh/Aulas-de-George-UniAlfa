import java.util.Scanner;

public class Quest7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o comprimento  do retangulo: ");
        int B = sc.nextInt();
        System.out.println("Escreva a altura do retangulo: ");
        int h = sc.nextInt();

        int A = B * h ;
        System.out.println("A Area do retangulo é: "+ A + ("m³"));
        sc.close();
    }
}
