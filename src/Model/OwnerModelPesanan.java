/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class OwnerModelPesanan {
    private String namamenu;
    private int quantity;
    
    OwnerModelPesanan(String namamenu, int quantity){
        this.namamenu = namamenu;
        this.quantity = quantity;
    }

    public String getNamamenu() {
        return namamenu;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
