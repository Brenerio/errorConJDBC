
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;




public class TestJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "aula1");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM actor";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            while(resultado.next()){
                System.out.println("actor_id" + resultado.getInt("actor_id"));
                //System.out.println("last_name" + resultado.getString("last_name"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
