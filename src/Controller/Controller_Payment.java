/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuMasukForm;
import View.MenuDetailForm;
import View.Payment;
import View.Preview;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author fadhi
 */
public class Controller_Payment {

    private Payment pay;
    private MenuMasukForm TampilanAwal;
    private MenuDetailForm TampilanDetail;
    private Connection con;
    private Statement state;
    private ResultSet rs;
    private String sql;
    int id = -1;

    public Controller_Payment(Payment bayar) {
        pay = bayar;
        TampilanAwal = new MenuMasukForm();
        TampilanDetail = new MenuDetailForm();
        
        
    }
    
        
        
    
    }
    
    
    
    

