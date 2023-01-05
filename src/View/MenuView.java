
package View;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuView extends javax.swing.JFrame {

    private int Total = 0;
    private int x = 0;
    private int TotalItem = 0;
    private static int Terjual1 = 18;
    private static int Terjual2 ;
    private static int Terjual3 ;
    private static int Terjual4 ;
    private static int Terjual5 ;
    private static int Terjual6 ;
    private static int Terjual7 ;
    private static int Terjual8 ;
    private static int Terjual9 ;
    private static int Terjual10 ;
    private static int Terjual11 ;
    private static int Terjual12 ;
    private static int Terjual13 ;
    private static int Terjual14 ;
    private static int Terjual15 ;
    private static int Terjual16 ;
    private static int Terjual17 ;
    private static int Terjual18 ;
    private static int Terjual19 ;
    private static int Terjual20 ;
    public MenuView() {
        initComponents();
        init();
    }
    
    public void init(){
        setImageMakanan();
        setImageMinuman();
        setTime();
    }
    
    public void setImageMakanan(){
        //gambar kentang goreng
        ImageIcon icon = new ImageIcon(getClass().getResource("/Image/KentangGoreng.png"));
        Image img = icon.getImage().getScaledInstance(jLabelimageKentang.getWidth(), jLabelimageKentang.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageKentang.setIcon(new ImageIcon(img));
        
        //gambar roti bakar 
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Image/RotiBakar.png"));
        Image img2 = icon2.getImage().getScaledInstance(jLabelimageRoti.getWidth(), jLabelimageRoti.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageRoti.setIcon(new ImageIcon(img2));
        
        //gambar indomie goreng 
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/Image/IndomieGoreng.png"));
        Image img3 = icon3.getImage().getScaledInstance(jLabelimageIndomie.getWidth(), jLabelimageIndomie.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageIndomie.setIcon(new ImageIcon(img3));
        
        //gambar dimsum 
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/Image/Dimsum.png"));
        Image img4 = icon4.getImage().getScaledInstance(jLabelimageDimsum.getWidth(), jLabelimageDimsum.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageDimsum.setIcon(new ImageIcon(img4));
        
        //gambar waffle
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/Image/Waffle.png"));
        Image img5 = icon5.getImage().getScaledInstance(jLabelimageWaffle.getWidth(), jLabelimageWaffle.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageWaffle.setIcon(new ImageIcon(img5));
        
        //gambar burger 
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/Image/Burger.png"));
        Image img6 = icon6.getImage().getScaledInstance(jLabelimageBurger.getWidth(), jLabelimageBurger.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageBurger.setIcon(new ImageIcon(img6));
        
        //gambar spagheti 
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/Image/Spagetti.png"));
        Image img7 = icon7.getImage().getScaledInstance(jLabelimageSpagetti.getWidth(), jLabelimageSpagetti.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageSpagetti.setIcon(new ImageIcon(img7));
        
        //gambar onion ring
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/Image/onionring.png"));
        Image img8 = icon8.getImage().getScaledInstance(jLabelimageOnion.getWidth(), jLabelimageOnion.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageOnion.setIcon(new ImageIcon(img8));
        
        //gambar sosis goreng 
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/Image/sosis.png"));
        Image img9 = icon9.getImage().getScaledInstance(jLabelimageSosis.getWidth(), jLabelimageSosis.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageSosis.setIcon(new ImageIcon(img9));
        
        //gambar nasgor 
        ImageIcon icon10 = new ImageIcon(getClass().getResource("/Image/Nasgor.png"));
        Image img10 = icon10.getImage().getScaledInstance(jLabelimageNasgor.getWidth(), jLabelimageNasgor.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageNasgor.setIcon(new ImageIcon(img10));
    }
    public void setImageMinuman(){
        //gambar Americano
        ImageIcon icon = new ImageIcon(getClass().getResource("/ImageMinuman/americano.png"));
        Image img = icon.getImage().getScaledInstance(jLabelimageAmericano.getWidth(), jLabelimageAmericano.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageAmericano.setIcon(new ImageIcon(img));
        
        //gambar Coffe latte
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/ImageMinuman/coffelatte.png"));
        Image img2 = icon2.getImage().getScaledInstance(jLabelimageCoffeLatte.getWidth(), jLabelimageCoffeLatte.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageCoffeLatte.setIcon(new ImageIcon(img2));
        
        //gambar Ice Tea
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/ImageMinuman/icetea.png"));
        Image img3 = icon3.getImage().getScaledInstance(jLabelimageIceTea.getWidth(), jLabelimageIceTea.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageIceTea.setIcon(new ImageIcon(img3));
        
        //gambar lychee tea
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/ImageMinuman/lycheetea.png"));
        Image img4 = icon4.getImage().getScaledInstance(jLabelimageLycheetea.getWidth(), jLabelimageLycheetea.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageLycheetea.setIcon(new ImageIcon(img4));
        
        //gambar lemon tea
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/ImageMinuman/lemontea.png"));
        Image img5 = icon5.getImage().getScaledInstance(jLabelimageLemonTea.getWidth(), jLabelimageLemonTea.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageLemonTea.setIcon(new ImageIcon(img5));
        
        //gambar Matcha latte
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/ImageMinuman/matchalatte.png"));
        Image img6 = icon6.getImage().getScaledInstance(jLabelimageMatcha.getWidth(), jLabelimageMatcha.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageMatcha.setIcon(new ImageIcon(img6));
        
        //gambar red velvet latte
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/ImageMinuman/Redvelvetlatte.png"));
        Image img7 = icon7.getImage().getScaledInstance(jLabelimageRedvelvet.getWidth(), jLabelimageRedvelvet.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageRedvelvet.setIcon(new ImageIcon(img7));
        
        //gambar taro latte
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/ImageMinuman/tarolatte.png"));
        Image img8 = icon8.getImage().getScaledInstance(jLabelimageTaro.getWidth(), jLabelimageTaro.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageTaro.setIcon(new ImageIcon(img8));
        
        //gambar vanilla latte
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/ImageMinuman/vanillalatte.png"));
        Image img9 = icon9.getImage().getScaledInstance(jLabelimageVanila.getWidth(), jLabelimageVanila.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageVanila.setIcon(new ImageIcon(img9));
        
        //gambar Choco latte
        ImageIcon icon10 = new ImageIcon(getClass().getResource("/ImageMinuman/chocolatte.png"));
        Image img10 = icon10.getImage().getScaledInstance(jLabelimageChoco.getWidth(), jLabelimageChoco.getHeight(), Image.SCALE_SMOOTH);
        jLabelimageChoco.setIcon(new ImageIcon(img10));
    }
    public void reset(){
        Total = 0;
        x = 0;
        TotalItem = 0;
        btnOrder.setEnabled(true);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);
        jSpinner20.setValue(0);
        jSpinner21.setValue(0);
        jTextFieldTotalItem.setText("0");
        jTextFieldTotal.setText("0");
        jTextAreaHasil.setText(".");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jTerjual1.setText(Integer.toString(0));
        
    }
    
    //mengecek apakah qty kosong atau tidak
    public boolean qtyIsZero(int qty){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Item Tidak Boleh Kosong, Mohon Masukkan Item Lagi!");
            return false;
        }
        return true;
    }
    
    //untuk membuat waktu realtime
    public void setTime(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxtTime.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }
    //menghitung total item, total, dan terjual
    public void duedate(){
        jTextFieldTotalItem.setText(String.valueOf(TotalItem));
        jTextFieldTotal.setText(String.valueOf(Total));
        jTerjual1.setText(Integer.toString(Terjual1));//masi belum bener karena kalo nambahin data nya ga bisa ketambah
        jTerjual2.setText(Integer.toString(Terjual2));
        jTerjual3.setText(Integer.toString(Terjual3));
        jTerjual4.setText(Integer.toString(Terjual4));
        jTerjual5.setText(Integer.toString(Terjual5));
        jTerjual6.setText(Integer.toString(Terjual6));
        jTerjual7.setText(Integer.toString(Terjual7));
        jTerjual8.setText(Integer.toString(Terjual8));
        jTerjual9.setText(Integer.toString(Terjual9));
        jTerjual10.setText(Integer.toString(Terjual10));
        jTerjual11.setText(Integer.toString(Terjual11));
        jTerjual12.setText(Integer.toString(Terjual12));
        jTerjual13.setText(Integer.toString(Terjual13));
        jTerjual14.setText(Integer.toString(Terjual14));
        jTerjual15.setText(Integer.toString(Terjual15));
        jTerjual16.setText(Integer.toString(Terjual16));
        jTerjual17.setText(Integer.toString(Terjual17));
        jTerjual18.setText(Integer.toString(Terjual18));
        jTerjual19.setText(Integer.toString(Terjual19));
        jTerjual20.setText(Integer.toString(Terjual20));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelimageKentang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTerjual1 = new javax.swing.JLabel();
        jDisukai1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelimageRoti = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jTerjual2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelimageIndomie = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jTerjual3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelimageDimsum = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel69 = new javax.swing.JLabel();
        jTerjual4 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabelimageWaffle = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel42 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel73 = new javax.swing.JLabel();
        jTerjual5 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelimageBurger = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel77 = new javax.swing.JLabel();
        jTerjual6 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabelimageSpagetti = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jTerjual7 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabelimageOnion = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jTerjual8 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabelimageSosis = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel89 = new javax.swing.JLabel();
        jTerjual9 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabelimageNasgor = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel67 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel93 = new javax.swing.JLabel();
        jTerjual10 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabelimageAmericano = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel102 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jTerjual11 = new javax.swing.JLabel();
        jdisukai11 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabelimageCoffeLatte = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel111 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTerjual12 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabelimageIceTea = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jLabel120 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTerjual13 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabelimageLycheetea = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel129 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jTerjual14 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabelimageLemonTea = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jLabel138 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jTerjual15 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabelimageMatcha = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jLabel147 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jTerjual16 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabelimageRedvelvet = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel156 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jTerjual17 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabelimageTaro = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jLabel165 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jTerjual18 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabelimageVanila = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jLabel174 = new javax.swing.JLabel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jTerjual19 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabelimageChoco = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jLabel183 = new javax.swing.JLabel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jTerjual20 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldTotalItem = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1444, 787));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1444, 787));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(1431, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SMART CAFE ");

        jTxtTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel28.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel28MouseDragged(evt);
            }
        });
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel28MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTxtTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTxtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("MENU");

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1057, 601));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel5.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Kentang Goreng");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Harga    :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Rp 18000");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Item       :");

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Beli       :");

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Terjual   :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Disukai  :");

        jTerjual1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual1.setText("18");

        jDisukai1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jDisukai1.setText("201");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageKentang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDisukai1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabelimageKentang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDisukai1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel6.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Roti Bakar");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("Harga   :");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("Rp 20000");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("Item      :");

        jSpinner5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jSpinner5.setMinimumSize(new java.awt.Dimension(33, 30));
        jSpinner5.setPreferredSize(new java.awt.Dimension(33, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel27.setText("Beli       :");

        jCheckBox5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Terjual   :");

        jTerjual2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual2.setText("209");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Disukai  :");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("100");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageRoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBox5)))
                    .addComponent(jLabel23)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabelimageRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel8.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Indomie Goreng");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel29.setText("Harga   :");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setText("Rp 15000");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setText("Item      :");

        jSpinner6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jSpinner6.setPreferredSize(new java.awt.Dimension(33, 30));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setText("Beli       :");

        jCheckBox6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("Terjual   :");

        jTerjual3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual3.setText("217");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel22.setText("Disukai  :");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel68.setText("190");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageIndomie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBox6))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabelimageIndomie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual3)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel68))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel9.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText("Dimsum");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel34.setText("Harga   :");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setText("Rp 20000");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel36.setText("Item      :");

        jSpinner7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel37.setText("Beli       :");

        jCheckBox7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel69.setText("Terjual   :");

        jTerjual4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual4.setText("208");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel71.setText("Disukai  :");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel72.setText("109");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageDimsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jCheckBox7)))
                    .addComponent(jLabel33)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabelimageDimsum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual4)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel10.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setText("Waffle");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel39.setText("Harga      :");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel40.setText("Rp 20000");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel41.setText("Item         :");

        jSpinner8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel42.setText("Beli       :");

        jCheckBox8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel73.setText("Terjual   :");

        jTerjual5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual5.setText("197");

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel75.setText("Disukai  :");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel76.setText("180");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageWaffle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner8))
                            .addComponent(jCheckBox8)))
                    .addComponent(jLabel38)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabelimageWaffle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual5)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel11.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel43.setText("Burger");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel44.setText("Harga   :");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel45.setText("Rp 18000");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel46.setText("Item      :");

        jSpinner9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel47.setText("Beli       :");

        jCheckBox9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel77.setText("Terjual   :");

        jTerjual6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual6.setText("230");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel79.setText("Disukai  :");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel80.setText("170");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageBurger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox9)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner9)))
                    .addComponent(jLabel43)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabelimageBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual6)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel12.setPreferredSize(new java.awt.Dimension(197, 231));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setText("Spaghetti");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel49.setText("Harga   :");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel50.setText("Rp 20000");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel51.setText("Item      :");

        jSpinner10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel52.setText("Beli       :");

        jCheckBox10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel81.setText("Terjual   :");

        jTerjual7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual7.setText("234");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel83.setText("Disukai  :");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel84.setText("190");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageSpagetti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner10)
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel48)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabelimageSpagetti, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual7)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel13.setPreferredSize(new java.awt.Dimension(197, 231));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Onion Ring");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel54.setText("Harga   :");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel55.setText("Rp 18000");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel56.setText("Item      :");

        jSpinner11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel57.setText("Beli       :");

        jCheckBox11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel85.setText("Terjual   :");

        jTerjual8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual8.setText("245");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel87.setText("Disukai  :");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel88.setText("160");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageOnion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner11)
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel53)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabelimageOnion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual8)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel14.setPreferredSize(new java.awt.Dimension(197, 231));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel58.setText("Sosis Goreng");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel59.setText("Harga   :");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel60.setText("Rp 18000");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel61.setText("Item      :");

        jSpinner12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Beli       :");

        jCheckBox12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel89.setText("Terjual   :");

        jTerjual9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual9.setText("260");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel91.setText("Disukai  :");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel92.setText("180");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageSosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner12)
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel58)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabelimageSosis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jCheckBox12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual9)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel15.setPreferredSize(new java.awt.Dimension(197, 231));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel63.setText("Nasi Goreng");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("Harga   :");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel65.setText("Rp 18000");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("Item      :");

        jSpinner13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setText("Beli       :");

        jCheckBox13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel93.setText("Terjual   :");

        jTerjual10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual10.setText("298");

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel95.setText("Disukai  :");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel96.setText("170");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageNasgor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner13)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel63)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabelimageNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(jCheckBox13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual10)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MAKANAN", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel17.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel98.setText("Americano Coffe");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel99.setText("Harga    :");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel100.setText("Rp 18000");

        jLabel101.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel101.setText("Item       :");

        jSpinner2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel102.setText("Beli       :");

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel103.setText("Terjual   :");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel104.setText("Disukai  :");

        jTerjual11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual11.setText("0");

        jdisukai11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jdisukai11.setText("19");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageAmericano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner2)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdisukai11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabelimageAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual11)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jdisukai11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel18.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel107.setText("Coffe Latte");

        jLabel108.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel108.setText("Harga    :");

        jLabel109.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel109.setText("Rp 18000");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel110.setText("Item       :");

        jSpinner4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel111.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel111.setText("Beli       :");

        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel112.setText("Terjual   :");

        jLabel113.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel113.setText("Disukai  :");

        jTerjual12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual12.setText("0");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel115.setText("18");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageCoffeLatte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner4)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabelimageCoffeLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual12)
                    .addComponent(jLabel112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel115))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel19.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel116.setText("Ice Tea");

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel117.setText("Harga    :");

        jLabel118.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel118.setText("Rp 15000");

        jLabel119.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel119.setText("Item       :");

        jSpinner14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel120.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel120.setText("Beli       :");

        jCheckBox14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel121.setText("Terjual   :");

        jLabel122.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel122.setText("Disukai  :");

        jTerjual13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual13.setText("0");

        jLabel124.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel124.setText("22");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageIceTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner14)
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabelimageIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120)
                    .addComponent(jCheckBox14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual13)
                    .addComponent(jLabel121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jLabel124))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel20.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel125.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel125.setText("Lychee tea");

        jLabel126.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel126.setText("Harga    :");

        jLabel127.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel127.setText("Rp 15000");

        jLabel128.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel128.setText("Item       :");

        jSpinner15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel129.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel129.setText("Beli       :");

        jCheckBox15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel130.setText("Terjual   :");

        jLabel131.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel131.setText("Disukai  :");

        jTerjual14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual14.setText("0");

        jLabel133.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel133.setText("23");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageLycheetea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel129, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner15)
                            .addComponent(jCheckBox15, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabelimageLycheetea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(jLabel127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129)
                    .addComponent(jCheckBox15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual14)
                    .addComponent(jLabel130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(jLabel133))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel21.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel134.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel134.setText("Lemon Tea");

        jLabel135.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel135.setText("Harga    :");

        jLabel136.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel136.setText("Rp 15000");

        jLabel137.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel137.setText("Item       :");

        jSpinner16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel138.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel138.setText("Beli       :");

        jCheckBox16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jLabel139.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel139.setText("Terjual   :");

        jLabel140.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel140.setText("Disukai  :");

        jTerjual15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual15.setText("0");

        jLabel142.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel142.setText("23");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageLemonTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel135, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner16)
                            .addComponent(jCheckBox16, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabelimageLemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jLabel136))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel138)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual15)
                    .addComponent(jLabel139))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(jLabel142))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel22.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel143.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel143.setText("Matcha Latte");

        jLabel144.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel144.setText("Harga    :");

        jLabel145.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel145.setText("Rp 18000");

        jLabel146.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel146.setText("Item       :");

        jSpinner17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel147.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel147.setText("Beli       :");

        jCheckBox17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel148.setText("Terjual   :");

        jLabel149.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel149.setText("Disukai  :");

        jTerjual16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual16.setText("0");

        jLabel151.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel151.setText("25");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageMatcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel147, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner17)
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabelimageMatcha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(jLabel145))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147)
                    .addComponent(jCheckBox17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual16)
                    .addComponent(jLabel148))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(jLabel151))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel23.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel152.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel152.setText("Red velvet latte");

        jLabel153.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel153.setText("Harga    :");

        jLabel154.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel154.setText("Rp 18000");

        jLabel155.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel155.setText("Item       :");

        jSpinner18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel156.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel156.setText("Beli       :");

        jCheckBox18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jLabel157.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel157.setText("Terjual   :");

        jLabel158.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel158.setText("Disukai  :");

        jTerjual17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual17.setText("0");

        jLabel160.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel160.setText("21");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageRedvelvet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel152)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner18)
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabelimageRedvelvet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(jLabel154))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel156)
                    .addComponent(jCheckBox18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual17)
                    .addComponent(jLabel157))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158)
                    .addComponent(jLabel160))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel24.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel161.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel161.setText("Taro Latte");

        jLabel162.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel162.setText("Harga    :");

        jLabel163.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel163.setText("Rp 18000");

        jLabel164.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel164.setText("Item       :");

        jSpinner19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel165.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel165.setText("Beli       :");

        jCheckBox19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jLabel166.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel166.setText("Terjual   :");

        jLabel167.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel167.setText("Disukai  :");

        jTerjual18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual18.setText("0");

        jLabel169.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel169.setText("20");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageTaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel161)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel164, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel162, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner19)
                            .addComponent(jCheckBox19, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabelimageTaro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(jLabel163))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164)
                    .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel165)
                    .addComponent(jCheckBox19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual18)
                    .addComponent(jLabel166))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(jLabel169))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel25.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel170.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel170.setText("Vanila Latte");

        jLabel171.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel171.setText("Harga    :");

        jLabel172.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel172.setText("Rp 18000");

        jLabel173.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel173.setText("Item       :");

        jSpinner20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel174.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel174.setText("Beli       :");

        jCheckBox20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jLabel175.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel175.setText("Terjual   :");

        jLabel176.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel176.setText("Disukai  :");

        jTerjual19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual19.setText("0");

        jLabel178.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel178.setText("27");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageVanila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel173, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel171, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel174, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner20)
                            .addComponent(jCheckBox20, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabelimageVanila, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jLabel172))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel173)
                    .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel174)
                    .addComponent(jCheckBox20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual19)
                    .addComponent(jLabel175))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel176)
                    .addComponent(jLabel178))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel26.setPreferredSize(new java.awt.Dimension(197, 250));

        jLabel179.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel179.setText("Choco latte");

        jLabel180.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel180.setText("Harga    :");

        jLabel181.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel181.setText("Rp 18000");

        jLabel182.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel182.setText("Item       :");

        jSpinner21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel183.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel183.setText("Beli       :");

        jCheckBox21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jLabel184.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel184.setText("Terjual   :");

        jLabel185.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel185.setText("Disukai  :");

        jTerjual20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTerjual20.setText("0");

        jLabel187.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel187.setText("24");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimageChoco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel179)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel182, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel180, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel183, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner21)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTerjual20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabelimageChoco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel179)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel180)
                    .addComponent(jLabel181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182)
                    .addComponent(jSpinner21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel183)
                    .addComponent(jCheckBox21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTerjual20)
                    .addComponent(jLabel184))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel185)
                    .addComponent(jLabel187))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        jTabbedPane1.addTab("MINUMAN", jPanel4);

        jPanel16.setPreferredSize(new java.awt.Dimension(240, 55));

        btnOrder.setBackground(new java.awt.Color(0, 255, 153));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnOrder.setText("ORDER");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 51));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addContainerGap(835, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("TOTAL ITEM ");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("TOTAL");

        jTextFieldTotalItem.setEditable(false);
        jTextFieldTotalItem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldTotalItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotalItem.setText("0");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotal)
                    .addComponent(jTextFieldTotalItem))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(15, 15, 15))
        );

        jTextAreaHasil.setEditable(false);
        jTextAreaHasil.setColumns(20);
        jTextAreaHasil.setRows(5);
        jScrollPane1.setViewportView(jTextAreaHasil);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1444, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed
    //Makanan
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //kentang goreng Rp18000
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox1.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual1++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel3.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        //Roti Bakar Rp15000
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox5.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual2++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel23.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
       //indomie goreng Rp15000
       int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox6.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual3++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel28.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        //Dimsum Rp20000
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox7.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*20000;
            Total += harga;
            TotalItem++;
            Terjual4++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel33.getText()+"\t\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox7.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        //waffle RP20000
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox8.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*20000;
            Total += harga;
            TotalItem++;
            Terjual5++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel38.getText()+"\t\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        //Burger Rp18000
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox9.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual6++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel43.getText()+"\t\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        //Spagetti 20000
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox10.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*20000;
            Total += harga;
            TotalItem++;
            Terjual7++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel48.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        //Onion Ring Rp18000
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox11.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual8++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel53.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        //Sosis Goreng Rp15000
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox12.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual9++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel58.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        //Nasgor 18000
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox13.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual10++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel63.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed
    //Minuman
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        //americano coffe Rp18000
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox2.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual11++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel98.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        //coffe latte Rp18000
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox4.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual12++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel107.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        //Ice Tea Rp15000
        int qty = Integer.parseInt(jSpinner14.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox14.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual13++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel116.getText()+"\t\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox14.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        //lychee tea Rp 15000
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox15.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual14++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel125.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        //Lemon Tea Rp15000
        int qty = Integer.parseInt(jSpinner16.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox16.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*15000;
            Total += harga;
            TotalItem++;
            Terjual15++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel134.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox16.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        //Matcha latte Rp18000
        int qty = Integer.parseInt(jSpinner17.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox17.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual16++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel143.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox17.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        //Red velvet latte Rp 18000
        int qty = Integer.parseInt(jSpinner18.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox18.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual17++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel152.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        //Taro latte Rp18000
        int qty = Integer.parseInt(jSpinner19.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox19.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual18++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel161.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        //Vanilla Latte Rp18000
        int qty = Integer.parseInt(jSpinner20.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox20.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual19++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel170.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        //choco latte Rp18000
        int qty = Integer.parseInt(jSpinner21.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox21.isSelected()){
            x++;
            if(x==1){
               SmartCafe(); 
            }
            int harga = qty*18000;
            Total += harga;
            TotalItem++;
            Terjual20++;
            jTextAreaHasil.setText(jTextAreaHasil.getText() + "     "+ x + ". " + jLabel179.getText()+"\t "+qty +"\t"+harga+"\n");
            duedate();
        }else {
            jCheckBox21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed
    //untuk menggerakan windows nya
    int xx, xy;
    private void jPanel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel28MousePressed

    private void jPanel28MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel28MouseDragged

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        if(Total == 0){
            JOptionPane.showMessageDialog(null, "Anda belum memilih item, Mohon Masukkan Item terlebih dahulu!");
        }else{
            //ketika button order di klik, maka user di haruskan memasukan data pesanan agar ada di tampilan struk(gimana carana?)
            CheckOutMenu m = new CheckOutMenu(null,true);
            m.setVisible(true);
            
            jTextAreaHasil.setText(jTextAreaHasil.getText()
                    +"\n******************************************************\n"
                    +"Nama : " + m.getNama() + "\n"
                    +"No Meja : " + m.getNoMeja() + "\n"
                    +"Catatan : " + m.getCatatan() + "\n"
                    + "Jenis Pesanan : " + m.getJenisPesanan() + "\n"
                    +"Total Item: " + TotalItem + "\n"
                    +"Total: " + Total + "\n"
                    +"\n*********** Tunggu Pesanan mu jadi ya :) *************\n"
                    
            );
            btnOrder.setEnabled(false);
        }
    }//GEN-LAST:event_btnOrderActionPerformed
    
    
    //menampilkan data ke struk
    public void SmartCafe(){
        int purchaseId = 15020 + (int) (Math.random()*80800);
        jTextAreaHasil.setText("******************** SMART CAFE ********************\n"
                +" Time:  "+jTxtTime.getText() + "    Date:  "+jTxtDate.getText()+"\n"
                +" Purchase Id:  " + purchaseId + "\n"
                +"******************************************************\n"
                +" Nama Item:\t\t"+"Qty "+"               Harga(Rp)\n");
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jDisukai1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelimageAmericano;
    private javax.swing.JLabel jLabelimageBurger;
    private javax.swing.JLabel jLabelimageChoco;
    private javax.swing.JLabel jLabelimageCoffeLatte;
    private javax.swing.JLabel jLabelimageDimsum;
    private javax.swing.JLabel jLabelimageIceTea;
    private javax.swing.JLabel jLabelimageIndomie;
    private javax.swing.JLabel jLabelimageKentang;
    private javax.swing.JLabel jLabelimageLemonTea;
    private javax.swing.JLabel jLabelimageLycheetea;
    private javax.swing.JLabel jLabelimageMatcha;
    private javax.swing.JLabel jLabelimageNasgor;
    private javax.swing.JLabel jLabelimageOnion;
    private javax.swing.JLabel jLabelimageRedvelvet;
    private javax.swing.JLabel jLabelimageRoti;
    private javax.swing.JLabel jLabelimageSosis;
    private javax.swing.JLabel jLabelimageSpagetti;
    private javax.swing.JLabel jLabelimageTaro;
    private javax.swing.JLabel jLabelimageVanila;
    private javax.swing.JLabel jLabelimageWaffle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jTerjual1;
    private javax.swing.JLabel jTerjual10;
    private javax.swing.JLabel jTerjual11;
    private javax.swing.JLabel jTerjual12;
    private javax.swing.JLabel jTerjual13;
    private javax.swing.JLabel jTerjual14;
    private javax.swing.JLabel jTerjual15;
    private javax.swing.JLabel jTerjual16;
    private javax.swing.JLabel jTerjual17;
    private javax.swing.JLabel jTerjual18;
    private javax.swing.JLabel jTerjual19;
    private javax.swing.JLabel jTerjual2;
    private javax.swing.JLabel jTerjual20;
    private javax.swing.JLabel jTerjual3;
    private javax.swing.JLabel jTerjual4;
    private javax.swing.JLabel jTerjual5;
    private javax.swing.JLabel jTerjual6;
    private javax.swing.JLabel jTerjual7;
    private javax.swing.JLabel jTerjual8;
    private javax.swing.JLabel jTerjual9;
    private javax.swing.JTextArea jTextAreaHasil;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalItem;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jTxtTime;
    private javax.swing.JLabel jdisukai11;
    // End of variables declaration//GEN-END:variables
}
