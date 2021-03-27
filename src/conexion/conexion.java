
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    
    public static void main(String[] args) {
        
        //1.-REQUERIMIENTOS
        String driver ="com.mysql.jdbc.Driver";
        
        
        //2.- URL (CADENA DE CONEXIÓN)
        String url ="jdbc:mysql://localhost:3306/hr"; //ip:198.201.33.05
        
        try {
            Class.forName(driver);
            System.out.println("Conexion Exitosa");
            
        }catch(Exception e){
            System.err.println("Error de conexion!!!"+ e.getMessage());    
        }
        
        try{
            Connection cn= DriverManager.getConnection(url, "root","root");
             System.out.println("Conectado a la base de datos");
             
             String sql ="select * from empleoyee";
             Statement st=cn.createStatement();
             ResultSet rs=st.executeQuery(sql);
             
             while (rs.next()){
                 System.out.println(rs.getInt(1));
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getInt(4));
                 System.out.println(rs.getString(5));
                 System.out.println(rs.getInt(6));
                 System.out.println(rs.getDouble(7));
                 System.out.println(rs.getString(8));
                 System.out.println("____________");
                 
                 
                 
             }
             
             
        }catch (Exception e){
             System.err.println("Sin conexion a la base de datos");
             return;
            
        }
        
        
    }
}
