import  java.sql.Connection;
import  java.sql.DriverManager;

public class dbConnect {

    static Connection conn = null;

    private dbConnect() {

    }

    public static Connection get_dbConnect(){
        try {
            if (conn == null) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jbdc:postgresql://localhost:5432/article","postgres","123");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;

    }

}
