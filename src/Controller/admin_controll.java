/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.AdminPage;
import model.admin;
/**
 *
 * @author USER
 */
public class admin_controll implements SimpanAdmin{

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    AdminPage adm;
    admin ad;
    
    ArrayList<admin> listadmin;

    public admin_controll(AdminPage adm) {
        this.adm = adm;
        this.adm.btntambah(new tambah() );
        this.adm.btnupdate(new update());
        this.adm.btnhapus(new hapus());
    }
    
    @Override
    public void simpanAdm(String n, int h, int j) {
        try{
            Connection con = Connections.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from menu_table where nama_menu=? and harga=? and jumlah=?");
            pst.setString(1, n);
            pst.setInt(2, h);
            pst.setInt(3, j);
            ResultSet rs = pst.executeQuery();
            
            if(!rs.first()){
                savemenu(n, h, j);
                
            }else {
                JOptionPane.showMessageDialog(adm, "Masukkan menu yang berbeda", "Error", 1);
            }
            
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
//        }finally{
//            try {
//                con.close();
//                pst.close();
//            }catch(SQLException sqx){
//                System.out.println(sqx.getMessage());
//            }
//        }
    }
    
    class update implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tabelmodel = (DefaultTableModel)adm.getJTable().getModel();
            int row = adm.getJTable().getSelectedRow();
//            int id =Integer.valueOf(adm.getJTable().getValueAt(row, 0).toString());
            String nama = adm.getJTextNama().getText();
//            int harga=  Integer.parseInt(adm.getJTextHarga().getText());
//            int jumlah = Integer.parseInt(adm.getJTextJumlah().getText());
            
            if(adm.getJTable().getSelectedRow() == -1){
                JOptionPane.showMessageDialog(adm, "Belum memilih tabelnya");
            }
            else if (adm.getJTextNama().getText().equals("")||adm.getJTextHarga().getText().equals("")||adm.getJTextJumlah().getText().equals("")){
                JOptionPane.showMessageDialog(adm, "Ada yg kosong");
            }
            else {
                try{
                int id =Integer.valueOf(adm.getJTable().getValueAt(row, 0).toString());
                int harga=  Integer.parseInt(adm.getJTextHarga().getText());
                int jumlah = Integer.parseInt(adm.getJTextJumlah().getText());
                Connection con = Connections.getConnection();
                Statement st = con.createStatement();
                st.executeUpdate("UPDATE menu_table SET id="+id+", nama_menu='"+nama+"',harga="+Integer.valueOf(harga)+",jumlah="+Integer.valueOf(jumlah)+" WHERE id="+id+"");
                JOptionPane.showMessageDialog(adm, "Data berhasil di update");
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            adm.reset();
            adm.showtampil();
        }
            }
    }
    
    class tambah implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            DefaultTableModel tabelmodel = (DefaultTableModel)adm.getJTable().getModel();
            String n = adm.getJTextNama().getText();
//            int h=  Integer.parseInt(adm.getJTextHarga().getText());
//            int j = Integer.parseInt(adm.getJTextJumlah().getText());
            
            if(adm.getJTextNama().getText().equals("")||adm.getJTextHarga().getText().equals("")||adm.getJTextJumlah().equals("")){
               JOptionPane.showMessageDialog(adm, "Ada yg blum terisi");
            }
            
            else{
            try{
                int h=  Integer.parseInt(adm.getJTextHarga().getText());
                int j = Integer.parseInt(adm.getJTextJumlah().getText());
            Connection con = Connections.getConnection();
            String sql = "INSERT INTO menu_table(nama_menu,harga,jumlah) "
                    + "VALUES ('"+ n +"',"+ h +","+ j +")";
            pst=con.prepareStatement(sql);
            pst.executeUpdate(sql);
            
            
            }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
            adm.reset();
            adm.showtampil();
            }
            
        }
    
    }
    
    class hapus implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tabelmodel = (DefaultTableModel)adm.getJTable().getModel();
            int row = adm.getJTable().getSelectedRow();
            int id =Integer.valueOf(adm.getJTable().getValueAt(row, 0).toString());
            String n = adm.getJTextNama().getText();
            int h=  Integer.parseInt(adm.getJTextHarga().getText());
            int j = Integer.parseInt(adm.getJTextJumlah().getText());
            try{
                Connection con = Connections.getConnection();
                Statement st = con.createStatement();
                st.executeUpdate("DELETE FROM menu_table WHERE id="+id+"");
                JOptionPane.showMessageDialog(adm, "Database telah dihapus");
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                
            }
            adm.reset();
            adm.showtampil();
        }
    
    }
    
    public void savemenu(String n,int h,int j){
        
    }
    
    public void updatemenu(String n,int h ,int j){
//        String sql = "UPDATE menu_table SET nama_menu=?, harga=?,jumlah=? WHERE id=?";
//        try(PreparedStatement pst = Connections.getConnection().prepareStatement(sql))
//        {   
//            pst.setString(1, ad.getNama_menu());
//            pst.setInt(2, ad.getHarga());
//            pst.setInt(3, ad.getJumlah());
//            pst.executeUpdate();
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
        try{
            Connection con = Connections.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE menu_table SET nama_menu='"+n+"',harga="+Integer.valueOf(h)+",jumlah="+Integer.valueOf(j)+" WHERE nama_menu='"+n+"'");
            JOptionPane.showMessageDialog(adm, "Data berhasil di update");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void isifield(){
        int row = adm.getJTable().getSelectedRow();
        String model = adm.getJTable().getValueAt(row, 0).toString();
        Statement st;
        try{
            st = Connections.getConnection().createStatement();
            String query = "SELECT * FROM menu_table WHERE nama_menu = '"+model+"'"; 
            rs = st.executeQuery(query);
            if(rs.next()){
                
                adm.getJTextNama().setText(rs.getString("nama_menu"));
                adm.getJTextHarga().setText(String.valueOf(rs.getInt("harga")));
                adm.getJTextJumlah().setText(String.valueOf(rs.getInt("jumlah")));
            }
        }catch(SQLException ex){
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE,null,ex);
        }

//        DefaultTableModel model = new DefaultTableModel();
//        try{
//            Connection con = Connections.getConnection();
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * from menu_table where nama_menu='"+model+"'");
//            
//            if(rs.next()){
//                adm.getJTextNama().setText(rs.getString("nama_menu"));
//                adm.getJTextHarga().setText(String.valueOf(rs.getInt("harga")));
//                adm.getJTextJumlah().setText(String.valueOf(rs.getInt("jumlah")));
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        adm.getJTextNama().setText(listadmin.get(row).getNama_menu());
//        adm.getJTextHarga().setText(Integer.toString(listadmin.get(row).getHarga()));
//        adm.getJTextJumlah().setText(Integer.toString(listadmin.get(row).getJumlah()));
    }
    

    
    
}
