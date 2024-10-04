import javax.swing.JOptionPane;

public class Pacientes {
    public static void main(String[] args) {
        int maisvelho = Integer.MIN_VALUE; 
        int maisnovo = Integer.MAX_VALUE; 
        int total = 100;

        // Loop para receber as idades dos pacientes
        for (int i = 0; i < total; i++) {
            // Recebendo as idades dos pacientes
            String idade = JOptionPane.showInputDialog("Digite sua idade");

            // Convertendo a string de idade para int
            int years = Integer.parseInt(idade);

            // Verificando o mais velho
            if (years > maisvelho) {
                maisvelho = years;
            }

            // Verificando o mais novo
            if (years < maisnovo) {
                maisnovo = years;
            }
        }

        // Exibindo os resultados
        String resultado = "O paciente mais velho tem " + maisvelho + " anos\n";
        resultado += "O paciente mais novo tem " + maisnovo + " anos";

    
        JOptionPane.showMessageDialog(null, resultado);
    }
}
