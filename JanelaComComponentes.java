// import java.awt.Frame;
// import java.awt.Graphics;

// public class JanelaComDesenho extends Frame {
//     public JanelaComDesenho() {
//         super("Janela com Desenho");
//         setSize(400, 300);
        
//     }
    
//     @Override
//     public void paint(Graphics g) {
//         super.paint(g);
//         // Desenha um retângulo
//         g.drawRect(50, 50, 100, 100);
//         // Desenha um círculo
//         g.drawOval(200, 50, 100, 100);
//     }
    
//     public static void main(String[] args) {
//         JanelaComDesenho frame = new JanelaComDesenho();
//         frame.setVisible(true);
//     }
// }
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class JanelaSimples {
//     public static void main(String[] args) {
//         // Cria uma nova janela
//         JFrame frame = new JFrame("Minha Primeira Janela");
        
//         // Define o comportamento de fechamento da janela
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         // Adiciona um rótulo à janela
//         JLabel label = new JLabel("Olá, Swing!");
//         frame.add(label);
        
//         // Define o tamanho da janela
//         frame.setSize(400, 300);
        
//         // Centraliza a janela
//         frame.setLocationRelativeTo(null);
        
//         // Torna a janela visível
//         frame.setVisible(true);
//     }
// }

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JanelaComComponentes {
    public static void main(String[] args)  {
       
       JFrame janela = new JFrame();

       janela.setVisible(true);


       janela.setSize(800, 500);


       janela.setTitle("Aula sobre Interface Gráfica");

       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       janela.setResizable(false);

       janela.setLocationRelativeTo(null);

       // configurando o botão
       janela.setLayout(null);

       JButton botao = new JButton();
       botao.setText("Clique Aqui");
       botao.setBounds(100, 200, 200, 70);
       janela.add(botao);

       
       JButton botao02 = new JButton();
       botao02.setText("OK");
       botao02.setBounds(400, 200, 200, 70);
       janela.add(botao02);

       // adiconando ação ao botão
       botao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(janela, "Deu tudo certo!");
        }
       });


    }

}
// public class JanelaComComponentes {
//          public static void main(String[] args) {
//             String nome;

//             nome = JOptionPane.showInputDialog("Digite seu nome: ");
//             JOptionPane.showMessageDialog(null, "Bem-vindo " + nome, "Mensagem", JOptionPane.OK_OPTION );
//          }
// }


// import javafx.event.ActionEvent;

// import javax.swing.JLabel;
// import java.awt.FlowLayout;
// import java.awt.event.ActionListener;

// public class JanelaComComponentes {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Janela com Componentes");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 300);
        
//         // Define o layout da janela
//         frame.setLayout(new FlowLayout());
        
//         // Cria um rótulo
//         JLabel label = new JLabel("Digite algo:");
//         frame.add(label);
        
//         // Cria um campo de texto
//         JTextField textField = new JTextField(20);
//         frame.add(textField);
        
//         // Cria um botão
//         JButton button = new JButton("Clique Aqui");
//         frame.add(button);

//         button.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.out.println("Texto digitado: " + textField.getText());
//             }
//         });
        
//         // Centraliza a janela
//         frame.setLocationRelativeTo(null);
        
//         frame.setVisible(true);
//     }
// }