import javax.swing.*;


public class Principal{
    public static void main(String[] args) {
        String controle = JOptionPane.showInputDialog("Digite 1-soma, 2-subitracao, 3-divisao, 4-multiplicacao");
        String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número Real");
        String secondNumber = JOptionPane.showInputDialog("Digite o segundo número Real");

        int opcao = Integer.parseInt(controle);
        float number1 = Float.parseFloat(firstNumber);
        float number2 = Float.parseFloat(secondNumber);

        switch (opcao) {
            case 1:
                float sum = Operacoes.soma(number1, number2);
                JOptionPane.showMessageDialog(null, "O resultado da soma: "+sum, "Soma de dois Reais", JOptionPane.PLAIN_MESSAGE);
                break;
            
            case 2:
                float sub = Operacoes.subitracao(number1, number2);
                JOptionPane.showMessageDialog(null, "O resultado da subitrcao: "+sub, "Subtracao de dois Reais", JOptionPane.PLAIN_MESSAGE);
                break;

            case 3:
                float div = Operacoes.divisao(number1, number2);
                JOptionPane.showMessageDialog(null, "O resultado da divisao: "+div,"Divisao de dois Reais", JOptionPane.PLAIN_MESSAGE);
                break;

            case 4:
                float mult = Operacoes.multiplicacao(number1, number2);
                JOptionPane.showMessageDialog(null, "O resultado da multiplicacao: "+mult, "Multiplicacao de dois Reais", JOptionPane.PLAIN_MESSAGE);
            default:
                break;
        }
    }

}