package server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Ablesung {

    public static void main(String[] args) {
        Ablesung ablesung = new Ablesung();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String zählerID;
    private LocalDate datum;
    @ManyToOne
    private Customer kunde;
    private String kommentar;
    private boolean neueEingabe;
    private int zählerstand;
    @Enumerated
    private Zählertyp zählerTyp;

    public Ablesung(String zählerID, LocalDate datum, Customer kunde, String kommentar, boolean neueEingabe, int zählerstand, Zählertyp zählerTyp) {
        this.zählerID = zählerID;
        this.datum = datum;
        this.kunde = kunde;
        this.kommentar = kommentar;
        this.neueEingabe = neueEingabe;
        this.zählerstand = zählerstand;
        this.zählerTyp = zählerTyp;
    }

    public enum Zählertyp {
        POWER("Strom"),
        GAS("Gas"),
        HEATING("Heizung"),
        WATER("Wasser");

        final String label;

        Zählertyp(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }
}