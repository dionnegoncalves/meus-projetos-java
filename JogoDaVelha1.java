import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JogoDaVelha1 {
    public static void main(String[] args) {

        // criar 02 variáveis do tipo String que receberão os nomes dos 2 jogadores
        String jogador1, jogador2;
        
        // exibir caixa de diálogo informando que entrou no Jogo da Velha
        JOptionPane.showMessageDialog(null, "JOGO DA VELHA");
        // Exibir caixa de diálogo do tipo INPUT e solicitar o nome dos dois jogadores e colocar nas variáveis
        jogador1 = JOptionPane.showInputDialog("Digite o nome do JOGADOR 01: ");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do JOGADOR 02: ");

        // criar um variável do tipo JLabel, que receberá o texto com o nome dos dois jogadores para exibir na tela do jogo - na fonte Arial, tamanho 20 e centralizado
        JLabel txtJogador = new JLabel();
        txtJogador.setText(jogador1 + " X " + jogador2);
        txtJogador.setFont(new Font("Arial", Font.PLAIN, 20));
        txtJogador.setHorizontalAlignment(SwingConstants.CENTER);

        // criar a janela do jogo do tipo JFrame, com título Jogo da Velha, tamanho 400x400, centralizada na tela 
        JFrame janela = new JFrame();
        janela.setTitle("Jogo da Velha");
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        // definir o layout da janela como BorderLayout
        janela.setLayout(new BorderLayout());

        // criar um painel do Jogo do tipo JPanel com layout em GRID 3x3
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBackground(Color.BLACK
        
        );

        // // criar um array de botões do tipo JButton de 9 posições e outro array para marcar que o X começa o jogo
        JButton[] buttons = new JButton[9];
        boolean[] isXTurn = {true}; 

        // // fazer um loop do tipo FOR com 9 ciclos e criar um botão para cada posição acessada e mudar letra para aRial tamanho 40 e adiconar função para adicionar X ou O ao final adiciona o botão no painel
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
           // buttons[i].setBackground(Color.GREEN);
           // buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton buttonClicked = (JButton) e.getSource();
                    if (buttonClicked.getText().equals("")) {
                        buttonClicked.setText(isXTurn[0] ? "X" : "O");
                        isXTurn[0] = !isXTurn[0];
                    }
                }
            });
            panel.add(buttons[i]);
        }

        // // criar um botão para limpar os X e O do jogo (Reset), onde faz-se um loop FOR para inserir um texto vazio dentro do botão (Arial, tamanho 20) e ao final exibe uma caixa de diálogo informando que o jogo foi resetado
        JButton resetButton = new JButton("Zerar Jogo");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 20));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    buttons[i].setText("");
                }
                isXTurn[0] = true;
                JOptionPane.showMessageDialog(null, "Jogo resetado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // adiciona o texto com nomes dos jogados, o painel do jogo e o botão de reset dentro da janela
        janela.add(txtJogador, BorderLayout.NORTH);
        janela.add(panel, BorderLayout.CENTER);
        janela.add(resetButton, BorderLayout.SOUTH);

        // torna a janela visível para o usuário
        janela.setVisible(true);
    }
}
