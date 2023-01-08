package Controller;

import Model.OwnerModelPesanan;
import View.OwnerPesanan;
import View.OwnerView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class OwnerControllerPesanan {
    OwnerPesanan menuPesanan;
    
    public OwnerControllerPesanan(OwnerPesanan menu){
        menuPesanan = menu;
        menuPesanan.btnBack(new back());
        menuPesanan.btnPrint(new print());
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
    
    class print implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            try{
                FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                DefaultTableModel model = (DefaultTableModel)menuPesanan.getjTable1().getModel();
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
