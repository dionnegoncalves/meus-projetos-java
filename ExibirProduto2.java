import java.io.IOException;
import java.util.Scanner; // chamando a classe Scanner

public class ExibirProduto2 {
    public static void main (String[] args) throws IOException, InterruptedException{
        Scanner scan = new Scanner(System.in); // instanciando a classe em variável
        int opcaoMenu=1, codProduto;

        // enquanto o usuário digitar 1, deve exibir o MENU
        while (opcaoMenu == 1) {
            // criar menu neste ponto
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpar a tela (não necessário)
            System.out.println("* CONSULTA DE PRODUTOS *");
            System.out.println("1 - Consultar produto");
            System.out.println("2 - Sair do programa");

            // peço para o user digitar uma opção
            System.out.print(">>>>> Escolha uma opção: ");
            opcaoMenu = scan.nextInt(); // lendo a opção que o user digitou

            if (opcaoMenu == 1) {
                // exibir a consulta de produto
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpar a tela (não necessário)
                System.out.println("* MENU DE PESQUISA DE PRODUTOS *");
                System.out.print(">>>>> Código do produto: ");
                codProduto = scan.nextInt(); // capturando o codigo do produto e jogando na variável codProduto

                switch (codProduto) {

                    // criar os índices dos produtos em cada caso
                    case 5478: 
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpar a tela (não necessário)
                        System.out.println("* RESULTADO DA BUSCA *");
                        System.out.println(">>>>> O produto selecionado foi: Arroz 5kg");
                        System.out.println(">>>>> Preço unitário: R$ 15,90");
                        scan.nextLine(); // limpa o buffer do scanner
                        System.out.print("\n##### Pressione ENTER para CONTINUAR #####");
                        scan.nextLine();
                    break;

                    default: 
                        System.out.println("Opção digitada não existe");
                        scan.nextLine(); // limpa o buffer do scanner
                        System.out.print("\n##### Pressione ENTER para CONTINUAR #####");
                        scan.nextLine();
                    break;
                }

            } else if (opcaoMenu == 2) {
                // exibe informando que está saindo pgm
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpar a tela (não necessário)
                System.out.println(">>>>> Saindo do programa em 3...2...1");
                scan.nextLine(); // limpa o buffer do scanner
                System.out.print("\n##### Pressione ENTER para SAIR #####");
                scan.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpar a tela (não necessário)2

            }
        }
        scan.close();
    }
}