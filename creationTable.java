import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class creationTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Student";
            String user="root";
            String password="12345";
            Connection con=DriverManager.getConnection(url, user, password);

            //Execute a query to create a table in Student Database
            String q="create table List (S_id varchar(255) primary key not null , S_Name varchar(255) not null , Student_Sec varchar(100) not null , Student_cgpa varchar(200) )";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table created in the Student DB ................");
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
    
}
