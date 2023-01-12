
package Controller;

import Controller.Connections;
import Model.Makanan;
import Model.MenuModel;
import Model.Minuman;
import Model.Pelanggan;
import Model.Pesanan;
import View.CheckOutMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CheckOutController {
   CheckOutMenu viewCheck;
   MenuController menuctrl;
   ArrayList<MenuModel> listMenu ;
   Pesanan model_pesanan;
   Connections db = new Connections();
   Pelanggan model_pelanggan;

    public CheckOutController(CheckOutMenu viewCheck, ArrayList<MenuModel> listMenu, Pesanan pesan) {
        this.viewCheck = viewCheck;
        this.listMenu = listMenu;
        this.model_pesanan = pesan;
        this.viewCheck.buttonSubmit(new BtnSubmit());
    }
    
    public String getNamaPemesan(){
        return model_pelanggan.getNama();
    }
    
    public String getNomorMeja(){
        return model_pelanggan.getNoMeja();
    }
    
    public String getCatatanPesanan(){
        return model_pelanggan.getCatatanPesanan();
    }
    
    class BtnSubmit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (viewCheck.getNama().equals("") && viewCheck.getNoMeja().equals("")) {
                JOptionPane.showMessageDialog(null, "Anda belum mengisi data dengan benar, Mohon Masukkan data dengan benar!");
            } else {
                //button ini di gunakan untuk mengirimkan ke database (menggunakan controller)
                int result = JOptionPane.showConfirmDialog(viewCheck, "Are you sure you want to checkout?", "Confirm Checkout", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    // Process payment and close dialog
                    try{
                        Connection con = db.getConnection();
                        Statement stat = con.createStatement();
                        String sql;
                        
                        String nama = viewCheck.getNama();
                        System.out.println("Nama " + nama);
                        String noMeja = viewCheck.getNoMeja();
                        System.out.println("meja " + noMeja);
                        String catatan = viewCheck.getCatatan();
                        System.out.println("Catatan " + catatan);
                        String jenis = viewCheck.getJenisPesanan();
                        System.out.println("jenis " + jenis);
                        double SubTotal = model_pesanan.getSubTotal();
                        System.out.println("subtotal " + SubTotal);
                        double Total = model_pesanan.getTotal();
                        System.out.println("Total " + Total);
                        double Tax = model_pesanan.getTax();
                        System.out.println("Tax " + Tax);
                        sql = "INSERT INTO pesanan_table (Nama_Pemesan, Nomor_Meja, Catatan, Jenis_Pesanan, Sub_Total, Total, Tax) VALUES ('"+nama+"', '"+noMeja+"', '"+catatan+"', '"+jenis+"',"+SubTotal+", "+Total+", "+Tax+")";
                        stat.execute(sql);
                        
                        sql = "SELECT ID_Pesanan FROM pesanan_table ORDER BY ID_Pesanan DESC LIMIT 1";
                        int idPesanan = 0;
                        System.out.println(idPesanan);
                        ResultSet rs = stat.executeQuery(sql);
                        if(rs.next()){
                            idPesanan = rs.getInt("Id_Pesanan");
                        } 
                        //int total = listMenu.size();
//                        double harga = 0;
                        for(MenuModel m : listMenu){
//                            harga = harga + m.getPrice();
                            sql = "INSERT INTO pesanan (ID_Pesanan, Nama_menu, Qty, Harga) VALUES ("+ idPesanan +", '"+m.getNama()+"', "+m.getQty()+", "+m.getHarga()+")";
                            stat.execute(sql);
                        }
//                        
//                        for(Minuman m : listMinuman){
//                            harga = harga + m.getHarga() + m.getQty();
//                            sql = "INSERT INTO DetailPesanan (Nama_Menu, Qty, Harga) VALUES ("+m.getNama()+", "+m.getQty()+", "+m.getHarga()+")";
//                        }
                        
                        
                    } catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    viewCheck.dispose();
                }

            }
        }
        
    }
    
    
}