package Lesson7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JFrame frame;

    public MainWindow() {
        frame = new JFrame();
        frame.setTitle("Hello World!");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("Click ME!");
        button.setSize(100, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Clicked!");
                button.setText("Clicked!");
                button.setEnabled(false);
            }
        });

        frame.add(button);
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }
}
