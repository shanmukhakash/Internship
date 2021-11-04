import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
   
public class ViewRecordsByName {  
   
    public static void main(String args[])throws Exception
    {    
        Connection con = null;  
        try 
        {  
            con = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            String actor_name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Actor Name");
            actor_name = sc.next();
            PreparedStatement pstmt = con.prepareStatement("select * from Movies where actor=?");
            pstmt.setString(1, actor_name);
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