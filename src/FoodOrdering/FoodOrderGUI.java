package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cSoftDrinks;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private double total = 0;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cPizza.isSelected())
                    total += 100;
                if(cBurger.isSelected())
                    total += 80;
                if(cFries.isSelected())
                    total += 65;
                if(cSoftDrinks.isSelected())
                    total += 55;
                if(cTea.isSelected())
                    total += 50;
                if(cSundae.isSelected())
                    total += 40;

                if(rbNone.isSelected())
                    JOptionPane.showMessageDialog(panel1, "The total price is Php " + total);
                else if(rb5.isSelected()) {
                    double originalTotal = total;
                    double discountPercentage = 0.05;
                    double discountAmount = originalTotal * discountPercentage;
                    double discountedTotal = originalTotal - discountAmount;
                    JOptionPane.showMessageDialog(panel1, "The total price is Php " + discountedTotal + "0");

                }
                else if(rb10.isSelected()) {
                    double originalTotal = total;
                    double discountPercentage = 0.10;
                    double discountAmount = originalTotal * discountPercentage;
                    double discountedTotal = originalTotal - discountAmount;
                    JOptionPane.showMessageDialog(panel1, "The total price is Php " + discountedTotal + "0");
                }
                else if(rb15.isSelected()){
                    double originalTotal = total;
                    double discountPercentage = 0.15;
                    double discountAmount = originalTotal * discountPercentage;
                    double discountedTotal = originalTotal - discountAmount;
                    JOptionPane.showMessageDialog(panel1, "The total price is Php " + discountedTotal + "0");
                }

                int exit = JOptionPane.showConfirmDialog(panel1, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);

                if(exit == JOptionPane.CLOSED_OPTION || exit == JOptionPane.YES_OPTION) {
                    total = 0;
                }
            }
        });
    }

    public static void main(String args[]) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(600, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
