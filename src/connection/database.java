/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author zakiydani
 */
public class database {
    private static Connection connectMySQL;
        public static Connection connectDB() throws SQLException {
            if (connectMySQL == null){
                try {
                    String DB="jdbc:mysql://localhost:3306/hotel";
                    String user="root";
                    String pass="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    connectMySQL=(Connection) DriverManager.getConnection(DB,user,pass);
                } catch (SQLException e){
                    JOptionPane.showMessageDialog(null, "connection failed");
                }
            } 
            return connectMySQL;
        }
}
