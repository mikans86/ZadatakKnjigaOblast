package zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

/**
 * Created by Mika on 1/18/2017.
 */
public class Zadatak3IzmenaVrednosti {

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;

        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
