package homework.lab4.anonymousclass;

import lombok.AllArgsConstructor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame(int counter) throws HeadlessException {
        Counter counterInner = new Counter(counter);
        setSize(500,500);
        JButton button = new JButton("click me to be red");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(counterInner.Increase());

            }
        });
        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @AllArgsConstructor
    static
    class Counter {
        private int counter;

        public int Increase() {
            return counter++;
        }
    }
    public static void main(String[] args) {
        new ColorFrame(10);
    }
}
