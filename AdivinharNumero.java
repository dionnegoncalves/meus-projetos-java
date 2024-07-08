import java.util.Random; // chamando a classe responsável por gerar número aleatório
import java.util.Scanner; // chamando a classe que lê dados do teclado

public class AdivinharNumero {
    public static void main (String[] args) {
        // informando para o programa onde usarei as classes Random e Scanner (instanciando em variáveis)
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        
        // criando variáveis que serviram de apoio para pegar um número aleatório e capturar o que o usuário digitar
        int numeroAleatorio, numeroUsuario = 100;

        // inserindo um número aleatório de 0 a 10
        numeroAleatorio = rd.nextInt(); 

        // enquanto o numero aleatório for diferente do número que o usuário digitou o loop será executado, ou seja, somente qdo acertar q o loop para
        while (numeroAleatorio!=numeroUsuario) {
            System.out.print("Tente acertar o número de 0 a 10: ");
            // lendo o que o usuário digitou e jogando a info na variável numeroUsuario
            numeroUsuario = scan.nextInt();

            // caso o usuário digitou o número correto, imprime msg de sucesso e sai do loop
            if (numeroAleatorio == numeroUsuario) {
                System.out.println("Você acertou, o número aleatório é: " + numeroAleatorio);
            } else { // caso não tenha acertado, informa o erro e o loop continua até o usuário acertar
                System.out.println("Você errou!");
            }
        }
        // finalizando a utilização da classe Scanner para fechar o objeto e recursos da JVM 
        scan.close();
    }
}
