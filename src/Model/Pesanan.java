
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private int IDPesanan;
    private List<MenuModel> listmenupesan;
    private String NoMeja;
    private String CatatanPesanan;
    private List<MenuModel> Item;
    private String Feedback;
    private LocalDateTime TanggalPesanan;
    private boolean status;
    private int total;

    public Pesanan() {
       this.IDPesanan = -1;
        this.listmenupesan = new ArrayList<MenuModel>();
        this.TanggalPesanan = LocalDateTime.now(); 
        this.status = false;
    }

    
    public Pesanan(int IDPesanan, List<Makanan> listmenumakananpesan, List<Minuman> listmenuminumanpesan, String NoMeja, String CatatanPesanan, String Feedback, LocalDateTime TanggalPesanan, boolean status) {
        this.IDPesanan = IDPesanan;
        this.listmenupesan = new ArrayList<MenuModel>();
        this.NoMeja = NoMeja;
        this.CatatanPesanan = CatatanPesanan;
        this.Feedback = Feedback;
        this.TanggalPesanan = TanggalPesanan;
        this.status = status;
    }

    public int getIDPesanan() {
        return IDPesanan;
    }
   
    public boolean isStatus() {
        return status;
    }
//
//    public int getTotalMakanan(){
//            int total = 0;
//            for (MenuModel m : listmenupesan){
//                total += m.getHarga();
//            }
//            return total;
//    }
    
}
