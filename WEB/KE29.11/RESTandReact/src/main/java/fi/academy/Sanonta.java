package fi.academy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sanonta {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nimi;
    private String virsi;

    public Sanonta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getVirsi() {
        return virsi;
    }

    public void setVirsi(String virsi) {
        this.virsi = virsi;
    }
}
