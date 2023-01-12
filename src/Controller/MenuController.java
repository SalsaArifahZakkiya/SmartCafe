
package Controller;

import Model.Makanan;
import Model.MenuModel;
import Model.Minuman;
import Model.Pelanggan;
import Model.Pesanan;

import View.CheckOutMenu;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MenuController{    
//    private Model.MenuModel Menu_Model;
//    private Model.Pelanggan Pelanggan_Model;
//    private Model.Pesanan Pesanan_Model;
//    private Model.Makanan makanan_Model;
//    private Model.Minuman minuman_Model;
    
    private MenuView frame1;
    private CheckOutMenu frame2;
    private MakananController controlMakan;
    private MinumanController controlMinum;
    
    
    private int x = 1;
    private int counterMenu = 0;
    private double subTotal;
    private Pesanan pesanan = new Pesanan();
    
    private ArrayList<MenuModel> listMenu = new ArrayList<MenuModel>();
    
    public MenuController(MenuView f, MakananController controlMakanan, MinumanController controlMinuman) {
        frame1 = f;
        controlMakan = controlMakanan;
        controlMinum = controlMinuman;
        this.frame1.setBtnReset(new btnReset());
        this.frame1.setBtnOrder(new btnOrder());
    }
    
    public MenuController(MenuView f) {
        frame1 = f;
        this.frame1.setBtnReset(new btnReset());
        this.frame1.setBtnOrder(new btnOrder());
    }


    public MenuController(MenuModel Menu_Model, Pelanggan Pelanggan_Model, Pesanan Pesanan_Model) {
        this.pesanan = Pesanan_Model;
        this.frame1.setBtnReset(new btnReset());
        this.frame1.setBtnOrder(new btnOrder());
    }

    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
//    
//    public double getTax() {
//        return (this.subTotal*4/100);
//    }
//    
//    public double getTotal(){
//        return tax+subTotal;
//    }
//    
//    public double getSubTotal() {
//        return subTotal;
//    }
//
//    public void setSubTotal(double subTotal) {
//        this.subTotal = subTotal;
//    }
//
//    public void setTotal(double Total) {
//        this.Total = Total;
//    }
//
//    public void setTax(double tax) {
//        this.tax = tax;
//    }
//    
    
    public void tambahItemMenu(MenuModel menu){
        
        try{
            this.pesanan.addMenu(menu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public void duedate(){
//        mv.getjTextFieldTotalItem().setText(String.valueOf(TotalItem));
//        
//        for(MenuModel m:listMenu){
//            hitungsubTotal += m.getPrice();
//        }
        pesanan.setSubTotal(pesanan.getSubTotal() + pesanan.getSelectedMenu(counterMenu).getPrice());
        pesanan.setTax(pesanan.getSubTotal() * 4/100);
        pesanan.setTotal(pesanan.getSubTotal() + pesanan.getTax());
        frame1.getjTextFieldTotal().setText(String.valueOf(pesanan.getTotal()));
        frame1.getjTextFieldSubtotal().setText(String.valueOf(pesanan.getSubTotal()));
        frame1.getjTextFieldtax().setText(String.valueOf(pesanan.getTax()));
    }
    
    public void showDeafultView(){
        frame1.setVisible(true);
    }
    public ArrayList<MenuModel> getListMenuModel(){
        return listMenu;
    }

    class btnReset implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//        controlMakan.setTotal(0);
//        controlMakan.setTotalItem(0);
        setX(1);
        pesanan.setTotal(0);
        pesanan.setSubTotal(0);
        pesanan.setTax(0);
 //       controlMinum.setTotalItem(0);
        //controlMinum.setX(0);
        frame1.getjTextFieldSubtotal().setText("0");
        frame1.getjTextFieldtax().setText("0");
        frame1.getjTextFieldTotal().setText("0");
       // frame1.getjTextFieldTotalItem().setText("0");
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
    class btnOrder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<MenuModel> listMenu = pesanan.getListmenupesan();//keknya disini eror nya
            if(listMenu.isEmpty()){
                JOptionPane.showMessageDialog(null, "Anda belum memilih item, Mohon Masukkan Item terlebih dahulu!");
            }else{
            //ketika button order di klik, maka user di haruskan memasukan data pesanan agar ada di tampilan struk(gimana carana?)
            frame2  = new CheckOutMenu(null,true);
            CheckOutController control = new CheckOutController(frame2, listMenu, pesanan);
            frame2.setVisible(true);
            
            frame1.getHasil().setText(frame1.getHasil().getText()
                    +"\n**********************************************************\n"
                    +"Nama : " + frame2.getNama() + "\n"
                    +"No Meja : " + frame2.getNoMeja() + "\n"
                    +"Catatan : " + frame2.getCatatan() + "\n"
                    +"Jenis Pesanan : " + frame2.getJenisPesanan() + "\n"
                    +"SubTotal: " + pesanan.getSubTotal() + "\n"
                    +"Tax: " + pesanan.getTax() + "\n"
                    +"Total: " + pesanan.getTotal() + "\n"
                    +"\n******************** Terima kasih ************************\n"
                    +"\n************ Tunggu Pesanan mu jadi ya :) ***************\n"
                    
            );
            frame1.getBtnOrder().setEnabled(false);
        }
        }
        
    }
    
}
