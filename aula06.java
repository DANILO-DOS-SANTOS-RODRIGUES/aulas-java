import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um primeiro valor para ser realizado a compração: ");
        Double primeiroValor = input.nextDouble();
        System.out.println("Informe um segundo valor para realizar a comparação: ");
        Double segundoValor = input.nextDouble();

        if(primeiroValor>segundoValor){
            System.out.println(" O valor " + primeiroValor + " é maior que o " + segundoValor);

        } else if(primeiroValor.equals(segundoValor)){
            System.out.println("O valor " + primeiroValor + " é igual " + segundoValor );
        }else{
            System.out.println("O valor " + segundoValor + " é maior que o " + primeiroValor );
        }
    }
}
