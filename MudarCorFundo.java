import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MudarCorFundo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mudar Cor de Fundo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton button = new JButton("Mudar Cor Para Azul");
        button.setBounds(300, 300, 200, 70);
        panel.add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });

        JButton button02 = new JButton("Mudar Cor para Vermelho");
        button02.setBounds(600, 300, 200, 70);
        panel.add(button02);
        

        button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        JOptionPane.showMessageDialog(null, "Alerta", "Mensagem de Alerta", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Alerta", "Mensagem de Alerta", JOptionPane.WARNING_MESSAGE);
    }
}
