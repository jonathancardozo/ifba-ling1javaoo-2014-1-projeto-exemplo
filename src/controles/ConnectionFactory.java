package controles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        String host = "localhost";
        String user = "root";
        String pass = "";
        String dbName = "ifba_javaoo_projeto_exemplo";
        String connString = "jdbc:mysql://" + host + "/" + dbName;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(connString, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
