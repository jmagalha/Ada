import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");
        String nome = entrada.next();
        System.out.println("Qual a quantidade comprada?");
        int quantidade = entrada.nextInt();
        System.out.println("Qual o preço unitário?");
        double preco = entrada.nextDouble();

        double total = quantidade * preco;
        double desconto = 0;

        if (quantidade <= 5)
            desconto = 2;
        else if (quantidade > 5 && quantidade < 10){
            desconto = 3;
        } else
            desconto = 5;

        double valordesconto = total * (desconto / 100);
        double valorfinal = total - valordesconto;

        System.out.println("O valor total foi de R$ " + total);
        System.out.println("O desconto foi de " + desconto + "%");
        System.out.println("O total a pagar é de R$ " + valorfinal);
        entrada.close();
    }
}
