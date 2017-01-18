package zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import model.Knjiga;
import model.Oblast;

import java.sql.SQLException;

/**
 * Created by Mika on 1/18/2017.
 */
public class Zadatak1KreiranjeTabela {
    public static void main(String[] args) {
        ConnectionSource connectionSource = null;

        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");

            //2.2
            TableUtils.dropTable(connectionSource, Knjiga.class,true);
            TableUtils.dropTable(connectionSource, Oblast.class,true);

            TableUtils.createTable(connectionSource, Knjiga.class);
            TableUtils.createTable(connectionSource, Oblast.class);






        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
