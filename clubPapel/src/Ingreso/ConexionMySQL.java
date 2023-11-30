package Ingreso;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class ConexionMySQL {
    public static Connection GetConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/clubpapel";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException   ex){
            JOptionPane.showMessageDialog(null, ex, "error en la conexion"+ ex.getMessage(),JOptionPane.ERROR_MESSAGE);
            conexion=null;}
        finally{
            return conexion;
        }
        }
    }
