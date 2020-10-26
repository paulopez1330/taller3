/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author plopez
 */
public class DataBase {
    private static Connection conn;
    private static final String URL = "jdbc:ucanaccess://C:/prueba/Database11.accdb";
    
    public DataBase()
    {
        try {
            if (conn == null) {
                conn =  DriverManager.getConnection(URL);
            }
        } catch (Exception e) {
            System.out.println("No fue posible conectar la base de datos");
        }
    }   
    
    public void Desconectar() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("No fue posible cerrar la conexion a la base de datos");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        DataBase d = new DataBase();
    }    
}
