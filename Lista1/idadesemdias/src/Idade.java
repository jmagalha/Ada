import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos ver quantos dias você tem de vida.");
        System.out.println("Primeiro informe quantos anos já viveu:");
        int anos = entrada.nextInt();
        System.out.println("Agora informe quantos meses você possui neste último ano");
        int meses = entrada.nextInt();
        System.out.println("Por último, quantos dias neste último mês:");
        int dias = entrada.nextInt();

        int diasanos = anos * 365;
        int diasmeses = meses * 30;

        int totaldias = diasanos + diasmeses + dias;

        System.out.println("Você tem " + totaldias + " dias de vida.");
        entrada.close();

    }
}
