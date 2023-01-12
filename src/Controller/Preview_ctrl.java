/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.MenuMasukForm;
import View.MenuDetailForm;
import View.Preview;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP Gaming
 */
public class Preview_ctrl {
    private Preview struk;
    private MenuMasukForm TampilanAwal;
    private MenuDetailForm TampilanDetail;
    private Connection con;
    private Statement state;
    private ResultSet rs;
    private String sql;
    private DefaultTableModel modelAwal;
    int id = -1;

    public Preview_ctrl(Preview printStruk) {
        struk = printStruk;
        TampilanAwal = new MenuMasukForm();
        TampilanDetail = new MenuDetailForm();
        modelAwal = new DefaultTableModel();
        
        
    }
    
        public void getDataDetailPesanan() {
        try{
            id = Integer.valueOf(TampilanAwal.getSelectedId());
            con = Connections.getConnection();
            state = con.createStatement();
            sql = "SELECT Nama_menu, Qty, Harga FROM pesanan WHERE ID_Pesanan = " + id + "";
            rs = state.executeQuery(sql);
            
            DefaultTableModel model = TampilanDetail.getModelTable();
            while(rs.next()){
                Object o[] = {rs.getString("Nama_menu"), rs.getInt("Qty"), rs.getDouble("Harga")};
                model.addRow(o);
                modelAwal.addRow(o);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        }
    
    
    
    
    
    
}
