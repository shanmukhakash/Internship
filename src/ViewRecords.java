import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
   
public class ViewRecords {  
   
    public static void main(String args[])throws Exception
    {    
        Connection con = null;  
        try 
        {  
            con = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            PreparedStatement pstmt = con.prepareStatement("select * from Movies");
            ResultSet rs = pstmt.executeQuery();
            int c=1;
            while(rs.next()) 
            {
            	String name = rs.getString(1);
            	String actor = rs.getString(2);
            	String actress = rs.getString(3);
            	String director = rs.getString(4);
            	String year = rs.getString(5);
            	System.out.println("Record ---> "+c+"\n"+"Movie name : "+name+"\nActor : "+actor+"\nActress: "+actress+"\nDirector : "+director+"\nYear: "+year+"\n"+"----------------");
            	c++;
            }
                
        }
        catch (Exception e) 
        {  
            System.out.println(e);  
        }  
    }
}