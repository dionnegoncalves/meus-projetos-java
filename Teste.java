import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
    //     double saldo=0, dinheiroParaSacar=0;
    //     Scanner scanner = new Scanner (System.in);
    //     int opcao=1, numero1, numero2, numero3;
    //     int[] numeros = new int[3];

    //     if (opcao == 1) {
    //         System.out.print("Você digitou 1");
    //     } else if (opcao == 2) {
    //         System.out.print("Você digitou 2");
    //         } else if (opcao == 3) {
    //             System.out.print("Você digitou 3");
    //             } else if (opcao == 4) {
    //                 System.out.print("Você digitou 4");
    //                 } else if (opcao == 5) {
    //                     System.out.print("Você digitou 5");
    //                     } else {
    //                         System.out.print("Opção inexistente");
    //                         }
    
    //                         switch (opcao) {
    //                             case 1:
    //                               System.out.println("O número escolhido foi: 1.");
    //                               break;
    //                             case 2:
    //                               System.out.println("O número escolhido foi: 2.");
    //                               break;
    //                             case 3:
    //                               System.out.println("O número escolhido foi: 3.");
    //                               break;
    //                             case 4:
    //                               System.out.println("O número escolhido foi: 4.");
    //                               break;
    //                             case 5:
    //                               System.out.println("O número escolhido foi: 5.");
    //                               break;
    //                             default:
    //                               System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
    // }

    // System.out.println("Digite 03 números");

    // System.out.print("Digite número 1: ");
    // numero1 = scanner.nextInt();
    // System.out.print("Digite número 2: ");
    // numero2 = scanner.nextInt();
    // System.out.print("Digite número 3: ");
    // numero3 = scanner.nextInt();

    // System.out.println("Digite 03 números");

    // for (int i=1; i<=3; i++){
    //   System.out.print("Digite número " + i + " : ");
    //   numeros[i] = scanner.nextInt();      
    // }

    for (int contador = 0; contador <= 5; contador++) {
      System.out.println("A variável CONTADOR agora vale " + contador);
    }

    int numero;

    numero = 1;

    while (numero < 10) {
      System.out.print(numero);
      numero++;
    }


    int n1, n2, n3, n4, n5;
    
    int[] numeros = new int[5];
    int[] frutas2 = new int[4];

    String[] alunos = new String[10];

    for (int indice = 0; indice < 10; indice++) {
      System.out.print(alunos[indice]);
    }


    for (int indice = 0; indice < alunos.length; indice++) {
      System.out.print(alunos[indice]);
    }


    char[] gabarito = {'c', 'd', 'a', 'd', 'b', 'a', 'a', 'b', 'c', 'a'};

    

    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n4);
    System.out.println(n5);

    numeros[2] = 10;
    numeros[0] = 30;
    numeros[1] = 1;




    for(int contador = 0 ; contador < 5; contador++) {
      numeros[contador] = contador + 1;
    }

    for (int i=0; i<4; i++) {
      System.out.print(frutas2[i]);
    }




    







    n1=0;
    n2, n3, n4, n5;



  }
}