package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


//2.1.2
@DatabaseTable(tableName = "oblast")
public class Oblast {

    public static final String POLJE_NAZIV= "naziv";
    public static final String POLJE_POCETNA_STRANA= "pocetna_strana";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField (columnName = POLJE_NAZIV, canBeNull = false)
    private String naziv;

    @DatabaseField (columnName = POLJE_POCETNA_STRANA, canBeNull = false)
    private String pocetnaStrana;

    @DatabaseField (foreign = true,foreignAutoRefresh = true,columnName = "knjiga_id")
    private Knjiga knjiga;

    public Oblast(){

    }

    public Oblast(String naziv, String pocetnaStrana) {
        this.naziv = naziv;
        this.pocetnaStrana = pocetnaStrana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getPocetnaStrana() {
        return pocetnaStrana;
    }

    public void setPocetnaStrana(String pocetnaStrana) {
        this.pocetnaStrana = pocetnaStrana;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    @Override
    public String toString() {
        return "Oblast{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", pocetnaStrana='" + pocetnaStrana + '\'' +
                '}';
    }
}
