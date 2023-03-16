//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package frontend;

import server.entities.Ablesung;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ablesebogen extends JFrame {
    private final JPanel ab;
    private final JLabel kundennummer;
    private final JLabel zaehlerart;
    private final JLabel zaehlernummer;
    private final JLabel eingebaut;
    private final JLabel zaehlerstand;
    private final JLabel kommentar;
    private final JLabel datum;
    private final JTextField kundennummer1;
    private final JTextField zaehlerart1;
    private final JTextField zaehlernummer1;
    private final JTextField zaehlerstand1;
    private final JTextField kommentar1;
    private final JTextField datum1;
    private final JCheckBox eingebaut1;
    private final JButton speichernButton;
    private final JLabel ausgabe;

    public static void main(String[] args) {
        new Ablesebogen();
    }

    public static void zeigeMeldung(String error) {
        JOptionPane.showMessageDialog(null, error, "Fehler", 0);
    }

    public Ablesebogen() {
        super("Ablesebogen");
        CustomerRessource customerRessource = new CustomerRessource();
        AblesebogenRessource ablesebogenRessource = new AblesebogenRessource();
        Container container = this.getContentPane();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        String dateToString = dateFormat.format(date);
        this.ab = new JPanel(new GridLayout(8, 2));
        this.ab.setBorder(new EmptyBorder(5, 15, 5, 15));
        this.kundennummer = new JLabel("Kundennummer");
        this.zaehlerart = new JLabel("Zählerart");
        this.zaehlernummer = new JLabel("Zählernummer");
        this.datum = new JLabel("Datum");
        this.eingebaut = new JLabel("neu eingebaut");
        this.zaehlerstand = new JLabel("Zählerstand");
        this.kommentar = new JLabel("Kommentar");
        this.speichernButton = new JButton("Speichern");
        this.ausgabe = new JLabel("<--  Bitte Speichern", 0);
        this.kundennummer1 = new JTextField();
        this.zaehlerart1 = new JTextField();
        this.zaehlernummer1 = new JTextField();
        this.datum1 = new JTextField(dateToString);
        this.eingebaut1 = new JCheckBox();
        this.zaehlerstand1 = new JTextField();
        this.kommentar1 = new JTextField();
        this.speichernButton.addActionListener((e) -> {
            try {
                if (customerRessource.getCustomer(UUID.fromString(this.kundennummer1.getText())) == null) {
                    customerRessource.addCustomer("Hans", "Wurst");
                }
                Ablesung ablesung = new Ablesung();
                ablesung.setId(UUID.fromString(this.kundennummer1.getText()));
                ablesung.setKommentar(this.kommentar1.getText());
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date date2 = outputFormat.parse(dateToString);
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                ablesung.setDatum(LocalDate.parse(inputFormat.format(date2)));
                ablesung.setKunde(customerRessource.getCustomer(UUID.fromString(this.kundennummer1.getText())));
                ablesung.setZählerstand(Integer.parseInt(this.zaehlerstand1.getText()));
                ablesung.setZählerID(ablesung.getZählerID());
                ablesung.setZählerTyp(ablesung.getZählerTyp());
                ablesebogenRessource.addAblesung(ablesung);
                this.ausgabe.setText("Speicherung war erfolgreich");
            } catch (Exception var4) {
                var4.printStackTrace();
                zeigeMeldung(var4.toString());
                this.ausgabe.setText("Speicherung fehlgeschlagen!");
                return;
            }

            this.kundennummer1.setText("");
            this.zaehlerart1.setText("");
            this.zaehlernummer1.setText("");
            this.datum1.setText(dateToString);
            this.eingebaut1.setSelected(false);
            this.zaehlerstand1.setText("");
            this.kommentar1.setText("");
        });
        this.ab.add(this.kundennummer);
        this.ab.add(this.kundennummer1);
        this.ab.add(this.zaehlerart);
        this.ab.add(this.zaehlerart1);
        this.ab.add(this.zaehlernummer);
        this.ab.add(this.zaehlernummer1);
        this.ab.add(this.datum);
        this.ab.add(this.datum1);
        this.ab.add(this.eingebaut);
        this.ab.add(this.eingebaut1);
        this.ab.add(this.zaehlerstand);
        this.ab.add(this.zaehlerstand1);
        this.ab.add(this.kommentar);
        this.ab.add(this.kommentar1);
        this.ab.add(this.speichernButton);
        this.ab.add(this.ausgabe);
        container.add(this.ab, "Center");
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("Ablesebogen");
        this.setDefaultCloseOperation(3);
    }
}
