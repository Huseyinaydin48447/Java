/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordcities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String userName = "root";
    private String password = "";
    private String dbUrl = "jdbc:mysql://localhost:3306/mychat_db";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(userName, password, dbUrl);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("ERROR: " + exception.getMessage());
        System.out.println("ERROR code : " + exception.getErrorCode());

    }

}
