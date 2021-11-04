import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;  
   
public class DBConnection 
{  
    public static void main(String args[])throws Exception 
    {  
        Connection con = null;  
        try 
        {  
            con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Mulesoft.db");  
            if(con!=null)
            {
            	System.out.println("DB Connected!"); 
            	Statement stmt = con.createStatement();
	           	String sql = "CREATE TABLE IF NOT EXISTS Movies (\n"  
	           	                	+ " name text NOT NULL,\n"  
	          		                + " actor text NOT NULL,\n"  
	          		                + " actress text NOT NULL,\n"
	          		                + " director text NOT NULL,\n"
	          		                + " year text \n"
	          		                + ");"; 
	           	boolean n = stmt.execute(sql);
	            if(n)
	            {
	            	System.out.println("Table created Succesfully!");
	            }
            }
        } 
        catch (Exception e) 
        {  
            System.out.println(e);  
        }  
    }  
}  