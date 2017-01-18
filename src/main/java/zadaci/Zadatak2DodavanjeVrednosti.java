package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import model.Knjiga;
import model.Oblast;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Mika on 1/18/2017.
 */
public class Zadatak2DodavanjeVrednosti {
    //2.3
    static Dao<Knjiga,Integer>  knjigaDao;
    static Dao<Oblast, Integer> oblastDao;

    public static void main(String[] args) {


        ConnectionSource connectionSource = null;

        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");

            knjigaDao= DaoManager.createDao(connectionSource, Knjiga.class);
            oblastDao= DaoManager.createDao(connectionSource, Oblast.class);

            TableUtils.clearTable(connectionSource, Knjiga.class);
            TableUtils.clearTable(connectionSource, Oblast.class);

            Knjiga k1 = new Knjiga("Java programiranje", 650, new java.util.Date());
            knjigaDao.create(k1);

            Knjiga k2 = new Knjiga("Android programiranje", 650, new java.util.Date());
            knjigaDao.create(k2);

            Oblast o1 = new Oblast("uvod",2);
            o1.setKnjiga(k1);
            oblastDao.create(o1);

            Oblast o2 = new Oblast("naredbe",10);
            o2.setKnjiga(k1);
            oblastDao.create(o2);

            Oblast o3 = new Oblast("Aritmeticki operatori",20);
            o3.setKnjiga(k1);
            oblastDao.create(o3);

            Oblast o4 = new Oblast("Android operativni sistem",2);
            o4.setKnjiga(k2);
            oblastDao.create(o4);

            Oblast o5 = new Oblast("Activity klasa",30);
            o5.setKnjiga(k2);
            oblastDao.create(o5);

            List<Knjiga>knjige =knjigaDao.queryForAll();
            System.out.println("Provera dali su sve knjige upisane");
            for(Knjiga k :knjige)
                System.out.println(k);

            List<Oblast>oblasti =oblastDao.queryForAll();
            System.out.println("Provera dali su sve oblasti upisane");
            for(Oblast o :oblasti)
                System.out.println(o);












        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                //Zatvaranje konekcije sa bazom
                connectionSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
