
package Controller;

import Model.Makanan;
import Model.MenuModel;
import Model.Minuman;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MinumanController {
    MenuView mv;
//    private int x = 0;
//    private int Total = 0;
//    private int TotalItem = 0;
    MenuController mc;
    
    public MinumanController(MenuView mv, MenuController mc){
        this.mv = mv;
        this.mc = mc;
        this.mv.setCeklisAmericano(new checkboxAmericano());
        this.mv.setCeklisChocolatte(new checkboxChocoLatte());
        this.mv.setCeklisCoffeLatte(new checkboxCoffeLatte());
        this.mv.setCeklisIceTea(new checkboxIceTea() );
        this.mv.setCeklisLemonTea(new checkboxLemonTea());
        this.mv.setCeklisLycheeTea(new checkboxLycheetea());
        this.mv.setCeklisMatchLatte(new checkboxMatchaLatte());
        this.mv.setCeklisRedvelvet(new checkboxRedvelvet());
        this.mv.setCeklisTaroLatte(new checkboxTaroLatte());
        this.mv.setCeklisVanilaLatte(new checkboxVanilaLatte());
    }
    
//    public ArrayList<Minuman> getListMinuman(){
//        return listMinuman;
//    }
//
//    public int getTotal() {
//        return Total;
//    }
//
//    public int getTotalItem() {
//        return TotalItem;
//    }
//    
//    
//    public void setX(int x) {
//        this.x = x;
//    }
//    public void setTotalItem(int totalItem) {
//        this.TotalItem = totalItem;
//    }
//    public void setTotal(int total) {
//        this.Total = total;
//    }
    
    
    public boolean qtyIsZero(int qty){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Item Tidak Boleh Kosong, Mohon Masukkan Item Lagi!");
            return false;
        }
        return true;
    }
//    
//    public void duedate(){
////        mv.getjTextFieldTotalItem().setText(String.valueOf(TotalItem));
//        mv.getjTextFieldTotal().setText(String.valueOf(Total));
//    }
    class checkboxAmericano implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           int qty = Integer.parseInt(mv.getjSpinneramericano().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxamericano().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaAmericano = 18000;
                int hasil = qty*hargaAmericano;
//                subTotal += hasil;

                MenuModel m = new Minuman(mv.getjLabelAmericano().getText(), hargaAmericano, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxamericano().setSelected(false);
            }
        }
        
    }
    class checkboxChocoLatte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerchocolatte().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxchocolatte().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaChocolatte = 18000;
                int hasil = qty*hargaChocolatte;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelChocolatte().getText(), hargaChocolatte, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxchocolatte().setSelected(false);
            }
        }
        
    }
    
    class checkboxCoffeLatte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnercoffelatte().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxcoffelatte().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaCoffelatte = 18000;
                int hasil = qty*hargaCoffelatte;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelCoffeLatte().getText(), hargaCoffelatte, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxcoffelatte().setSelected(false);
            }
        }
        
    }
    class checkboxIceTea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnericetea().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxicetea().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaIceTea = 15000;
                int hasil = qty*hargaIceTea;
//                Total += hasil;
                MenuModel m = new Minuman(mv.getjLabelIceTea().getText(), hargaIceTea, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxicetea().setSelected(false);
            }
        }
        
    }
    class checkboxLemonTea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerlemontea().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxlemontea().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaLemontea = 15000;
                int hasil = qty*hargaLemontea;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelLemonTea().getText(), hargaLemontea, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxlemontea().setSelected(false);
            }
        }
        
    }
    class checkboxLycheetea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerlycheetea().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxlycheetea().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaLycheetea = 15000;
                int hasil = qty*hargaLycheetea;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelLycheetea().getText(), hargaLycheetea, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxlycheetea().setSelected(false);
            }
        }
        
    }
    class checkboxMatchaLatte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           int qty = Integer.parseInt(mv.getjSpinnermatchalatte().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxmatchalatte().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaMatchalatte = 18000;
                int hasil = qty*hargaMatchalatte;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelMatchaLatte().getText(), hargaMatchalatte, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxmatchalatte().setSelected(false);
            } 
        }
        
    }
    class checkboxRedvelvet implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerredvelvet().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxredvelvet().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaRedvelvet = 18000;
                int hasil = qty*hargaRedvelvet;
//                Total += hasil;

                MenuModel m = new Minuman(mv.getjLabelRedVelvet().getText(), hargaRedvelvet, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxredvelvet().setSelected(false);
            }
        
        }
        
    }
    class checkboxTaroLatte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnertarolatte().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxtarolatte().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaTaroLatte= 18000;
                int hasil = qty*hargaTaroLatte;
//                Total += hasil;
                MenuModel m = new Minuman(mv.getjLabelTaroLatte().getText(), hargaTaroLatte, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxtarolatte().setSelected(false);
            }
        }
        
    }
    class checkboxVanilaLatte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnervanilalatte().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxvanilalatte().isSelected()){
                int i = mc.getX();
                if(i==1){
                   mv.SmartCafe(); 
                }
                int hargaVanilaLatte = 18000;
                int hasil = qty*hargaVanilaLatte;
//                Total += hasil;
                MenuModel m = new Minuman(mv.getjLabelVanilaLatte().getText(), hargaVanilaLatte, qty);
                m.inputDataMenu(mv,i);
                mc.tambahItemMenu(m);
                //mc.getListMenuModel().add(m);
                mc.duedate();
                mc.setX(i+1);
            }else {
                mv.getjCheckBoxvanilalatte().setSelected(false);
            }
        }
        
    }
}
