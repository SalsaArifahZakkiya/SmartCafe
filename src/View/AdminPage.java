/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Connections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.admin_controll;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AdminPage extends javax.swing.JFrame {

    admin_controll ac;
    PreparedStatement pst;
    ResultSet rs;
    Connection con;
    public AdminPage() {
        initComponents();
        showtampil();
    }

    public AdminPage(String Uname) {
        initComponents();
        showtampil();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");

        jButton3.setText("Hapus");

        jLabel2.setText("CRUD ADMIN");

        jLabel3.setText("Nama Menu : ");

        jLabel4.setText("Harga :");

        jLabel5.setText("Jumlah :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Menu", "Harga", "Jumlah Sisa"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = getJTable().getSelectedRow();
        String model = getJTable().getValueAt(row, 1).toString();
        Statement st;
        try{
            st = Connections.getConnection().createStatement();
            
            System.out.println("sasa");
            String query = "SELECT * FROM menu_table WHERE nama_menu = '"+model+"'";
            
            rs = st.executeQuery(query);
            
            
            if(rs.next()){
                
                getJTextNama().setText(rs.getString("nama_menu"));
                getJTextHarga().setText(String.valueOf(rs.getInt("harga")));
                getJTextJumlah().setText(String.valueOf(rs.getInt("jumlah")));
            }
        }catch(SQLException ex){
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE,null,ex);
        }

        
    }//GEN-LAST:event_jTable1MouseClicked
    public JTable getJTable(){
        return jTable1;
    }
    
    
    
    public JTextField getJTextNama(){
        return jTextField1;
    }
    
    public JTextField getJTextHarga(){
        return jTextField2;
    }
    
    public JTextField getJTextJumlah(){
        return jTextField3;
    }
    
    public void btntambah(ActionListener listen){
        jButton1.addActionListener(listen);
    }
    
    public void btnupdate(ActionListener listen){
       jButton2.addActionListener(listen);
    }
    public void btnhapus(ActionListener listen){
       jButton3.addActionListener(listen);
    }
    
        
    private void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables


//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==jButton1&& !jTextField1.getText().equals("")&& !jTextField2.getText().equals("")&& !jTextField3.getText().equals("")){
//            String n;
//            int h,j;
//            n = jTextField1.getText();
//            h = Integer.parseInt(jTextField2.getText());
//            j = Integer.parseInt(jTextField3.getText());
//            
//            this.setVisible(false);
//        }else{
//            JOptionPane.showMessageDialog(rootPane, "Ada yang kurang");
//        }
//    }

    public void showtampil(){
        try{
            Connection con = Connections.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id,nama_menu,harga,jumlah from menu_table");
            DefaultTableModel model = (DefaultTableModel)getJTable().getModel();
            while (rs.next()){
                Object o[] = {rs.getInt("id"),rs.getString("nama_menu"),rs.getInt("harga"),rs.getInt("jumlah")};
                model.addRow(o);
                
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }
    
    public void reset(){
        DefaultTableModel model = (DefaultTableModel)getJTable().getModel();
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
    }
    
}