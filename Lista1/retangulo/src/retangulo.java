    import java.util.Scanner;

    public class retangulo {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a base do retângulo:");
            double base = entrada.nextDouble();
            System.out.println("Digite a altura do retângulo:");
            double altura = entrada.nextDouble();
            double area = base * altura;
            System.out.println("A Área do retângulo é:" + area);
            entrada.close();

        }
    }