import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class insertingData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Student";
            String user="root";
            String password="12345";
            Connection con=DriverManager.getConnection(url, user, password);

            if(con.isClosed())
            {
                System.out.println("Connection Lost.......");

            }
            else
            {
                String q="insert into List(S_id,S_Name,Student_Sec,Student_cgpa)values(?,?,?,?)";
                BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));

                PreparedStatement pstmt=con.prepareStatement(q);

                //Dynamic inserting data to table in Student database 

                System.out.println("Enter Student ID (Student Regd No )");
                String id=br.readLine();
                System.out.println("Enter Student Name ");
                String name=br.readLine();
                System.out.println("Enter section of the respective Student");
                String sec=br.readLine();
                System.out.println("Enter cgpa of the respective Student");
                String cgpa=br.readLine();
                pstmt.setString(1, id);
                pstmt.setString(2,name);
                pstmt.setString(3, sec);
                pstmt.setString(4, cgpa);
                pstmt.executeUpdate();
                System.out.println("Data Inserted .......... Successfully ...............!");
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
