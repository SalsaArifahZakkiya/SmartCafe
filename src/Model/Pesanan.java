
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private int IDPesanan;
    private List<Makanan> listmenumakananpesan;
    private List<Minuman> listmenuminumanpesan;
    private String NamaPemesan;
    private String NoMeja;
    private String CatatanPesanan;
    private int JumlahPesanan;
    private String Feedback;
    private LocalDateTime TanggalPesanan;
    private boolean status;

    public Pesanan() {
       this.IDPesanan = -1;
        this.listmenumakananpesan = new ArrayList<Makanan>();
        this.listmenuminumanpesan = new ArrayList<Minuman>();
        this.TanggalPesanan = LocalDateTime.now(); 
        this.status = false;
    }

    
    public Pesanan(int IDPesanan, List<Makanan> listmenumakananpesan, List<Minuman> listmenuminumanpesan, String NamaPemesan, String NoMeja, String CatatanPesanan, int JumlahPesanan, String Feedback, LocalDateTime TanggalPesanan, boolean status) {
        this.IDPesanan = IDPesanan;
        this.listmenumakananpesan = new ArrayList<Makanan>();
        this.listmenuminumanpesan = new ArrayList<Minuman>();
        this.NamaPemesan = NamaPemesan;
        this.NoMeja = NoMeja;
        this.CatatanPesanan = CatatanPesanan;
        this.JumlahPesanan = JumlahPesanan;
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

    public int getTotal(){
        if(this.listmenumakananpesan.equals(this.listmenumakananpesan)){
            int total = 0;
            for (Makanan m : listmenumakananpesan){
                total += m.getHarga();
            }
            return total;
        }else {
            int total = 0;
            for (Minuman m : listmenuminumanpesan){
                total += m.getHarga();
            }
            return total;
        }
    }
    
}
