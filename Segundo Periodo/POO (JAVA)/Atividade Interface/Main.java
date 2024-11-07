import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

            Scanner menu = new Scanner (System.in);
            
            Scanner entrada = new Scanner (System.in);

            while (true) {            

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Ex Triangulo      |\n");
            System.out.print("| Opção 2 - EX Circulo        |\n");
            System.out.print("| Opção 3 - Ex quadrado       |\n");
            System.out.print("| Opção 4 - Ex Retangulo      |\n");
            System.out.print("| Opção 5 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 5) {
                System.out.print("\nAté logo!");
                menu.close();
                entrada.close();
                break;
            }

            switch (opcao) {
            case 1:
                System.out.println("\nOpção Calcula area Triangulo");
                System.out.print("\nDigite a base do Triangulo: ");
                double base = entrada.nextDouble();
                System.out.print("\nDigite a altura do Triangulo: ");
                double altura = entrada.nextDouble();
                Triangulo t = new Triangulo(altura, base);
                t.setAltura(altura);
                t.setBase(base);
                System.out.print("\nArea do Triangulo: "+ t.calculaArea());
                break;

            case 2:
                System.out.println("\nOpção Calcula area Circulo\n");
                System.out.print("\nDigite a Raio do Circulo: ");
                double raio = entrada.nextDouble();
                Circulo c = new Circulo(raio);
                c.setRaio(raio);
                System.out.print("\nArea do Triangulo: "+ c.calculaArea());
                break;

            case 3:
                System.out.println("\nOpção Calcula area quadrado\n");
                System.out.println("\nOpção Calcula area quadrado\n");
                System.out.print("\nDigite o Lado1 do quadrado: ");
                double lado1 = entrada.nextDouble();
                System.out.print("\nDigite o lado2 do quadrado: ");
                double lado2 = entrada.nextDouble();
                Quadrado q = new Quadrado(lado1, lado2);
                q.setLado1(lado1);
                q.setLado2(lado2);
                System.out.print("\nArea do Retangulo: "+ q.calculaArea());
                break;
            case 4:
                System.out.println("\nOpção Calcula area Retangulo\n");
                System.out.print("\nDigite o Lado1 do Retangulo: ");
                double lado3 = entrada.nextDouble();
                System.out.print("\nDigite o lado2 do Retangulo: ");
                double lado4 = entrada.nextDouble();
                Retangulo r = new Retangulo(lado3, lado4);
                r.setLado1(lado3);
                r.setLado2(lado4);
                System.out.print("\nArea do Retangulo: "+ r.calculaArea());
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
        }
    }
 }

}