package Controller;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author USER
 */
public class Connections {
    static Connection con;
    
    public static Connection getConnection(){
    try{
        //Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
    }catch(Exception ex){
        System.out.println(""+ex);
    }
    return con;
}
}
