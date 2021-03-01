import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDb {
    public static void main(String[] args) {
        try {

            //load the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Student";
            String user="root";
            String password="12345";
            
            //creating a connection to mysql
            Connection con=DriverManager.getConnection(url, user, password);
            if(con.isClosed())
            {
                System.out.println("Connection to database failed.................");
            }
            else
            {
                System.out.println("Connection to database .... SUCCESSFUL........!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}