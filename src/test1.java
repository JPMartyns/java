import java.util.Scanner;

public class test1 {
    public static void main(String[] args){      //  main + TAB

        String bem_vindo = "Olá...Seja Bem Vindo!";

        Scanner scanner = new Scanner(System.in);

        System.out.println(bem_vindo);
        System.out.println();

        System.out.println("Qual o teu nome e idade?");
        String nome= scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.println("Bem vindo " + nome + ", com idade de " + idade + " anos. És um jovem!");


    }
}
