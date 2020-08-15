package BasicExamples.GUI.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {
    JButton button;
    MyDrawPanel panel;

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        panel = new MyDrawPanel();
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
}
