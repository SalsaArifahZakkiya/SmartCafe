
package Controller;

import Model.MenuModel;
import Model.Pelanggan;
import Model.Pesanan;
import View.CheckOutMenu;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements SimpanListener{    
    private Model.MenuModel Menu_Model;
    private Model.Pelanggan Pelanggan_Model;
    private Model.Pesanan Pesanan_Model;
    private Model.Makanan makanan_Model;
    private Model.Minuman minuman_Model;
    
    private MenuView frame1;
    private CheckOutMenu frame2;
    private MakananController controlMakan;

    public MenuController(MenuView f, MakananController control) {
        frame1 = f;
        controlMakan = control;
        this.frame1.setBtnReset(new btnReset());
    }

    
    public MenuController(MenuModel Menu_Model, Pelanggan Pelanggan_Model, Pesanan Pesanan_Model) {
        this.Menu_Model = Menu_Model;
        this.Pelanggan_Model = Pelanggan_Model;
        this.Pesanan_Model = Pesanan_Model;
        this.frame1.setBtnReset(new btnReset());
    }
    
    public void showDeafultView(){
        frame1.setVisible(true);
    }
    
    public double hitungPembelianMinuman(){
        return minuman_Model.getPrice();
    }
    
    class btnReset implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        controlMakan.setTotal(0);
        controlMakan.setTotalItem(0);
        controlMakan.setX(0);
        frame1.getjTextFieldTotal().setText("0");
        frame1.getjTextFieldTotalItem().setText("0");
        //spinner
        frame1.getjSpinnerKentang().setValue(0);
        frame1.getjSpinnerRotiBakar().setValue(0);
        frame1.getjSpinneramericano().setValue(0);
        frame1.getjSpinnerburger().setValue(0);
        frame1.getjSpinnerchocolatte().setValue(0);
        frame1.getjSpinnercoffelatte().setValue(0);
        frame1.getjSpinnerdimsum().setValue(0);
        frame1.getjSpinnericetea().setValue(0);
        frame1.getjSpinnerindomie().setValue(0);
        frame1.getjSpinnerlemontea().setValue(0);
        frame1.getjSpinnerlycheetea().setValue(0);
        frame1.getjSpinnermatchalatte().setValue(0);
        frame1.getjSpinnernnasgor().setValue(0);
        frame1.getjSpinneronion().setValue(0);
        frame1.getjSpinnerredvelvet().setValue(0);
        frame1.getjSpinnersosis().setValue(0);
        frame1.getjSpinnerspagetti().setValue(0);
        frame1.getjSpinnertarolatte().setValue(0);
        frame1.getjSpinnervanilalatte().setValue(0);
        frame1.getjSpinnerwaffle().setValue(0);
        //chceckbox
        frame1.getjCheckBoxKentang().setSelected(false);
        frame1.getjCheckBoxRotibakar().setSelected(false);
        frame1.getjCheckBoxamericano().setSelected(false);
        frame1.getjCheckBoxburger().setSelected(false);
        frame1.getjCheckBoxchocolatte().setSelected(false);
        frame1.getjCheckBoxcoffelatte().setSelected(false);
        frame1.getjCheckBoxdimsum().setSelected(false);
        frame1.getjCheckBoxicetea().setSelected(false);
        frame1.getjCheckBoxindomie().setSelected(false);
        frame1.getjCheckBoxlemontea().setSelected(false);
        frame1.getjCheckBoxlycheetea().setSelected(false);
        frame1.getjCheckBoxmatchalatte().setSelected(false);
        frame1.getjCheckBoxnasgor().setSelected(false);
        frame1.getjCheckBoxonion().setSelected(false);
        frame1.getjCheckBoxredvelvet().setSelected(false);
        frame1.getjCheckBoxsosis().setSelected(false);
        frame1.getjCheckBoxspageti().setSelected(false);
        frame1.getjCheckBoxtarolatte().setSelected(false);
        frame1.getjCheckBoxvanilalatte().setSelected(false);
        frame1.getjCheckBoxwaffle().setSelected(false);
        frame1.getHasil().setText("");
        }
        
    }
//    public void reset(){
//        //total dan total item
//        frame1.setTotal(0);
//        frame1.setTotalItem(0);
//        //spinner
//        frame1.getjSpinnerKentang().setValue(0);
//        frame1.getjSpinnerRotiBakar().setValue(0);
//        frame1.getjSpinneramericano().setValue(0);
//        frame1.getjSpinnerburger().setValue(0);
//        frame1.getjSpinnerchocolatte().setValue(0);
//        frame1.getjSpinnercoffelatte().setValue(0);
//        frame1.getjSpinnerdimsum().setValue(0);
//        frame1.getjSpinnericetea().setValue(0);
//        frame1.getjSpinnerindomie().setValue(0);
//        frame1.getjSpinnerlemontea().setValue(0);
//        frame1.getjSpinnerlycheetea().setValue(0);
//        frame1.getjSpinnermatchalatte().setValue(0);
//        frame1.getjSpinnernnasgor().setValue(0);
//        frame1.getjSpinneronion().setValue(0);
//        frame1.getjSpinnerredvelvet().setValue(0);
//        frame1.getjSpinnersosis().setValue(0);
//        frame1.getjSpinnerspagetti().setValue(0);
//        frame1.getjSpinnertarolatte().setValue(0);
//        frame1.getjSpinnervanilalatte().setValue(0);
//        frame1.getjSpinnerwaffle().setValue(0);
//        //chceckbox
//        frame1.getjCheckBoxKentang().setSelected(false);
//        frame1.getjCheckBoxRotibakar().setSelected(false);
//        frame1.getjCheckBoxamericano().setSelected(false);
//        frame1.getjCheckBoxburger().setSelected(false);
//        frame1.getjCheckBoxchocolatte().setSelected(false);
//        frame1.getjCheckBoxcoffelatte().setSelected(false);
//        frame1.getjCheckBoxdimsum().setSelected(false);
//        frame1.getjCheckBoxicetea().setSelected(false);
//        frame1.getjCheckBoxindomie().setSelected(false);
//        frame1.getjCheckBoxlemontea().setSelected(false);
//        frame1.getjCheckBoxlycheetea().setSelected(false);
//        frame1.getjCheckBoxmatchalatte().setSelected(false);
//        frame1.getjCheckBoxnasgor().setSelected(false);
//        frame1.getjCheckBoxonion().setSelected(false);
//        frame1.getjCheckBoxredvelvet().setSelected(false);
//        frame1.getjCheckBoxsosis().setSelected(false);
//        frame1.getjCheckBoxspageti().setSelected(false);
//        frame1.getjCheckBoxtarolatte().setSelected(false);
//        frame1.getjCheckBoxvanilalatte().setSelected(false);
//        frame1.getjCheckBoxwaffle().setSelected(false);
//    }
    
    
    @Override
    public void SimpanData(String nama, String nomeja, String catatan) {
        frame2 = new CheckOutMenu(null,true);
        frame2.setVisible(true);
        
    }
    
}
