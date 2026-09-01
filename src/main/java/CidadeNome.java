import javax.swing.JOptionPane;

public class CidadeNome {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cidade = JOptionPane.showInputDialog("Qual cidade você nasceu?");
        JOptionPane.showMessageDialog(null, "Olá " + nome + "! Que legal saber que você é da cidade " + cidade);

    }
}
