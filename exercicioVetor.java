import java.util.Scanner;

public class exercicioVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          String[] listaNomes = new String[5];
//        listaProdutosInformatica[0] = "Monitor";
//        listaProdutosInformatica[1] = "Caixa de som";
//        listaProdutosInformatica[2] = "Mouse";
//        listaProdutosInformatica[3] = "Teclado";
//        listaProdutosInformatica[4] = "Gabinete";
//        listaProdutosInformatica[5] = "Pendrive";
//        listaProdutosInformatica[6] = "Hd";
//        listaProdutosInformatica[7] = "Ssd";
//        listaProdutosInformatica[8] = "Televisão";
//        listaProdutosInformatica[9] = "Placa de video";
//        listaProdutosInformatica[10] = "Memoria";
//        listaProdutosInformatica[11] = "Celular";
//        listaProdutosInformatica[12] = "Placa-mãe";
//        listaProdutosInformatica[13] = "Fonte";
//        listaProdutosInformatica[14] = "Fan";
//        listaProdutosInformatica[15] = "Cooler";
//        listaProdutosInformatica[16] = "Fita led";
//        listaProdutosInformatica[17] = "Controladora RGB";
//        listaProdutosInformatica[18] = "Kit cabos";
//        listaProdutosInformatica[19] = "Smartwatch";
//        listaProdutosInformatica[20] = "Notebook";
//
//        System.out.println("Produtos de informatica:" );
        System.out.println("Insira o primeiro nome: ");
        listaNomes[0] = input.nextLine();
        System.out.println("Insira o segundo nome: ");
        listaNomes[1] = input.nextLine();
        System.out.println("Insira o terceiro nome: ");
        listaNomes[2] = input.nextLine();
        System.out.println("Insira o quarto nome: ");
        listaNomes[3] = input.nextLine();
        System.out.println("Insira o quinto nome: ");
        listaNomes[4] = input.next();

        System.out.println("Informe o nome que quer buscar: ");
        String nomeBusca = input.nextLine();
        //String listaNomesCompleta = listaNomes[ ];
//        if(nomeBusca.equals(listaNomesCompleta)){
//
//        }

    }
}
