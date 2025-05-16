import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatura em Ceusius?");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em fahrenheit é: " + fahrenheit);

    }
}

