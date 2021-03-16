import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnectTest {

    public static void main(String [] argc) {

        Connection conn = dbConnect.get_dbConnect();
        try {
            String query = "SELECT * FROM article";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }


        } catch (Exception e){
            
            System.out.println("Error!");
        }
    }
}
