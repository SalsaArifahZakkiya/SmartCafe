/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fadhi
 */
public class DBConnection {
    static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing?zeroDateTimeBehavior=convertToNull", "root", "");
        }catch(SQLException ex){
            System.out.println(""+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
