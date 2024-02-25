/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcIntro {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelber helber = new DbHelber();
        PreparedStatement statement = null;//sql çümlecikleri
        ResultSet resultSet;

        try {
            connection = helber.getConnection();
            String sql = "delete from silme where id=1";
            statement = connection.prepareStatement(sql);
    

            int result = statement.executeUpdate();
            System.out.println("kayıt silindi.");
        } catch (SQLException e) {
            helber.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }

    }
//***************** SELECTDEMO********************
    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelber helber = new DbHelber();
        Statement statement = null;//sql çümlecikleri
        ResultSet resultSet;

        try {
            connection = helber.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from silme");

            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException e) {
            helber.showErrorMessage(e);
        } finally {
            connection.close();
        }

    }
    //**************İNSERT**************************************

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelber helber = new DbHelber();
        PreparedStatement statement = null;//sql çümlecikleri
        ResultSet resultSet;

        try {
            connection = helber.getConnection();
            String sql = "insert into silme (Name,Continent,Region,Code) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "izmir");
            statement.setString(2, "Tur");
            statement.setString(3, "Turkey");
            statement.setInt(4, 7000);

            int result = statement.executeUpdate();
            System.out.println("kayıt eklendi.");
        } catch (SQLException e) {
            helber.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    //*********************UPDATE***********************************
    public static void updateData() throws SQLException{
         Connection connection = null;
        DbHelber helber = new DbHelber();
        PreparedStatement statement = null;//sql çümlecikleri
        ResultSet resultSet;

        try {
            connection = helber.getConnection();
            String sql = "update silme set Code=555 where id=1";
            statement = connection.prepareStatement(sql);
    

            int result = statement.executeUpdate();
            System.out.println("kayıt güncelendi.");
        } catch (SQLException e) {
            helber.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }

}
