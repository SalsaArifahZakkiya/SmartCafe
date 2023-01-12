package Model;

import Controller.MenuController;
import View.MenuView;


public class Minuman extends MenuModel{

    public Minuman(String nama, double harga, int qty) {
        super(nama, harga, qty);
    }
    
    @Override
    public void inputDataMenu(MenuView mv, int x) {
        String pesanan;        
        pesanan = mv.getHasil().getText() + " "+ x + ". " + super.getNama() +"\t"+ super.getQty() +"\t"+ super.getHarga()+"\n";
        mv.setHasil(pesanan);
        
    }    
    
}
