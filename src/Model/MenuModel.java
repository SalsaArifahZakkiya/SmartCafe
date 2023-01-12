
package Model;

import java.util.ArrayList;


public abstract class MenuModel implements Inputable{
    private String nama;
    private double harga;
    private int qty;
    private static int favorite;
    private static int JumlahTejual;
    //private ArrayList<Pesanan.Pembayaran> Feedback;
    
//    public MenuModel() {
//        this.Feedback = new ArrayList<Pesanan.Pembayaran>();
//    }

    public MenuModel(String nama, double harga, int qty) {
        this.nama = nama;
        this.harga = harga;
        this.qty = qty;
    }

    public static int getFavorite() {
        return favorite;
    }

    public static int getJumlahTejual() {
        return JumlahTejual;
    }

    public int getQty() {
        return qty;
    }

    public static void setFavorite(int favorite) {
        MenuModel.favorite = favorite;
    }

    public static void setJumlahTejual(int JumlahTejual) {
        MenuModel.JumlahTejual = JumlahTejual;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getPrice(){
        return this.harga * this.qty;
    }

    
}
