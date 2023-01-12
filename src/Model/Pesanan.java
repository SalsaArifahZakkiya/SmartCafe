package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private int IDPesanan;
    private ArrayList<MenuModel> listmenupesan;
    private String jenisPesanan;
    private double subTotal = 0;
    private double Total = 0;
    private double tax = 0;
    private ArrayList<MenuModel> Feedback;
    Pelanggan pm;
    

    public Pesanan() {
        this.listmenupesan = new ArrayList<MenuModel>();
    }

    public Pesanan(int IDPesanan, String Feedback, boolean status) {
        this.IDPesanan = IDPesanan;
        this.listmenupesan = new ArrayList<MenuModel>();
        this.Feedback = new ArrayList<MenuModel>();
    }

    public int getIDPesanan() {
        return IDPesanan;
    }
        
    public double getTax() {
        return (this.subTotal*4/100);
    }
    
    public double getTotal(){
        return tax+subTotal;
    }
    
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public void addMenu(MenuModel menu){
        listmenupesan.add(menu);
    }

    public ArrayList<MenuModel> getListmenupesan() {
        return listmenupesan;
    }

    public ArrayList<MenuModel> getFeedback() {
        return Feedback;
    }

    public String getJenisPesanan() {
        return jenisPesanan;
    }

    public void setJenisPesanan(String jenisPesanan) {
        this.jenisPesanan = jenisPesanan;
    }
    
    
    public MenuModel getSelectedMenu(int counterMenu) {
        return listmenupesan.get(counterMenu);
    }

    public void setId(int id) {
        this.IDPesanan = id;
    }
    
    
    
    public class Pembayaran {
        private Pesanan pes;
        private MenuModel menu;
        private String Feedback;
        private String Rating;

        public Pembayaran(Pesanan pes, MenuModel menu, String Feedback, String Rating) {
            this.menu = menu;
            this.Feedback = Feedback;
            this.Rating = Rating;
        }
        
        public void isiFeedback(){
            //jtextfield yang berisi pesan tentang makanan
        }
        
        public void MetodePembayaran(){
            //memilih metode pembayaran : tipe bayar di kasir atau bayar dengan virtual banking
            
        }
        public void RatingCafe(){
            //menggunakan rating sider 
        }
        
    }
    
        public void setListPesanan(ArrayList<MenuModel> list) {
        listmenupesan = list;
    }
    
    public void addPesanan(MenuModel menu){
        listmenupesan.add(menu);
    }

    
}

