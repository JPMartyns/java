package src.ficha3;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int Y = scanner.nextInt();

        System.out.println("O número Antecessor é: " + (Y-1) + "\nE o Sucessor é: " + (Y+1));
    }
}
