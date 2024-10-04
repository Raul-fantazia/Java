import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {

        // Recebendo o número como string e convertendo para inteiro
        String numero = JOptionPane.showInputDialog(null, "Digite um número:");
        int valor = Integer.parseInt(numero);

        // Armazenando a tabuada
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            resultado.append(valor).append(" x ").append(i).append(" = ").append(valor * i).append("\n");
        }

        // Exibindo a tabuada na tela
        JOptionPane.showMessageDialog(null, resultado.toString(), "Tabuada do " + valor, JOptionPane.INFORMATION_MESSAGE);
    }
}
