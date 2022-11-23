import java.util.Scanner;

public class Mediaaritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a primeira nota?");
        double nota1 = entrada.nextDouble();
        System.out.println("Qual a segunda nota?");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6)
            System.out.println("Parabéns você foi aprovado. Sua média foi: " + media);
        else
            System.out.println("Você foi reprovado. Sua média foi: " + media);
        entrada.close();
    }
}
