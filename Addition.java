import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args){
        String firstnumber = JOptionPane.showInputDialog("Mim de um número!!");
        String secondnumber = JOptionPane.showInputDialog("Mim de outro número!!");
        
        int number1 = Integer.parseInt (firstnumber);
        int number2 = Integer.parseInt (secondnumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is "+ sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
