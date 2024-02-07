import javax.swing.JOptionPane;
public class calculator {
    public static void main(String[] args){
        String duvida = JOptionPane.showInputDialog("Deseja somar [1], subtrair [2], dividir [3] ou multiplicar [4]?");
        String firstnumber = JOptionPane.showInputDialog("Mim de um número!!");
        String secondnumber = JOptionPane.showInputDialog("Mim de outro número!!");
        int number1 = Integer.parseInt (firstnumber);
        int number2 = Integer.parseInt (secondnumber);
        int duvid = Integer.parseInt(duvida);
        if(duvid==1){
            int soma = number1 + number2;
            JOptionPane.showMessageDialog(null, "A soma é "+ soma, "Soma de Dois Inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if(duvid==2){
            int subtrair = number1 - number2;
            JOptionPane.showMessageDialog(null, "A subtração é "+ subtrair, "Subtração de Dois Inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if(duvid==3){
            int dividir = number1/number2; 
            JOptionPane.showMessageDialog(null, "A divisão é "+ dividir, "Divisão de Dois Inteiros", JOptionPane.PLAIN_MESSAGE);
        }
        if(duvid==4){
            int multiplicar = number1 * number2;
            JOptionPane.showMessageDialog(null, "A multiplicação é "+ multiplicar, "Multiplicação de Dois Inteiros", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
