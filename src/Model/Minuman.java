
package Model;

import java.util.List;

public class Minuman extends MenuModel{
    private MenuModel menu;
    private int qty;

    public Minuman(MenuModel menu, int qty) {
        this.menu = menu;
        this.qty = qty;
    }

    public Minuman(MenuModel menu, int qty, String nama, double harga) {
        super(nama, harga);
        this.menu = menu;
        this.qty = qty;
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
    public List<Minuman> getMinuman(){
        return this.getMinuman();
    }

    @Override
    public void inputDataMenu(MenuModel menu, int qty) {
        getMinuman().add(new Minuman(menu,qty));
    }

    @Override
    public void removeDataMenu(int index) {
        getMinuman().remove(index);
    }
    

    
}
