/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author nicoc
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasenia = "root*";
    String bd = "BaseUno";
    String ip = "localhost";
    String puerto = "49999";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion()
    {
        try
        {
            String cadena = "jdbc:sqlserver://localhost:49999;database=BaseUno;encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);   
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error:"+ e.toString());
        }
        return conectar;
    }
}
