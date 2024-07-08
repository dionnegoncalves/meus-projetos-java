import java.util.Scanner; // chamando a classe Scanner para ler algo do teclado

public class MedidorTemperatura {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in); // instanciando a classe Scanner em uma variável para ser utilizada

        // variável que será responsável por receber a tempuratura digita pelo usuário
        int temperatura;

        System.out.print("Digite a temperatura atual: ");
        temperatura = scan.nextInt(); // lendo o que o usuário digitou no teclado

        // fazendo as comparações para descobrir qual será a mensagem o programa deve exibir paea o usuário
        if (temperatura< 0) {
            System.out.print("Cuidado! Poderá nevar na sua região.");
        } else if (temperatura >= 0 && temperatura <= 20) {
            System.out.print("Tempo! Possibilidade de ventos fortes.");
        } else if (temperatura >=21 && temperatura <= 30) {
            System.out.print("Tempo agradável durante todo o dia.");
        } else {
            System.out.print("Calor excessivo! Risco de insolação.");
        }

        // fechando o uso da classe Scanner
        scan.close();
    }
    
}
