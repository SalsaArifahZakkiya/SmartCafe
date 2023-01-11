/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuDetailForm;
import View.MenuMasukForm;
import View.Payment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP Gaming
 */
public class Kasir_ctrl {
    private MenuMasukForm TampilanAwal;
    private MenuDetailForm TampilanDetail;
    private Payment Pay;
    
    public Kasir_ctrl(MenuMasukForm masuk,MenuDetailForm detail, Payment bayar){
        TampilanAwal = masuk;
        TampilanDetail = detail;
        Pay = bayar;
        TampilanAwal.btnLihat(new btnLihat());
        TampilanDetail.btnKentang(new btnKentang());
        TampilanDetail.btnRoti(new btnRoti());
        TampilanDetail.btnIndomieGoreng(new btnIndomieGoreng());
        TampilanDetail.btnDimsum(new btnDimsum());
        TampilanDetail.btnWaffle(new btnWaffle());
        TampilanDetail.btnBurger(new btnBurger());
        TampilanDetail.btnSpagetti(new btnSpagetti());
        TampilanDetail.btnOnion(new btnOnion());
        TampilanDetail.btnSosis(new btnSosis());
        TampilanDetail.btnNasGor(new btnNasGor());
        //Minuman
        TampilanDetail.btnAmericano(new btnAmericano());
        TampilanDetail.btnCoffee(new btnCoffeeLatte());
        TampilanDetail.btnIceTea(new btnIceTea());
        TampilanDetail.btnLychee(new btnLychee());
        TampilanDetail.btnLemon(new btnLemon());
        TampilanDetail.btnTaro(new btnTaro());
        TampilanDetail.btnMatcha(new btnMatcha());
        TampilanDetail.btnRedVelvet(new btnRedVelvet());
        TampilanDetail.btnVanilla(new btnVanilla());
        TampilanDetail.btnChoco(new btnChoco());
        //Button Lain
        TampilanDetail.btnReset(new btnReset());
        TampilanDetail.btnRemove(new btnRemove());
        TampilanDetail.btnPay(new btnPay());

    }
    
    public void ItemCost() {
        double sum = 0;
        
        for(int i = 0; i < TampilanDetail.getTablePesanan().getRowCount(); i++ )
        {
            sum += Double.parseDouble(TampilanDetail.getTablePesanan().getValueAt(i, 2).toString());  
        }
        //CARA RIBETTT
        //sum akan ditampilkan pada bagian text field subtotal
        TampilanDetail.getTxtSubtotal().setText(Double.toString(sum));
        //variabel cTotal1 dignakan untuk perhitungan pajak
        //cTotal1 sama dengan SubTotal, artinya total sebelum kena pajak
        double cTotal1 = Double.parseDouble(TampilanDetail.getTxtSubtotal().getText());
        double cTax = (cTotal1*3.9)/100; //variabel cTax untuk perhitungan pajak
        String iTaxTotal = String.format("Rp %.1f", cTax);
        TampilanDetail.getTxtTax().setText(iTaxTotal); //ngeset iTaxTotal untuk ditampilkan di text field text
        
        String iSubTotal = String.format("Rp %.1f", cTotal1);
        TampilanDetail.getTxtSubtotal().setText(iSubTotal);
        
        String iTotal = String.format("Rp %.1f", cTotal1 + cTax);
        TampilanDetail.getTxtTotal().setText(iTotal);
    }
    
    class btnLihat implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JTable model = TampilanAwal.getTable();

            int OpenPesanan = model.getSelectedRow();
            if (OpenPesanan >= 0) {
                TampilanAwal.setVisible(false);
                TampilanDetail.setVisible(true);
//                MenuDetailForm LihatDetail = new MenuDetailForm();
//                LihatDetail.setVisible(true);
//                T
            }
        }
    }

// ==================BUTTON MAKANAN========================
    
        class btnKentang implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                Object o[] = {"Kentang Goreng", "1", PriceOfItem};
                model.addRow(o);
                ItemCost();
            }
        }
        
        class btnRoti implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Roti Bakar", "1", PriceOfItem});
                ItemCost();
             
            }
            
        }
        
        class btnIndomieGoreng implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;    
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Indomie Goreng", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnDimsum implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;    
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Dimsum", "1", PriceOfItem});
                ItemCost();
            }
            
        }
    
        
        class btnWaffle implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Waffle", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnBurger implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Burger", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnSpagetti implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Spagetti", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnOnion implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Onion Ring", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnSosis implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Sosis Goreng", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnNasGor implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;     
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Nasi Goreng", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
// ========================BUTTON MINUMAN=============================
        
        class btnAmericano implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Americano Coffee", "1", PriceOfItem});               
                ItemCost();
            }
            
        }
        
        class btnCoffeeLatte implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Coffee Latte", "1", PriceOfItem});               
                ItemCost();
            }
            
        }
        
        class btnIceTea implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Ice Tea", "1", PriceOfItem});
                ItemCost();
            }

        }
        
        class btnLychee implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Lychee Tea", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnLemon implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;     
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Lemon Tea", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnTaro implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Taro Latte", "1", PriceOfItem});
                ItemCost();
            }
            
        }
        
        class btnMatcha implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {          
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Matcha Latte", "1", PriceOfItem});
                ItemCost();
        }
        }
        
        class btnRedVelvet implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;   
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Red Velvet Latte", "1", PriceOfItem});
                ItemCost();
        }
        }
        
        class btnVanilla implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;   
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Vanilla Latte", "1", PriceOfItem});
                ItemCost();
            }  
        }
        
        class btnChoco implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double PriceOfItem = 18000.0;
            DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
            model.addRow(new Object[]{"Choco Latte", "1", PriceOfItem});
            ItemCost();
        }
            
        }
         
        
//===============BUTTON LAIN===========
        
        class btnReset implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
            model.setRowCount(0);
            TampilanDetail.getTxtSubtotal().setText("");
            TampilanDetail.getTxtTax().setText("");
            TampilanDetail.getTxtTotal().setText("");
        }
            
        }
        
        class btnRemove implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
        
            int RemoveItem = TampilanDetail.getTablePesanan().getSelectedRow();
            if (RemoveItem >= 0){
                model.removeRow(RemoveItem);
                ItemCost();
            }
        }
            
        }
        
        class btnPay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Pay.setVisible(true);

            }
        }

         
    
//        class btnKentang implements ActionListener  
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            double PriceOfItem = 18000.0;
//            DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
//            model.addRow(new Object[]{"Kentang Goreng", "1", PriceOfItem});
//        }
//            
//        }
    
//    public void btnKentang() {
//        double PriceOfItem = 18000.0;       
//        DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
//        model.addRow(new Object[]{"Kentang Goreng", "1", PriceOfItem});
//        
//    }
    
}

