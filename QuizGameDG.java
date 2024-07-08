import java.util.Scanner;
public class QuizGameDG {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeUsuario;
        int opcaoMenu, posicao = 0, limiteRespostas=0, pontuacao = 0;
        char[] gabarito = {'C', 'B', 'A', 'B', 'C', 'A', 'D', 'C', 'D', 'C'};
        char[] respostas = new char[10];

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

        System.out.println("CARREGANDO O QUIZ GAME >>>>>");
        System.out.print(">>>>> DIGITE SEU NOME: ");
        nomeUsuario = scan.nextLine();

        // MENU DO JOGO
        System.out.println("------------------------------");
        System.out.println("##### BEM-VINDO AO QUIZ GAME - " + nomeUsuario + " #####");
        System.out.println(">>>>> DICA: Utilize letra maiúsciula em cada resposta das perguntas <<<<<");
        System.out.println("Deseja jogar?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        System.out.print(">>>>> Digite uma opção: ");
        opcaoMenu = scan.nextInt();
   

        while (opcaoMenu == 1) {
            // exibe a pergunta
            System.out.println("------------------------------");
            System.out.println(perguntas[posicao]);
            // lê resposta
            System.out.print("Sua resposta é: ");
            respostas[posicao] = scan.next().charAt(0);
            // sobe o índice das perguntas
            posicao++;

            //incremeta o número de respotas dadas
            limiteRespostas++;

            // se limite de respostas for atingido saia do programa
            if (limiteRespostas == perguntas.length) {
                // verifica as respostas e o gabarito
                for (int indice=0; indice<10; indice++) {
                    if (respostas[indice] == gabarito[indice]) {
                        pontuacao = pontuacao + 1;
                    }
                }

                // exibe resultado para o suário

                if (pontuacao == 10) {
                    System.out.println("------------------------------");
                    System.out.println(">>>>> Parabéns! Você tirou a pontuação máxima. Acertou " + pontuacao + "/10 das questões.");
                    // saia do loop WHILE
                    break;
                } else if (pontuacao >= 8) {
                    System.out.println("------------------------------");
                    System.out.println(">>>>> Quase que você tira a pontuação máxima. Acertou " + pontuacao + "/10 das questões.");
                    // saia do loop WHILE
                    break;
                } else if (pontuacao >= 5) {
                    System.out.println("------------------------------");
                    System.out.println(">>>>> Você ficou na média! Acertou " + pontuacao + "/10 das questões.");
                    // saia do loop WHILE
                    break;
                } else if (pontuacao >=1) {
                    System.out.println("------------------------------");
                    System.out.println(">>>>> Estude mais da próxima vez. Acertou " + pontuacao + "/10 das questões.");
                    // saia do loop WHILE
                    break;
                } else {
                    System.out.println("------------------------------");
                    System.out.println(">>>>> Que pena! Você errou todas as questões. Acertou " + pontuacao + "/10 das questões.");
                    // saia do loop WHILE
                    break;
                }

            } //else {
            //     // pergunta se usuário deseja continuar
            //     System.out.println("Deseja continuar?");
            //     System.out.println("1 - SIM");
            //     System.out.println("2 - NÃO");
            //     System.out.print(">>>>> Digite uma opção:");
            //     opcaoMenu = scan.nextInt();
            // } 
        }// fim do while 

        if (opcaoMenu == 2) {
            System.out.println("------------------------------");
            System.out.println("Saindo do Quiz Game em 3...2...1 - Até a próxima");
        }

        scan.close();
    } // fim do main
} // fim da classe
