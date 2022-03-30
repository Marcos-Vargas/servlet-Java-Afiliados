package persistencia;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DbConection {
	
	 private static String url = "";
	    public static Connection con = null;

	    public static Connection ConexionBD() {

	        url = "jdbc:sqlite:db_proyecto.db";
	        try {
	            // Realizar la conexion
	            con = DriverManager.getConnection(url);
	            if (con != null) {
	                DatabaseMetaData meta = con.getMetaData();
	                System.out.println("Base de datos conectada " + meta.getDriverName());
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
	        
	        return con;
	    }

}
