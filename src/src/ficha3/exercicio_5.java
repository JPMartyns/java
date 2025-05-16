package src.ficha3;
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma medida em metros: ");
        float X = scanner.nextFloat();

        System.out.println("A área do quadrado é: " + (X * X) + " m².\nE o perímetro do quadrado é: " + (X * 4) + " m.");
    }
}
