import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura fahrenheit?");
        double fahr = entrada.nextDouble();

        double celsius = ((fahr - 32) / 9) * 5;

        System.out.println("Temperatura em graus Celsius: " + celsius);
        entrada.close();
    }
}
