
package Controller;

import Model.Makanan;
import Model.MenuModel;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MakananController  {
    MenuView mv;
//    private int x = 0;
//    private double subTotal = 0;
//    private double Total = 0;
//    private double tax = 0;
//    private int TotalItem = 0; 
    MenuController mc;
    public MakananController(MenuView mv, MenuController mc) {
        this.mv = mv;
        this.mc = mc;
        this.mv.setCeklisKentang(new checkboxKentang());
        this.mv.setCeklisBurger(new checkboxBurger());
        this.mv.setCeklisDimsum(new checkboxDimsum());
        this.mv.setCeklisIndomie(new checkboxIndomie());
        this.mv.setCeklisNasgor(new checkboxNasgor());
        this.mv.setCeklisOnion(new checkboxOnion());
        this.mv.setCeklisRotiBakar(new checkboxRotiBakar());
        this.mv.setCeklisSosis(new checkboxSosis());
        this.mv.setCeklisSpagetti(new checkboxSpagetti());
        this.mv.setCeklisWaffle(new checkboxWaffle());
        
    }
//    
//    public ArrayList<Makanan> getListMakanan(){
//        return listMakanan;
//    }
//     
//
//    public double getTax() {
//        return tax = (this.subTotal*4/100);
//    }
//    
//    public double getTotal(){
//        return Total;
//    }
//    
//    public double getSubTotal() {
//        return subTotal;
//    }
    
//
//    public int getTotalItem() {
//        return TotalItem;
//    }
//    
//    public void setX(int x) {
//        this.x = x;
//    }
//    public void setTotalItem(int totalItem) {
//        this.TotalItem = totalItem;
//    }
//    public void setTotal(int subtotal) {
//        this.subTotal = subtotal;
//    }
    
    
    public boolean qtyIsZero(int qty){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Item Tidak Boleh Kosong, Mohon Masukkan Item Lagi!");
            return false;
        }
        return true;
    }
    
//    public void duedate(){
////        mv.getjTextFieldTotalItem().setText(String.valueOf(TotalItem));
//        mv.getjTextFieldTotal().setText(String.valueOf(Total));
//    }
    class checkboxKentang implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerKentang().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxKentang().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaKentang = 18000;
                int hasil = qty*hargaKentang;
//                subTotal += hasil;

                MenuModel m = new Makanan(mv.getjLabelkentang().getText(), hargaKentang, qty);
                m.inputDataMenu(mv,i);
                //mc.getListMenuModel().add(m);
                mc.tambahItemMenu(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxKentang().setSelected(false);
            }
        }
        
    }
    
    class checkboxRotiBakar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerRotiBakar().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxRotibakar().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaRoti = 20000;
                int hasil = qty*hargaRoti;
//                subTotal += hasil;
 
                MenuModel m = new Makanan(mv.getjLabelRoti().getText(), hargaRoti, qty);
                m.inputDataMenu(mv,i);
                //mc.getListMenuModel().add(m);
                mc.tambahItemMenu(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxKentang().setSelected(false);
            }
        }
        
    }
    class checkboxBurger implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerburger().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxburger().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaBurger = 18000;
                int hasil = qty*hargaBurger;
//                subTotal += hasil;
 
                MenuModel m = new Makanan(mv.getjLabelBurger().getText(), hargaBurger, qty);
                m.inputDataMenu(mv,i);
                //mc.getListMenuModel().add(m);
                mc.tambahItemMenu(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxKentang().setSelected(false);
            }
        }
        
    }
    class checkboxDimsum implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerdimsum().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxdimsum().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaDimsum = 20000;
                int hasil = qty*hargaDimsum;
//                subTotal += hasil;
 
                MenuModel m = new Makanan(mv.getjLabelDimsum().getText(), hargaDimsum, qty);
                m.inputDataMenu(mv,i);
                //mc.getListMenuModel().add(m);
                mc.tambahItemMenu(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxKentang().setSelected(false);
            }
        }
        
    }
    class checkboxIndomie implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerindomie().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxindomie().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaIndomie = 15000;
                int hasil = qty*hargaIndomie;
//                subTotal += hasil;

                MenuModel m = new Makanan(mv.getjLabelindomie().getText(), hargaIndomie, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxindomie().setSelected(false);
            }
        }
        
    }
    class checkboxNasgor implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnernnasgor().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxnasgor().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaNasgor = 18000;
                int hasil = qty*hargaNasgor;
//                subTotal += hasil;

                MenuModel m = new Makanan(mv.getjLabelNasiGoreng().getText(), hargaNasgor, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxnasgor().setSelected(false);
            }
        }
        
    }
    class checkboxOnion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinneronion().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxonion().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaOnion = 18000;
                int hasil = qty*hargaOnion;
//                subTotal += hasil;

                MenuModel m = new Makanan(mv.getjLabelOnionRing().getText(), hargaOnion, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxonion().setSelected(false);
            }
        }
        
    }
    class checkboxSosis implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnersosis().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxsosis().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaSosis = 15000;
                int hasil = qty*hargaSosis;
//                subTotal += hasil;
 
                MenuModel m = new Makanan(mv.getjLabelSosisGoreng().getText(), hargaSosis, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxsosis().setSelected(false);
            }
        }
        
    }
    class checkboxSpagetti implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerspagetti().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxspageti().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaSpagetti = 20000;
                int hasil = qty*hargaSpagetti;
//                subTotal += hasil;
  
                Makanan m = new Makanan(mv.getjLabelSpaghetti().getText(), hargaSpagetti, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxspageti().setSelected(false);
            }
        }
        
    }
    class checkboxWaffle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerwaffle().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxwaffle().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaWaffle = 20000;
                int hasil = qty*hargaWaffle;
//                subTotal += hasil;
   
                MenuModel m = new Makanan(mv.getjLabelSpaghetti().getText(), hargaWaffle, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxwaffle().setSelected(false);
            }
        }
        
    }
}
