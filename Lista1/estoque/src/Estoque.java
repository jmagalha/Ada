import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade atual no estoque?");
        int estoqueatual = entrada.nextInt();
        System.out.println("Qual a quantidade máxima do estoque?");
        int estoquemaximo = entrada.nextInt();
        System.out.println("Qual a quantidade mínimo do estoque?");
        int estoqueminimo = entrada.nextInt();

        double media = (estoquemaximo + estoqueminimo) / 2;
        System.out.println("Quantidade média do estoque é de " + media);

        if (estoqueatual >= media)
            System.out.println("Não efetuar compra");
        else
            System.out.println("Efetuar compra");
        entrada.close();
    }
}
