package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame{
    public JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String firstNum = tfNumber1.getText();

                    if(firstNum.isEmpty())
                        throw new IllegalArgumentException();

                    String secondNum = tfNumber2.getText();

                    if(secondNum.isEmpty())
                        throw new IllegalArgumentException();

                    String op = (String) cbOperations.getSelectedItem();

                    int firstNumParse = (Integer.parseInt(firstNum));
                    int secondNumParse = (Integer.parseInt(secondNum));

                    int res;

                    switch(Objects.requireNonNull(op)) {
                        case "+":
                            res = firstNumParse + secondNumParse;
                            lblResult.setText(String.valueOf(res));
                            break;
                        case "-":
                            res = firstNumParse - secondNumParse;
                            lblResult.setText(String.valueOf(res));
                            break;
                        case "*":
                            res = firstNumParse * secondNumParse;
                            lblResult.setText(String.valueOf(res));
                            break;
                        case "/":
                            res = firstNumParse / secondNumParse;
                            lblResult.setText(String.valueOf(res));
                            break;
                    }

                } catch (ArithmeticException a) {
                    JOptionPane.showMessageDialog(panel1, "Invalid input!");
                } catch (IllegalArgumentException a) {
                    JOptionPane.showMessageDialog(panel1, "No input!");
                }
            }
        });
    }

    public static void main(String args[]) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Sample Calculator");
        app.setContentPane(app.panel1);
        app.setSize(600, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
