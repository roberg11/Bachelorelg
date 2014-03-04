package elgen;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class SimpleFrame implements Runnable {

    @Override
    public void run() {
        JFrame frame = new JFrame("JScroll Pane Test");

        JTextArea txtNotes = new JTextArea();
        txtNotes.setText("Hello World");
        JScrollPane scrollPane = new JScrollPane(txtNotes);
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 400));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new SimpleFrame());
    }

}