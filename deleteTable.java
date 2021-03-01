import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class deleteTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Student";
            String user="root";
            String password="12345";
            Connection con=DriverManager.getConnection(url, user, password);
            if(con.isClosed())
            {
                System.out.println("Connecting to Database failed..........");
            }
            else
            {
                String q="delete from list";
                Statement stmt=con.createStatement();
                stmt.executeUpdate(q);
                System.out.println("Table deleted from Student database........");
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
