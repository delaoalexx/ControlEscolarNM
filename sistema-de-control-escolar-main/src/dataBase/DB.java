package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Para las consultas cambiar el noombre que tienes para tus tablas para que concuerde con tu BD

//                                                  Colocar aqui tu base de datos
public class DB {
    private static final String URL = "jdbc:mysql://monorail.proxy.rlwy.net:14713/railway";
    private static final String USER = "root";
    private static final String PASS = "OVSDgbHAUpatRMXjPBIjrVytUK1vDSEL";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
