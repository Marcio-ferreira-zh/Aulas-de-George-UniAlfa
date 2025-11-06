import java.util.Scanner;
import java.text.DecimalFormat;

public class Quest6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Escreva o valor desejado que gostaria de saber quanto vale em R$: ");
        Double Real = sc.nextDouble();
         System.out.println("Escreva a cotação do dolar atualmente..");
        Double Cota = sc.nextDouble();
        double Vc = Real/Cota;
                System.out.println(" O valor convertido para dolar dá: "+ df.format(Vc)+ " Dolares.");
        sc.close();
    }
}
