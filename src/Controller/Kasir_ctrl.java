/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Makanan;
import Model.MenuModel;
import Model.Minuman;
import Model.Pelanggan;
import Model.Pesanan;
import View.MenuDetailForm;
import View.MenuMasukForm;
import View.Payment;
import View.Preview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sound.sampled.ReverbType;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP Gaming
 */
public class Kasir_ctrl {
    private MenuMasukForm TampilanAwal;
    private MenuDetailForm TampilanDetail;
    private Payment Pay;
    private Preview Preview;
    private Connection con;
    private Statement state;
    private ResultSet rs;
    private String sql;
    private double subTotalAwal = 0;
    private double taxAwal = 0;
    private double totalAwal = 0;
    private DefaultTableModel modelAwal;
    int id = -1;
    private Pesanan pesanan = new Pesanan();
    private ArrayList<MenuModel> MenuAwal = new ArrayList<MenuModel>();
    private Pelanggan pelanggan = new Pelanggan();
    
    public Kasir_ctrl(MenuMasukForm masuk,MenuDetailForm detail, Payment bayar, Preview view){
        TampilanAwal = masuk;
        TampilanDetail = detail;
        Pay = bayar;
        Preview = view;
        modelAwal = new DefaultTableModel();
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
        TampilanDetail.btnPreview(new btnPreview());
        Pay.btnSubumit(new btnSubmit());

        getDataPesanan();
        //getDataDetailPesanan();
    }
    
    public void getDataPesanan() {
        try{
            con = Connections.getConnection();
            state = con.createStatement();
            sql = "SELECT ID_Pesanan, Nama_Pemesan, Nomor_Meja, Total FROM pesanan_table";
            rs = state.executeQuery(sql);
            
            DefaultTableModel model = TampilanAwal.getModelTable();
            while (rs.next()){
                Object o[] = {rs.getInt("ID_Pesanan"), rs.getString("Nama_Pemesan"), rs.getInt("Nomor_Meja"), rs.getDouble("Total")};
                model.addRow(o);
            }
            TampilanAwal.setTable(model);
        } catch(Exception e) {
            
        }
    }
    
    public void getDataDetailPesanan() {
        try{
            id = Integer.valueOf(TampilanAwal.getSelectedId());
            pesanan.setId(id);
            
            con = Connections.getConnection();
            state = con.createStatement();
            
            sql = "SELECT * FROM pesanan_table WHERE ID_Pesanan = " + id + "";
            rs = state.executeQuery(sql);
            if (rs.next()){
                pelanggan.setNama(rs.getString("Nama_Pemesan"));
                pelanggan.setNoMeja(rs.getString("Nomor_Meja"));
                pelanggan.setCatatanPesanan(rs.getString("Catatan"));
            }
            
            sql = "SELECT Nama_menu, Qty, Harga FROM pesanan WHERE ID_Pesanan = " + id + "";
            rs = state.executeQuery(sql);
            
            DefaultTableModel model = TampilanDetail.getModelTable();
            while(rs.next()){
                Object o[] = {rs.getString("Nama_menu"), rs.getInt("Qty"), rs.getDouble("Harga")};
                model.addRow(o);
                MenuModel menu = new Makanan(rs.getString("Nama_menu"),rs.getDouble("Harga") ,rs.getInt("Qty"));
                MenuAwal.add(menu);
                //modelAwal.addRow(o);
            }
            //modelAwal = model;
            pesanan.setListPesanan(MenuAwal);
            TampilanDetail.setTableDetail(model);
            sql = "SELECT Sub_Total, Tax, Total FROM pesanan_table WHERE ID_Pesanan = " + id + "";
            rs = state.executeQuery(sql);
            if(rs.next()){
                TampilanDetail.setTextTotal(rs.getDouble("Total"));
                TampilanDetail.setTextTax(rs.getDouble("Tax"));
                TampilanDetail.setTextSubtotal(rs.getDouble("Sub_Total"));
//                totalAwal = rs.getDouble("Total");
//                taxAwal = rs.getDouble("Tax");
//                subTotalAwal = rs.getDouble("Sub_Total");
                pesanan.setSubTotal(rs.getDouble("Sub_Total"));
                pesanan.setTax(rs.getDouble("Tax"));
                pesanan.setTotal(rs.getDouble("Total"));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ItemCost() {
        double sum = 0;
        double harga;
        double qty;
        
        for(int i = 0; i < TampilanDetail.getTablePesanan().getRowCount(); i++ )
        {
            harga = Double.parseDouble(TampilanDetail.getTablePesanan().getValueAt(i, 2).toString());
            qty = Double.parseDouble(TampilanDetail.getTablePesanan().getValueAt(i, 1).toString());
            sum += qty*harga;
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
                getDataDetailPesanan();
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
                Object o[] = {"Kentang Goreng", 1, PriceOfItem};
                model.addRow(o);
                MenuModel makan = new Makanan("Kentang Goreng", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
        }
        
        class btnRoti implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Roti Bakar", "1", PriceOfItem});
                MenuModel makan = new Makanan("Roti Bakar", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
             
            }
            
        }
        
        class btnIndomieGoreng implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;    
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Indomie Goreng", "1", PriceOfItem});
                MenuModel makan = new Makanan("Indomie Goreng", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnDimsum implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;    
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Dimsum", "1", PriceOfItem});
                MenuModel makan = new Makanan("Dimsum", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
    
        
        class btnWaffle implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Waffle", "1", PriceOfItem});
                MenuModel makan = new Makanan("Waffle", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnBurger implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Burger", "1", PriceOfItem});
                MenuModel makan = new Makanan("Burger", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnSpagetti implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 20000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Spagetti", "1", PriceOfItem});
                MenuModel makan = new Makanan("Spagetti", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnOnion implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Onion Ring", "1", PriceOfItem});
                MenuModel makan = new Makanan("Onion Ring", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnSosis implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Sosis Goreng", "1", PriceOfItem});
                MenuModel makan = new Makanan("Sosis Goreng", PriceOfItem, 1);
                pesanan.addMenu(makan);
                ItemCost();
            }
            
        }
        
        class btnNasGor implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;     
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Nasi Goreng", "1", PriceOfItem});
                MenuModel makan = new Makanan("Nasi Goreng", PriceOfItem, 1);
                pesanan.addMenu(makan);
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
                MenuModel minuman = new Minuman("Americano Coffee", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }
            
        }
        
        class btnCoffeeLatte implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Coffee Latte", "1", PriceOfItem}); 
                MenuModel minuman = new Minuman("Coffee Latte", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }
            
        }
        
        class btnIceTea implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;       
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Ice Tea", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Ice Tea", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }

        }
        
        class btnLychee implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Lychee Tea", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Lychee Tea", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }
            
        }
        
        class btnLemon implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 15000.0;     
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Lemon Tea", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Lemon Tea", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }
            
        }
        
