import javax.swing.JOptionPane;
public class IMC {
    public static void main(String[] args) {
        String pesoString = JOptionPane.showInputDialog("Digite seu peso:");
        double peso = Double.parseDouble(pesoString);
        String alturaString = JOptionPane.showInputDialog("Digite sua altura:");
        double altura = Double.parseDouble(alturaString);
        double imc = peso / (altura*altura);
        JOptionPane.showMessageDialog(null,"Seu imc é de: " + imc);

    }
}
