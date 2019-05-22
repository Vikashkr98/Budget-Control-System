
package budgetcontrolsystem.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/budgetcontrol","root","");
            JOptionPane.showMessageDialog(null,"Connected To Database");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "cannot connect to database");
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected successfuly ");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "cannot close to connection");
        }
    }
}
