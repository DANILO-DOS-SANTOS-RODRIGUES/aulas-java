import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //vetor uma lista com tamanho pré-definido para navegar posso colocar no terminal o que eu quero ou fazer um for
        String[] listaDeInformacoes = new String[10];
        listaDeInformacoes[0] = "Detergente";
        listaDeInformacoes[1] = "Chocolate";
        listaDeInformacoes[2] = "Sucrilhos";
        listaDeInformacoes[3] = "Arroz";
        listaDeInformacoes[5] = "Bacon";
        System.out.println(listaDeInformacoes[0] + " " + listaDeInformacoes[5]);
        listaDeInformacoes[6]=input.nextLine();
        listaDeInformacoes[7]= input.nextLine();
        System.out.println(listaDeInformacoes[6] + " " + listaDeInformacoes[7]);

        // matriz uma lista de tamanho indefinido pendendo ao infinito para navegar é necessario um for/estrutura de repetição
        List<String> listaInformacoes = new ArrayList<>();//é necessario fazer o inport de list e de ArrayList
        listaInformacoes.add("carteira");
        listaInformacoes.add("boné");
        listaInformacoes.add("lápis");
        listaInformacoes.add("mouse");
        listaInformacoes.add("oculos");
        listaInformacoes.add("lente");
        System.out.println(listaInformacoes.size());//.size tamanho da matriz
        System.out.println(listaInformacoes.contains("carteira"));//.contains() para mostrar/buscar um especifico
        listaInformacoes.add(input.nextLine());
        System.out.println(listaInformacoes);
        listaInformacoes.add(input.nextLine());
        System.out.println(listaInformacoes);
    }
}
