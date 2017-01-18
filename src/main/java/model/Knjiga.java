package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by Mika on 1/18/2017.
 */
@DatabaseTable (tableName = "knjiga")
public class Knjiga {

    //2.1.1
    public static final String POLJE_NASLOV= "naslov";
    public static final String POLJE_BROJ_STRANA= "broj_strana";
    public static final String POLJE_DATUM_IZDAVANJA= "datum_izdavanja";


    @DatabaseField (generatedId = true)
    private int id;

    @DatabaseField (columnName = POLJE_NASLOV, canBeNull = false)
    private String naslov;

    @DatabaseField (columnName = POLJE_BROJ_STRANA, canBeNull = false)
    private int brojStrana;

    @DatabaseField (columnName = POLJE_DATUM_IZDAVANJA, canBeNull = false)
    private Date datumIzdanja;

    private Boolean prisutan = true;

    @ForeignCollectionField (foreignFieldName = "knjiga")
    private ForeignCollection<Oblast>oblasti;

    public Knjiga(){

    }

    public Knjiga(String naslov, int brojStrana, Date datumIzdanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public Boolean getPrisutan() {
        return prisutan;
    }

    public void setPrisutan(Boolean prisutan) {
        this.prisutan = prisutan;
    }

    public ForeignCollection<Oblast> getOblasti() {
        return oblasti;
    }

    public void setOblasti(ForeignCollection<Oblast> oblasti) {
        this.oblasti = oblasti;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", brojStrana=" + brojStrana +
                ", datumIzdanja=" + datumIzdanja +
                '}';
    }
}
