import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CriarJanela {
    public static void main(String[] args)  {
       
       JFrame janela = new JFrame(); // instancia o componente janela

       janela.setVisible(true); // informa que a janela deve ser exibida na tela
       janela.setSize(800, 500); // termina o tamanho que a janela terá
       janela.setTitle("Aula sobre Interface Gráfica"); // atribui um título para a janela

       // configurações extras:
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sempre que a janela for encerrada, o programa tbm é encerrado
       janela.setResizable(false); // evita que o usuário mexa no tamanho da janela
       janela.setLocationRelativeTo(null); // faz a janela aparecer no centro da tela

       // determina que o layout não tem configuração definida
       janela.setLayout(null);

       // configurando o botão
       JButton botao = new JButton(); // instancia o componente Botão
       botao.setText("Clique Aqui"); // informa o texto que será adicionado no centro do botão
       botao.setBounds(100, 200, 200, 70); // determina a posição e o tamanho do botão
       janela.add(botao); // insere dentro da janela o botão criado

      // criar o botão 02
      JButton botaoOK = new JButton(); // instancia o componente Botão
      botaoOK.setText("OK"); // informa o texto que será adicionado no centro do botão
      botaoOK.setBounds(400, 200, 200, 70); // determina a posição e o tamanho do botão
      janela.add(botaoOK); // insere dentro da janela o botão criado



       botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // método que será executado
                // coloca o que o botão vai fazer
                JOptionPane.showMessageDialog(janela, "Deu tudo certo!");
            }
        });
        
        botaoOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // método que será executado
                // coloca o que o botão vai fazer
                JOptionPane.showMessageDialog(janela, "Você clicou em OK");
            }
        });
    }

}