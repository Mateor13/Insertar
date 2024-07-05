import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clase";
        String user = "root";
        String password = "123456";
        String nombre = "Michael Torres", cedula = "1751871011";
        double b1=12.4, b2=10.4;
        String sql = "insert into estudiantes(cedula, nombre, b1, b2) values(?,?,?,?)";
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement cadena=connection.prepareStatement(sql);
            cadena.setString(1,cedula);
            cadena.setString(2,nombre);
            cadena.setDouble(3,b1);
            cadena.setDouble(4,b2);
            cadena.executeUpdate();
            System.out.println("Se han ingrsado los datos");
        }catch (SQLException e1){
            e1.printStackTrace();
        }

    }
}