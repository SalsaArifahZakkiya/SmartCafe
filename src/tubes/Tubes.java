/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import model.login;
import view.AdminPage;
import view.Customer_Page;
import view.LoginPage;
import controller.login_controll;
import controller.Connections;
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LoginPage login = new LoginPage();
      login_controll lc = new login_controll(login);
      login.setVisible(true);
       
       
    }
    
}