        class btnTaro implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;        
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Taro Latte", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Taro Latte", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }
            
        }
        
        class btnMatcha implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {          
                double PriceOfItem = 18000.0;
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Matcha Latte", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Matcha Latte", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
        }
        }
        
        class btnRedVelvet implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;   
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Red Velvet Latte", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Red Velvet Latte", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
        }
        }
        
        class btnVanilla implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PriceOfItem = 18000.0;   
                DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
                model.addRow(new Object[]{"Vanilla Latte", "1", PriceOfItem});
                MenuModel minuman = new Minuman("Vanilla Latte", PriceOfItem, 1);
                pesanan.addMenu(minuman);
                ItemCost();
            }  
        }
        
        class btnChoco implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double PriceOfItem = 18000.0;
            DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
            model.addRow(new Object[]{"Choco Latte", "1", PriceOfItem});
            MenuModel minuman = new Minuman("Choco Latte", PriceOfItem, 1);
            pesanan.addMenu(minuman);
            ItemCost();
        }
            
        }
         
        
//===============BUTTON LAIN===========
        
        class btnReset implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//             DefaultTableModel model = (DefaultTableModel) TampilanDetail.getTablePesanan().getModel();
//            model.setRowCount(0);
            //TampilanDetail.setTableDetail(modelAwal);
//            TampilanDetail.getTxtSubtotal().setText(String.valueOf(subTotalAwal));
//            TampilanDetail.getTxtTax().setText(String.valueOf(taxAwal));
//            TampilanDetail.getTxtTotal().setText(String.valueOf(totalAwal));
            DefaultTableModel model = TampilanDetail.getModelTable();
            while(model.getRowCount() > 0){
                model.removeRow(0);
            }
            if(id >= 0){
                getDataDetailPesanan();
            }
            
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
            String SubTotalBaru = TampilanDetail.getTxtSubtotal().getText().replaceAll("Rp ", "");
            SubTotalBaru = SubTotalBaru.replaceAll(",0", "");
            String TaxBaru = TampilanDetail.getTxtTax().getText().replaceAll("Rp ", "");
            TaxBaru = TaxBaru.replaceAll(",0", "");
            String TotalBaru = TampilanDetail.getTxtTotal().getText().replaceAll("Rp ", "");
            TotalBaru = TotalBaru.replaceAll(",0", "");
            pesanan.setSubTotal(Double.valueOf(SubTotalBaru));
            pesanan.setTax(Double.valueOf(TaxBaru));
            pesanan.setTotal(Double.valueOf(TotalBaru));
            tablePay();
            

            }
        }
        
        public void tablePay(){
            DefaultTableModel model = (DefaultTableModel) Pay.getTabelPesanan().getModel();
            Object[] o = {pelanggan.getNama(), pelanggan.getNoMeja(), pesanan.getTotal()};
            model.addRow(o);
            
        }
        
        class btnPreview implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Preview.setVisible(true);
            setStruk();
        }
            
        }
        
        class btnSubmit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                con = Connections.getConnection();
                state = con.createStatement();
                sql = "UPDATE pesanan_table SET Sub_Total="+pesanan.getSubTotal()+", Tax="+pesanan.getTax()+", Total="+pesanan.getTotal()+" WHERE ID_Pesanan="+pesanan.getIDPesanan()+"";
                state.executeUpdate(sql);
                
                sql = "SELECT COUNT(*) as jumlah FROM pesanan WHERE ID_Pesanan="+pesanan.getIDPesanan()+"";
                rs = state.executeQuery(sql);
                int jumlah = 0;
                if(rs.next()){
                    jumlah = rs.getInt(1);
                }
                System.out.println("Jumlah:"+jumlah);
                ArrayList<MenuModel> list = pesanan.getListmenupesan();
                for(int i=0;i<pesanan.getListmenupesan().size();i++){
                    sql = "INSERT into pesanan(ID_Pesanan, Nama_menu, Qty, Harga) VALUES("+pesanan.getIDPesanan()+", '"+list.get(i).getNama()+"', "+list.get(i).getQty()+", "+list.get(i).getHarga()+")";
                    state.execute(sql);
                    
                }
                Pay.setVisible(false);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
            
        }
        
        public void setStruk(){
            JTextArea txtStruk = Preview.getTxtArea();
            for(MenuModel m:pesanan.getListmenupesan()){
                txtStruk.setText(txtStruk.getText()+m.getNama()+"\n");
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

