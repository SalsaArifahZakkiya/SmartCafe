package Model;

import View.MenuView;


public class Makanan extends MenuModel{

    public Makanan(String nama, double harga, int qty) {
        super(nama, harga, qty);
    }

    @Override
    public void inputDataMenu(MenuView mv, int x) {
        String pesanan;
        pesanan = mv.getHasil().getText() + "     "+ x + ". " + super.getNama() +"\t "+ super.getQty() +"\t"+ super.getHarga()+"\n";
        mv.setHasil(pesanan);
    }
    
    

  }
 
