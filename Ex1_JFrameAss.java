import javax.swing.*;

public class Ex1_JFrameAss {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // creating instance of JFrame

        JButton b = new JButton("Click"); // creating instance of JButton
        b.setBounds(130, 100, 100, 40); // Setting position and size (x, y, width, height)

        f.add(b); // adding button in JFrame
        f.setSize(400, 500); // Setting size of frame (width, height)
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting close operation
    }
}
