import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat arredondamento = new DecimalFormat("0,00");
        System.out.println(" Informe o primeiro numero para realizar a soma: ");
        Double primeiroValor = input.nextDouble();
        System.out.println("Informe um segundo valor para realizar a soma: ");
        Double segundoValor = input.nextDouble();
        Double resultadoSoma = primeiroValor + segundoValor;

        System.out.println("O resultado da soma de " + primeiroValor + " e do " + segundoValor + " é " + resultadoSoma);
    }
}
