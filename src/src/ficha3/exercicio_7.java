package src.ficha3;
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Qual a altura da parede?");
       float A = scanner.nextFloat();

        System.out.println("Qual o comprimento da parede?");
        float C = scanner.nextFloat();

        System.out.println("A área da parede é: " + (A*C)+ " m².");

        System.out.println("Serão necessários " + (A*C)/2 + " litros de tinta para pintar esta parede.");
    }
}
