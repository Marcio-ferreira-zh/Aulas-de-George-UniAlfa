import java.util.Scanner;
public class Quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escreva o n1");
        double n1 = sc.nextDouble();

        System.out.println ("Escreva o  n2");
        double n2 = sc.nextDouble();

        System.out.println("Escreva o n3");
        double n3 = sc.nextDouble();

        double R = (n1 + n2 + n3)/3;

        System.out.println(" A sua média é foi de: " + R );
        
        sc.close();
    }
}
