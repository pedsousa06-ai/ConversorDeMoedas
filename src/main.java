import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("         Conversor de Moedas"            );
        System.out.println("      VALORES DE COTAÇÃO PARA REAL (BRL)");
        System.out.println("----------------------------------------");
        System.out.println("     Dolar para real = 5,45 "            );
        System.out.println("     Euro para Real = 6,39"              );
        System.out.println("     Iene para Real = 0,037"             );
        System.out.println("     Peso Argentino para Real = 0,0040"  );
        System.out.println("     Libras para Real = 0,11"         );
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.print("Digite o nome da sua moeda de origem: ");
        String moedaOriginal = scanner.nextLine();
        System.out.println("----------------------------------------");


        System.out.println("----------------------------------------");
        System.out.print("Digite o nome da moeda que deseja converter: ");
        String moedaDesejada = scanner.nextLine();
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.print("Quantas moedas você deseja converter: ");
        double converter = scanner.nextInt();
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.print("Digite o valor de cotação da moeda desejada: ");
        double valor;
        valor = scanner.nextDouble();
        System.out.println("----------------------------------------");

        double cotacao;
        cotacao = converter / valor;
        String cotacaoreal = String.format("%.2f",cotacao);


        System.out.print("O valor da conversão de " + moedaOriginal + " para " + moedaDesejada + " é de: " + cotacaoreal);

        scanner.close();
    }
}