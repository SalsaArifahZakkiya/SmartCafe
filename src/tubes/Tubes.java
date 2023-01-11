/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import Model.login_model_controll;
import View.AdminPage;
import View.Customer_Page;
import View.LoginPage;
import Controller.login_controll;
import Controller.Connections;
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
