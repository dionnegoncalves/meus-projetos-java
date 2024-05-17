import java.util.Scanner; // classe responsável por ler o teclado do usuário

public class Fatorial {
    public static void main(String[] args) {
        int numero=0, fat=1;

        // Chama a classe Scanner para dentro do programa 
        Scanner scanner = new Scanner(System.in);

        // Pedir para usuário digitar um nº
        System.out.print("Digite um número: ");

        // Capturar o que o usuário digitar
        numero = scanner.nextInt();
        
        // fazer loop para multiplicar os valores do fatorial
        for (int i=numero; i>1; i--) {
            fat = fat * i;
            //fat *= i;
        }

        // Exibindo o resultado
        System.out.print("O fatorial de " + numero + " é " + fat);

        scanner.close();


    }
}
