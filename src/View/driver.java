/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MakananController;
import Controller.MenuController;

/**
 *
 * @author dadannks
 */
public class driver {
    public static void main(String[] args){
        MenuView m1 = new MenuView();
        MakananController mc = new MakananController(m1);
        MenuController mn = new MenuController(m1, mc);
        m1.setVisible(true);
    }
    
}
