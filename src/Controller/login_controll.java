/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.MenuView;
import View.OwnerView;
import com.mysql.cj.protocol.Resultset;
import com.sun.glass.ui.Cursor;
import Model.login_model_controll;
import View.LoginPage;
import View.AdminPage;
import View.Customer_Page;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import View.MenuMasukForm;
import Controller.Connections;
/**
 *
 * @author USER
 */
public class login_controll {
    private LoginPage frame1;
    private AdminPage frame2;
    private MenuView frame3;
    private OwnerView frame4;
    private MenuMasukForm frame5;
public login_controll(LoginPage login){
    frame1=login;
    frame1.kliklogin(new btnsimpan());
    
    
}    
    class btnsimpan implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        String nama = frame1.getUsername();
        String password = frame1.getpassword();
        String role = frame1. getRole();
        if(nama.equals("")|| password.equals("")||role.equals("Select")){
            JOptionPane.showMessageDialog(frame1, "Ada yg kosong", "Error", 1);
        }else{
        try{
            Connection con = Connections.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from login_table where username=? and password=?");
            pst.setString(1, nama);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String s1=rs.getString("role");
                if(role.equalsIgnoreCase("Admin")&&s1.equalsIgnoreCase("admin")){
                    frame2 = new AdminPage(nama);
                    admin_controll adc = new admin_controll(frame2);
                    frame2.setVisible(true);
                    frame1.dispose();
                }
                if(role.equalsIgnoreCase("Customer")&&s1.equalsIgnoreCase("customer")){
                   frame3 = new MenuView();
                   
                   frame3.setVisible(true);
                   frame1.dispose();
                }
                if(role.equalsIgnoreCase("Owner")&&s1.equalsIgnoreCase("owner")){
                   frame4 = new OwnerView();
                   
                   frame4.setVisible(true);
                   frame1.dispose();
                }
                if(role.equalsIgnoreCase("Kasir")&&s1.equalsIgnoreCase("kasir")){
                   frame5 = new MenuMasukForm();
                   
                   frame5.setVisible(true);
                   frame1.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(frame1, "Username dan password tidak cocok", "Login Error", 1);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    }
    }
public void showdefaultview(){
    frame1.setVisible(true);
}
    
    
    
}

