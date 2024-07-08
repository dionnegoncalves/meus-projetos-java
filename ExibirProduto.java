import java.io.IOException;
import java.util.Scanner;

public class ExibirProduto {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        int opcaoMenu = 1, codProduto;

        while (opcaoMenu == 1) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("* CONSULTA DE PRODUTOS *");
            System.out.println("1 - Consultar produto");
            System.out.println("2 - Sair do programa");
            System.out.print(">>>>> Escolha uma opção: ");
            opcaoMenu = scan.nextInt();

            // se o usuário digitou 1, entra na pesquisa de proutos
            if (opcaoMenu == 1) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("* MENU DE PESQUISA DE PRODUTOS *");
                System.out.print(">>>>> Código do produto: ");
                codProduto = scan.nextInt();

                switch (codProduto) {
                    case 5478: 
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("* RESULTADO DA BUSCA *");
                        System.out.println(">>>>> O produto selecionado foi: Arroz 5kg");
                        System.out.println(">>>>> Preço unitário: R$ 15,90");
                       break;
                
                    default:
                        break;
                        
                }
                scan.nextLine(); // limpa o buffer do scanner
                System.out.print("\n##### Pressione ENTER para CONTINUAR #####");
                scan.nextLine();

            } else if (opcaoMenu == 2) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println(">>>>> Até a próxima <<<<<");

                scan.nextLine();  // limpa o buffer do scanner
                System.out.println("\n##### Pressione ENTER para FINALIZAR #####\n");
                scan.nextLine();
            }
        }
        scan.close();
    }
}
