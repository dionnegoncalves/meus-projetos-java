import javax.swing.JOptionPane;

public class DemonstrarPopus {

    public static void main (String[] args)
 {
    String nome;
    nome = JOptionPane.showInputDialog("Como você se chama?");

    int resposta;
    resposta = JOptionPane.showConfirmDialog(null, "Confirma a inserção dos dados?");

    if (resposta == JOptionPane.YES_OPTION) {
        // faça algo
    } else {
        // faça  outra coisa
    }

    JOptionPane.showConfirmDialog(null, "O que?", "Pergunta", JOptionPane.CANCEL_OPTION);





    JOptionPane.showMessageDialog(null, resposta);

    System.out.println(resposta);



 }    
}


