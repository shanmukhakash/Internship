import java.sql.Connection;  
import java.util.*;
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class CreateDB {  
  
    public static void main(String args[]) 
    {  
        try 
        {  
        	String dbname = "mulesoft";	
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+dbname+".db");  
            if(con != null)
            {  
                System.out.println("Database "+dbname+" created Successfully!");  
            }  
        } 
        catch(Exception e) 
        {  
            System.out.println(e);  
        }  
    }  
  
    
} 