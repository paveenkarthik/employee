import java.sql.*;

public class dbconnection {
    static Connection con;

    public static Connection DB() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/employee";
            String user = "root";
            String pass = "root";
            con =DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;

    }
}
