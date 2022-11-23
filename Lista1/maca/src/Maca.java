import java.util.Scanner;

public class Maca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas maçãs você comprará?");
        int quantidade = entrada.nextInt();

        double preco = 0;

        if (quantidade < 12)
            preco = 1.3;
        else
            preco = 1;

        double total = quantidade * preco;
        System.out.println("O valor da compra é de R$ " + total);
        entrada.close();
    }
}
