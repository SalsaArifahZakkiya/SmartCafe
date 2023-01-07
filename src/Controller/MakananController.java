
package Controller;

import Model.Makanan;
import View.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MakananController  {
    MenuView mv;
    private int x = 0;
    private int Total = 0;
    private int TotalItem = 0;

    public MakananController(MenuView mv) {
        this.mv = mv;
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
    
    public void setX(int x) {
        this.x = x;
    }
    public void setTotalItem(int totalItem) {
        this.TotalItem = totalItem;
    }
    public void setTotal(int total) {
        this.Total = total;
    }
    
    
    public boolean qtyIsZero(int qty){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Item Tidak Boleh Kosong, Mohon Masukkan Item Lagi!");
            return false;
        }
        return true;
    }
    
    public void duedate(){
        mv.getjTextFieldTotalItem().setText(String.valueOf(TotalItem));
        mv.getjTextFieldTotal().setText(String.valueOf(Total));
    }
    /*
    public void reset(){
        //total dan total item
        mv.setTotal(0);
        frame1.setTotalItem(0);
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
    }
    */
    class checkboxKentang implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int qty = Integer.parseInt(mv.getjSpinnerKentang().getValue().toString());
            if (qtyIsZero(qty) && mv.getjCheckBoxKentang().isSelected()){
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaKentang = 18000;
                int hasil = qty*hargaKentang;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelkentang().getText(), hargaKentang, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaRoti = 20000;
                int hasil = qty*hargaRoti;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelRoti().getText(), hargaRoti, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaBurger = 18000;
                int hasil = qty*hargaBurger;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelBurger().getText(), hargaBurger, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaDimsum = 20000;
                int hasil = qty*hargaDimsum;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelDimsum().getText(), hargaDimsum, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaIndomie = 15000;
                int hasil = qty*hargaIndomie;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelindomie().getText(), hargaIndomie, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaNasgor = 18000;
                int hasil = qty*hargaNasgor;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelNasiGoreng().getText(), hargaNasgor, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaOnion = 18000;
                int hasil = qty*hargaOnion;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelOnionRing().getText(), hargaOnion, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaSosis = 15000;
                int hasil = qty*hargaSosis;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelSosisGoreng().getText(), hargaSosis, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaSpagetti = 20000;
                int hasil = qty*hargaSpagetti;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelSpaghetti().getText(), hargaSpagetti, qty);
                m.inputDataMenu(mv,x);
                duedate();
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
                x++;
                if(x==1){
                   mv.SmartCafe(); 
                }
                int hargaWaffle = 20000;
                int hasil = qty*hargaWaffle;
                Total += hasil;
                TotalItem++;
                Makanan m = new Makanan(mv.getjLabelSpaghetti().getText(), hargaWaffle, qty);
                m.inputDataMenu(mv,x);
                duedate();
            }else {
                mv.getjCheckBoxwaffle().setSelected(false);
            }
        }
        
    }
}
