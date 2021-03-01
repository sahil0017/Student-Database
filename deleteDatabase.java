import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/* java.sql.SQLException: Can not issue data manipulation statements with executeQuery().
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:97)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:89)
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:63)
        at com.mysql.cj.jdbc.StatementImpl.checkForDml(StatementImpl.java:365)
        at com.mysql.cj.jdbc.StatementImpl.executeQuery(StatementImpl.java:1133)
        at deleteDatabase.main(deleteDatabase.java:21) */

public class deleteDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Student";
            String user="root";
            String password="12345";
            Connection con=DriverManager.getConnection(url, user, password);
            if(con.isClosed())
            {
                System.out.println("Connecting to Database failed...........");
            }
            else
            {
                String q="drop database Student";
                Statement stmt=con.createStatement();
                stmt.executeQuery(q);
                System.out.println("Database deleted....................");
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
