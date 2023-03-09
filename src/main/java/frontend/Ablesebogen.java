package frontend;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ablesebogen extends JFrame {

    public static void main(String[] args) {
        new Ablesebogen();
    }

    private final JPanel ab;
    private final JLabel kundennummer, zaehlerart, zaehlernummer, eingebaut, zaehlerstand, kommentar, datum;
    private final JTextField kundennummer1, zaehlerart1, zaehlernummer1, zaehlerstand1, kommentar1, datum1;
    private final JCheckBox eingebaut1;
    private final JButton speichernButton;
    private final JLabel ausgabe;

    public static void zeigeMeldung(String error) {
        JOptionPane.showMessageDialog(null, error, "Fehler", JOptionPane.ERROR_MESSAGE);
    }


    public Ablesebogen() {
        super("Ablesebogen");
        final Container container = getContentPane();

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        String dateToString = dateFormat.format(date);

        ab = new JPanel(new GridLayout(8, 2));
        ab.setBorder(new EmptyBorder(5, 15, 5, 15));

        kundennummer = new JLabel("Kundennummer");
        zaehlerart = new JLabel("Zählerart");
        zaehlernummer = new JLabel("Zählernummer");
        datum = new JLabel("Datum");
        eingebaut = new JLabel("neu eingebaut");
        zaehlerstand = new JLabel("Zählerstand");
        kommentar = new JLabel("Kommentar");

        speichernButton = new JButton("Speichern");

        ausgabe = new JLabel("<--  Bitte Speichern", SwingConstants.CENTER);


        kundennummer1 = new JTextField();
        zaehlerart1 = new JTextField();
        zaehlernummer1 = new JTextField();
        datum1 = new JTextField(dateToString);
        eingebaut1 = new JCheckBox();
        zaehlerstand1 = new JTextField();
        kommentar1 = new JTextField();


        speichernButton.addActionListener(e -> {
            try {
                //SafeDataToJSON safeData = new SafeDataToJSON();
                //safeData.safeData(Integer.parseInt(kundennummer1.getText()), zaehlerart1.getText(), Integer.parseInt(zaehlernummer1.getText()), dateToString, eingebaut1.isSelected(), zaehlerstand1.getText(), kommentar1.getText());
                ausgabe.setText("Speicherung war erfolgreich");
            } catch (Exception ex) {
                ex.printStackTrace();
                zeigeMeldung(ex.toString());
                ausgabe.setText("Speicherung fehlgeschlagen!");
                return;
            }
            kundennummer1.setText("");
            zaehlerart1.setText("");
            zaehlernummer1.setText("");
            datum1.setText(dateToString);
            eingebaut1.setSelected(false);
            zaehlerstand1.setText("");
            kommentar1.setText("");
        });
        ab.add(kundennummer);
        ab.add(kundennummer1);
        ab.add(zaehlerart);
        ab.add(zaehlerart1);
        ab.add(zaehlernummer);
        ab.add(zaehlernummer1);
        ab.add(datum);
        ab.add(datum1);
        ab.add(eingebaut);
        ab.add(eingebaut1);
        ab.add(zaehlerstand);
        ab.add(zaehlerstand1);
        ab.add(kommentar);
        ab.add(kommentar1);
        ab.add(speichernButton);
        ab.add(ausgabe);
        container.add(ab, BorderLayout.CENTER);
        setVisible(true);
        setSize(400, 400);
        setTitle("Ablesebogen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
    
    

