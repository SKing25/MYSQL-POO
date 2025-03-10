package Capa_Datos;
import java.sql.*;

public class Conexion {
    private final String url = "jdbc:mysql://localhost:3306/ventas";
    private final String usuario = "root";
    private final String pwd = "";

    public Conexion() {}

    public ResultSet Listar(String Cad){
        try{
            Connection cn = DriverManager.getConnection(url, usuario, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
            return tbl;
        }
        catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public String Ejecutar(String Cad){
        try{
            Connection cn = DriverManager.getConnection(url, usuario, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            int r = da.executeUpdate();
            if (r == 1){
                return "Se afecto " + r + " fila";
            }
            else if (r == 0){
                return "No se afecto ninguna fila";
            }
            else return "Se afectaron " + r + " filas";
        }
        catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return "Error " + e.getMessage();
        }
    }
}
