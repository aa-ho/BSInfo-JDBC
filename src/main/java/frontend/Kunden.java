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
        container.setSize(400, 400);
        container.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 400);
    }
}
