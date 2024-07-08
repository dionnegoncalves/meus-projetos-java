import javax.swing.*;

public class TestarPopUp {
    public static void main (String [] args) {

        JOptionPane.showMessageDialog(null, "Aconteceu um erro!", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Aconteceu um erro!", "Mensagem de erro", JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Aconteceu um erro!", "Mensagem de erro", JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Aconteceu um erro!", "Mensagem de erro", JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Aconteceu um erro!", "Mensagem de erro", JOptionPane.PLAIN_MESSAGE);

        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome:");

        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome);

    }
}
