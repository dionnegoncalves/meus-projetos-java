import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome; int opcinicio = 0;
    char [] gabarito = {'C', 'B', 'A', 'B', 'C', 'A', 'D', 'C', 'D', 'C', 'D', 'C'};
    char respostas[] = new char[10];
    String[] perguntas = {
        "QUIZ 1. Qual é a capital do Brasil?\nA) São Paulo\nB) Rio de Janeiro\nC) Brasília\nD) Salvador",
        "QUIZ 2. Qual é o maior planeta do sistema solar?\nA) Terra\nB) Júpiter\nC) Saturno\nD) Marte",
        "QUIZ 3. Quem escreveu 'Dom Casmurro'?\nA) Machado de Assis\nB) José de Alencar\nC) Clarice Lispector\nD) Graciliano Ramos",
        "QUIZ 4. Qual é o elemento químico representado pelo símbolo 'O'?\nA) Ouro\nB) Oxigênio\nC) Osso\nD) Ósmio",
        "QUIZ 5. Em que ano o homem pisou na Lua pela primeira vez?\nA) 1959\nB) 1965\nC) 1969\nD) 1971",
        "QUIZ 6. Qual é o animal mais rápido do mundo?\nA) Guepardo\nB) Leopardo\nC) Cavalo\nD) Águia",
        "QUIZ 7. Qual é o maior oceano da Terra?\nA) Atlântico\nB) Índico\nC) Ártico\nD) Pacífico",
        "QUIZ 8. Qual é a língua mais falada no mundo?\nA) Espanhol\nB) Inglês\nC) Mandarim\nD) Hindi",
        "QUIZ 9. Qual é o país mais populoso do mundo?\nA) Índia\nB) Estados Unidos\nC) Indonésia\nD) China",
        "QUIZ 10. Quem pintou a Mona Lisa?\nA) Vincent van Gogh\nB) Pablo Picasso\nC) Leonardo da Vinci\nD) Michelangelo"
    };
    System.out.println("##### Quiz - Game #####");
    System.out.print("Digite seu nome: ");
    nome = sc.nextLine();
    System.out.println("##### Bem-vindo ao Quiz Game – " + nome + " ##### \n Deseja jogar?");
    System.out.println("1 - Sim \n2 - Não");
    System.out.print("Opção:");
    opcinicio = sc.nextInt();
    if (opcinicio==2) {
        System.out.println("Que pena! \nSentimos muito por ter que partir :C");
    }
    else if (opcinicio==1) {
        int quantiarespostascertas = 0;
        for (int i = 0; i<10; i++) {
            System.out.println(perguntas[i]);
            respostas[i] = sc.next().charAt(0);
        }
        for (int i = 0; i<10; i++) {
            if (respostas[i] == gabarito[i]) {
                quantiarespostascertas++;
            }
            System.out.print((i+1) + "° respostas: "+ respostas[i] + " ");
            System.out.println((i+1) + "° Gabarito: " + gabarito[i] + " ");
        }
        System.out.println("Você teve " + quantiarespostascertas + " de 10 acertos.");
        if (quantiarespostascertas==0) {
            System.out.println("Estude o dobro!");
        }
        else if (quantiarespostascertas<3) {
            System.out.println("Desculpe, mas você tem que melhorar!");
        } else if (quantiarespostascertas<6) {
            System.out.println("Boa! Você consegue melhor, tenho certeza!");
        } else if (quantiarespostascertas<9) {
            System.out.println("Quase lá! sei que consegue um 10!");
        } else {
            System.out.println("Você é incrível!");
        }
    }
    System.out.println("Estamos partindo!");
    sc.close();
}
}
