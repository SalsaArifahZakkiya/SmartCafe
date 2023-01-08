/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP Gaming
 */
public class Kasir_model {
    
    private int ID_Kasir;
    private int[] ID_Pesanan;

    public Kasir_model(int ID_Kasir, int[] ID_Pesanan) {
        this.ID_Kasir = ID_Kasir;
        this.ID_Pesanan = ID_Pesanan;
    }

    public int getID_Kasir() {
        return ID_Kasir;
    }

    public void setID_Kasir(int ID_Kasir) {
        this.ID_Kasir = ID_Kasir;
    }

    public int[] getID_Pesanan() {
        return ID_Pesanan;
    }

    public void setID_Pesanan(int[] ID_Pesanan) {
        this.ID_Pesanan = ID_Pesanan;
    }
    
    
    
}
