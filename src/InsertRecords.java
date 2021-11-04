import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
   
public class InsertRecords {  
   
    public static void main(String args[])throws Exception
    {      
        Connection con = null;  
        try 
        {  
            con = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            PreparedStatement pstmt = con.prepareStatement("insert into Movies values(?,?,?,?,?)");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the Movie Name");
            String name = sc.next();
            
            System.out.println("Enter the Movie Actor");
            String actor = sc.next();
            
            System.out.println("Enter the Movie Actress");
            String actress = sc.next();
            
            System.out.println("Enter the Movie Director");
            String director = sc.next();
            
            System.out.println("Enter the Movie Year of release");
            String year = sc.next();
            
            pstmt.setString(1, name);
            pstmt.setString(2, actor);
            pstmt.setString(3, actress);
            pstmt.setString(4, director);
            pstmt.setString(5, year);
            
            pstmt.executeUpdate();
            
            System.out.println("Inserted Sucessfully!");
        }
        catch (Exception e) 
        {  
            System.out.println(e);  
        }  
    }
}