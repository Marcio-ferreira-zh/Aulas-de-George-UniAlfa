import java.util.Scanner;

public class Quest5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int Id = sc.nextInt();

        if (Id >= 18) {
            System.out.println("Você é maior de idade,tendo " + Id + " anos");
        } else{
            System.out.println(" Você é menor de idade, tendo " + Id +" anos");

        }




        sc.close();
    }
}
