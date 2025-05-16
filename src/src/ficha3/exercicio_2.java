package src.ficha3;
import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu nome?");
        String nome = scanner.next();

        System.out.println("Seu sobrenome?");
        String sobrenome = scanner.next();

        System.out.println("Bem vindo " + nome + " " + sobrenome + "\nTenha um excelente dia!");

    }
}
