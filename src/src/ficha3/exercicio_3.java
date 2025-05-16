package src.ficha3;
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ensira a 1ª nota:");
        float nota1 = scanner.nextFloat();

        System.out.println("Ensira a 2ª nota:");
        float nota2 = scanner.nextFloat();

        System.out.println("A sua média é: " + (nota1 + nota2) / 2);



    }

}
