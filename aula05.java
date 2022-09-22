import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma palavra ou frase: ");
        String frasePalavra = input.nextLine();
        System.out.println("Informe um numero inteiro: ");
        Integer numeroInteiro = input.nextInt();
        System.out.println("Informe um numero real: ");
        Float numeroReal = input.nextFloat();

        System.out.println("As informações inseridas foram: \n" + "Numero inteiro: " + numeroInteiro + "\n" + "Numero real: " + numeroReal + "\n" + "Palavra/frase: " + frasePalavra );

    }
}
