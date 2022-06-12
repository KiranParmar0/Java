import java.lang.*;
import java.sql.*;

class Database
{
    public static void main(String a[])
    {
        try
        {
            class.forName("com,mysql.jdbc.Drive");

            Connection con= DriveManager.getConnection("jdbc::mysql://localhost:3306/parmar","root","root");

            Statement stnt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select* from student");

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+""+rsgetString(2)+""+rs.getInt(3)+""+
            }
        }
        catch(Exception obj)
        {
            System.out.printf("Exception occured";+obj);
        }
    }
}