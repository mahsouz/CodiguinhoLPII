package candy;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Frame extends JFrame{
    
    private JLabel title;
    private Icon icon1;
    private Icon icon2;
    private Icon icon3;
    private JLabel product1;
    private JLabel product2;
    private JLabel product3;
    private JTextField quantity1;
    private JTextField quantity2;
    private JTextField quantity3;
    private JButton confirmButton;
    

    public Frame(){
        super("Venda de doces");
        setSize(450, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        
        title = new JLabel("    Loja de doces   ");
        title.setFont(new Font("Arial", Font.BOLD, 30 ));
        add(title);
        
        icon1 = new ImageIcon(getClass().getResource("icon1.jpg"));
        icon2 = new ImageIcon(getClass().getResource("icon2.jpg"));
        icon3 = new ImageIcon(getClass().getResource("icon3.jpg"));
        
        JPanel productPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        product1 = new JLabel("R$ 10,00");
        product1.setIcon(icon1);
        product1.setHorizontalTextPosition(SwingConstants.RIGHT);
        product1.setVerticalTextPosition(SwingConstants.CENTER);
        
        quantity1 = new JTextField("0");
        quantity1.setColumns(10);
        
        productPanel1.add(product1);
        productPanel1.add(quantity1);
        
        JPanel productPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        product2 = new JLabel("R$ 15,00");
        product2.setIcon(icon2);
        product2.setHorizontalTextPosition(SwingConstants.RIGHT);
        product2.setVerticalTextPosition(SwingConstants.CENTER);
        
        quantity2 = new JTextField("0");
        quantity2.setColumns(10);
        
        productPanel2.add(product2);
        productPanel2.add(quantity2);
        
        JPanel productPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        product3 = new JLabel("R$ 20,00");
        product3.setIcon(icon3);
        product3.setHorizontalTextPosition(SwingConstants.RIGHT);
        product3.setVerticalTextPosition(SwingConstants.CENTER);
        
        quantity3 = new JTextField("0");
        quantity3.setColumns(10);
        
        productPanel3.add(product3);
        productPanel3.add(quantity3);
        
        confirmButton = new JButton("Pedir");
        confirmButton.setPreferredSize(new Dimension(100, 30));
        confirmButton.addActionListener(new ButtonHandler());
        
        
        add(productPanel1);
        add(productPanel2);
        add(productPanel3);
        add(confirmButton);
        
        
        setVisible(true);
        
    }
    
    private class ButtonHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            int valor1 = Integer.parseInt(quantity1.getText());
            int valor2 = Integer.parseInt(quantity2.getText());
            int valor3 = Integer.parseInt(quantity3.getText());
            
            double valorTotal = valor1*10+valor2*15+valor3*20;
            
            JOptionPane.showMessageDialog(null, "A sua compra foi de "+"R$"+valorTotal);
        }
        
    }
    
}

