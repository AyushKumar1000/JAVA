import javax.swing.*;
import java.awt.event.*;

public class frame_calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");

        JLabel label1 = new JLabel("Enter first number:");
        label1.setBounds(50, 30, 150, 20);
        JTextField tf1 = new JTextField();
        tf1.setBounds(180, 30, 150, 20);

        JLabel label2 = new JLabel("Enter second number:");
        label2.setBounds(50, 60, 150, 20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(180, 60, 150, 20);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(50, 100, 80, 30);

        JButton subBtn = new JButton("Subtract");
        subBtn.setBounds(140, 100, 100, 30);

        JButton refreshBtn = new JButton("Refresh");
        refreshBtn.setBounds(250, 100, 100, 30);

        JLabel result = new JLabel();
        result.setBounds(50, 140, 250, 20);

        // Add button action
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int sum = num1 + num2;
                    result.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input! Enter numbers.");
                }
            }
        });

        // Subtract button action
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int diff = num1 - num2;
                    result.setText("Result: " + diff);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input! Enter numbers.");
                }
            }
        });

        // Refresh button action
        refreshBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                result.setText("");
            }
        });

        // Adding components to frame
        f.add(label1);
        f.add(tf1);
        f.add(label2);
        f.add(tf2);
        f.add(addBtn);
        f.add(subBtn);
        f.add(refreshBtn);
        f.add(result);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}