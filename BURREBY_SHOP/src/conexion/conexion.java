package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar = null;
    
    public Connection conexion (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/burreby", "root", "");
            //JOptionPane.showMessageDialog(null, "CONEXION");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
        return conectar;
    }
}
