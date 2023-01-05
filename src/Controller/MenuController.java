
package Controller;

import Model.MenuModel;
import Model.Pelanggan;
import Model.Pesanan;
import View.CheckOutMenu;
import View.MenuView;

public class MenuController implements SimpanListener{
    private Model.MenuModel Menu_Model;
    private Model.Pelanggan Pelanggan_Model;
    private Model.Pesanan Pesanan_Model;
    private Model.Makanan makanan_Model;
    private Model.Minuman minuman_Model;
    
    private View.CheckOutMenu Checkout_View;
    private View.MenuView Menu_View;
    
    private MenuView frame1;
    private CheckOutMenu frame2;

    public MenuController(MenuModel Menu_Model, Pelanggan Pelanggan_Model, Pesanan Pesanan_Model, CheckOutMenu Checkout_View, MenuView Menu_View) {
        this.Menu_Model = Menu_Model;
        this.Pelanggan_Model = Pelanggan_Model;
        this.Pesanan_Model = Pesanan_Model;
        this.Checkout_View = Checkout_View;
        this.Menu_View = Menu_View;
        
        frame1 = new MenuView();
    }
    
    public void showDeafultView(){
        frame1.setVisible(true);
    }    
    
     
    public double hitungPembelian(){
        if (makanan_Model.equals(this.makanan_Model)){
            return makanan_Model.getHarga();
        }else if (minuman_Model.equals(this.minuman_Model)) {
            return minuman_Model.getHarga();
        }else {
            return 0;
        }
        
    }
    /*
    public String getJenisPesanan(){
        if (jRadioButtonDineIn.isSelected()){
            return jRadioButtonDineIn.getActionCommand();
        } else {
            return jRadioButtonTakeAway.getActionCommand();
        }
    }
*/

    @Override
    public void SimpanData(String nama, String nomeja, String catatan) {
        frame2 = new CheckOutMenu(null,true);
        frame2.setVisible(true);
        
    }
    
}
