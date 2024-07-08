import java.util.Scanner; // importando a classe responsável pela leitura de teclado

public class SelecionarPlanoCelular {
    public static void main (String[] args) {

        // declarando a variável que receberá a opção que o usuário digitar
        int opcao;

        // instanciando a classe Scanner para ser utilizada (ler o que o usuário digitar)
        Scanner scan = new Scanner(System.in);

        // exibindo menu para o usuário na tela
        System.out.println("Selecione o plano de celular que você deseja:");
        System.out.println("1 - Plano Básico (5Gb Youtube)");
        System.out.println("2 - Plano Plus (Adição de WhatsApp e Instagram grátis)");
        System.out.println("3 - Plano Premium (Adição de 100 minutos de ligação)\n");

        System.out.print("OPÇÃO: ");
        
        // captura o que o usuário digitar
        opcao = scan.nextInt();

        // de acordo com a opção que o usuário escolher, o programa escolhe um dos "cases"
        switch(opcao) {
            case 1: System.out.println("Parabéns! O plano selecionado foi: \nPlano Básico (5GB Youtube)");
            break;

            case 2: System.out.println("Parabéns! O plano selecionado foi: \nPlano Plus (Adição de WhatsApp e Instagram grátis)");
            break;

            case 3: System.out.println("Parabéns! O plano selecionado foi: \nPlano Premium (Adição de 100 minutos de ligação)");
            break;

            // caso o usuário digite uma opção que não se encontra nos "cases" - o programa exibe o que está no default
            default: System.out.println("A opção digitada não corresponde a nenhum plano.");
            break;
        }

        // finalizando a utilização da classe Scanner para fechar o objeto e recursos da JVM 
        scan.close();
    }
}
