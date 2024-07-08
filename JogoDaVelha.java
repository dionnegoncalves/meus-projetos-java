import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JogoDaVelha {
    public static void main(String[] args) {

        // criar 02 variáveis do tipo String que receberão os nomes dos 2 jogadores
        String jogador1, jogador2;

        // exibir caixa de diálogo informando que entrou no Jogo da Velha
        JOptionPane.showMessageDialog(null, "ENTRANDO NO JOGO DA VELHA");

        // Exibir caixa de diálogo do tipo INPUT e solicitar o nome dos dois jogadores e colocar nas variáveis
        jogador1 = JOptionPane.showInputDialog("Digite nome do JOGADOR 01:");
        jogador2 = JOptionPane.showInputDialog("Digite nome do JOGADOR 02:");
        
        // criar a janela do jogo do tipo JFrame, com título Jogo da Velha, tamanho 400x400, centralizada na tela
        JFrame janela = new JFrame();
        janela.setTitle("Jogo da Velha");
        janela.setSize(400, 400); 
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // definir o layout da janela como BorderLayout
        janela.setLayout(new BorderLayout());

        // criar um variável do tipo JLabel, que receberá o texto com o nome dos dois jogadores para exibir na tela do jogo - na fonte Arial, tamanho 20 e centralizado
        JLabel txtJogadores = new JLabel();
        txtJogadores.setText(jogador1 + " X " + jogador2);
        txtJogadores.setFont(new Font("Arial", Font.PLAIN, 20));
        txtJogadores.setHorizontalAlignment(SwingConstants.CENTER);

        // criar um painel do Jogo do tipo JPanel com layout em GRID 3x3
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3,3));

        // criar um array de botões do tipo JButton de 9 posições e outro array para marcar que o X começa o jogo
        JButton[] botoes = new JButton[9];
        boolean[] VezDoX = {true};

        // fazer um loop do tipo FOR com 9 ciclos e criar um botão para cada posição acessada e mudar letra para aRial tamanho 40 e adiconar função para adicionar X ou O ao final adiciona o botão no painel
        for (int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");
            botoes[i].setFont(new Font("Arial", Font.PLAIN, 40));
            botoes[i].setFocusPainted(false);

            // adicionando ação ao botão (coloca X ou O)
            botoes[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton buttonClicked = (JButton) e.getSource();
                    if (buttonClicked.getText().equals("")) {
                        buttonClicked.setText((VezDoX[0] ? "X" : "O"));
                        VezDoX[0] = !VezDoX[0];
                    }
                }
            });
            painel.add(botoes[i]);
        }
        
        // criar um botão para limpar os X e O do jogo (Reset), onde faz-se um loop FOR para inserir um texto vazio dentro do botão (Arial, tamanho 20) e ao final exibe uma caixa de diálogo informando que o jogo foi resetado
        JButton btnResetar = new JButton();
        btnResetar.setText("Limpar Jogo");
        btnResetar.setFont(new Font("Arial", Font.PLAIN, 20));

        btnResetar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // método do Java
                for (int i = 0; i < 9; i++) {
                    botoes[i].setText("");
                }
                VezDoX[0] = true; // sempre o jogo começa com o X

                // exibe mensagem na Tela usando um MassageDialog, informando que o Jogo foi reiniciado com sucesso
                JOptionPane.showMessageDialog(null, "Jogo resetado com sucesso");
            }
        });      


        // adiciona o texto com nomes dos jogadores, o painel do jogo e o botão de reset dentro da janela

        janela.add(txtJogadores, BorderLayout.NORTH);
        janela.add(painel, BorderLayout.CENTER);
        janela.add(btnResetar, BorderLayout.SOUTH);      

        // torna a janela visível para o usuário
        janela.setVisible(true);
        
    }
}