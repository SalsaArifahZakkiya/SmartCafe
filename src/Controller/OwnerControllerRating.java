package Controller;

import Controller.Connections;
import View.OwnerRating;
import View.OwnerView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OwnerControllerRating{ 
    OwnerRating menuRating;

    public OwnerControllerRating(OwnerRating menu){
        menuRating = menu;
        menuRating.btnSearch(new btnSearch());
        menuRating.btnBack(new back());
        menuRating.btnPrint(new print());
    }
    
    class back implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            try{
                OwnerView view = new OwnerView();
                view.setVisible(true); 
            } catch (Exception e){
                
            }  
        }
    }
    
    public void resetTabel(){
        DefaultTableModel model = (DefaultTableModel)menuRating.getJtable().getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
    }
    
    class btnSearch implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String pesanan = menuRating.getJsearch();
            try{
                resetTabel();
                Connection con = Connections.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT namamenu , rating, komentar FROM searchrating WHERE namamenu = '"+pesanan+"' ORDER BY rating DESC");
                DefaultTableModel model = (DefaultTableModel)menuRating.getJtable().getModel();

                while (rs.next()) {
                    Object o[] = {rs.getString("namamenu"), rs.getFloat("rating"), rs.getString("komentar")};
                    model.addRow(o);
                }
                menuRating.setModelTabel(model);
            } catch (Exception e){
            }
        }    
    }
    class print implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            try{
                FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                DefaultTableModel model = (DefaultTableModel)menuRating.getJtable().getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
            // write header
                for(int i = 0; i < model.getColumnCount(); i++){
                fileWriter.write(model.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
            // write record
                for(int i=0; i < model.getRowCount(); i++) {
                for(int j=0; j < model.getColumnCount(); j++) {
                fileWriter.write(model.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
            } catch (Exception e){
                
            }  
        }
    }
}

