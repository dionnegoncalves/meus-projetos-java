import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Digite um nome: ");
        nome = scanner.nextLine();
        System.out.println("Hello, " + nome +"!!!");

        scanner.close();
    }
}

