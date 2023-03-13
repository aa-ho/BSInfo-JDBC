package frontend;

import javax.swing.*;
import java.awt.*;

public class Kunden extends JFrame {

    public static void main(String[] args) {
        new Kunden();
    }

    public Kunden() {
        super("Kundendaten");
        final Container container = getContentPane();
        container.setSize(500, 500);
        container.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
