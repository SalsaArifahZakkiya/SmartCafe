package Model;

import java.util.List;


public class Makanan extends MenuModel{
    private MenuModel menu;
    private int qty;

    public Makanan(MenuModel menu, int qty) {
        this.menu = menu;
        this.qty = qty;
    }

    public Makanan(String nama, double harga) {
        super(nama, harga);
        
    }
    
    public MenuModel getMenu(){
        return menu;
    }
    public int getQty(){
        return qty;
    }
    public double getHarga(){
        return menu.getHarga() * qty;
    }

    public List<Makanan> getMakanan(){
        return this.getMakanan();
    }

    @Override
    public void inputDataMenu(MenuModel menu, int qty) {
        getMakanan().add(new Makanan(menu,qty));
    }

    @Override
    public void removeDataMenu(int index) {
        getMakanan().remove(index);
    }
 
    
    
  }
 
