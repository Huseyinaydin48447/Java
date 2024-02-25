/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbHelber {

    private String username = "root";
    private String password = "";
    private String dbUrl = "jdbc:mysql://localhost:3306/mychat_db";
    
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,username,password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("ERROR: "+exception.getMessage());
        System.out.println("ERROR CODE: "+exception.getErrorCode());
    }
}
