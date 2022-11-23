import java.util.Scanner;

public class Podevotar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o ano atual?");
        int anoatual = entrada.nextInt();
        System.out.println("Qual ano você nasceu?");
        int nascimento = entrada.nextInt();

        int idade = anoatual - nascimento;

        if (idade < 18)
            System.out.println("Você não poderá votar este ano, pois tem menos de 18 anos.");
        else
            System.out.println("Você está apto(a) a votar este ano.");

        entrada.close();
    }
}
