package desktopjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author SafidyH
 */
public class Connections {
    Connection con;
    public Connections () throws ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
            System.out.println("Connection établie");
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public Connection start()
    {
        return con;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
