import java.util.Scanner;
import java.text.DecimalFormat;

public class Quest8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(" Escreva quantos minutos você quer converter: ");
        double M = sc.nextDouble();

        double Cc = M/60;
       
        System.out.println("Deu "+df.format(Cc)+ "Horas e minutos");
        sc.close();
    }
}
