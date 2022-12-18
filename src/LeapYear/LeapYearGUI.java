package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton checkButton;

    public LeapYearGUI() {
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String leapYear = tfYear.getText();
                try {
                    int userLeapYear = (Integer.parseInt(leapYear));
                    boolean isLeapYear = (userLeapYear % 4 == 0 && userLeapYear % 100 != 0) || (userLeapYear % 400 == 0);

                    if (isLeapYear) {
                        JOptionPane.showMessageDialog(panel1, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(panel1, "Not a leap year");
                    }
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(panel1, "Invalid input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(300, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
