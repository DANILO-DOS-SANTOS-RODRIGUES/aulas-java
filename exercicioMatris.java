import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioMatris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        System.out.println("Insira o primeiro nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o segundo nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o terceiro nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o quarto nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o quinto nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o sexto nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o setimo nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o oitavo nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o nono nome: ");
        listaNomes.add(input.next());
        System.out.println("Insira o decimo  nome: ");
        listaNomes.add(input.next());

        System.out.println(listaNomes);
    }
}
