
package Model;


public abstract class MenuModel implements Inputable{
    private int idMenu;
    private String nama;
    private double harga;
    
    //private static int favorite;
    //private static int JumlahTejual;
    //private String[] ArrayFeedback;

    @Override
    public abstract void inputDataMenu(MenuModel menu, int qty); 
    public abstract void removeDataMenu(int index);
    
    public MenuModel() {}

    //buat di database
    public MenuModel(String nama, double harga) {
        this.idMenu = -1;
        this.nama = nama;
        this.harga = harga;
    }

    public MenuModel(int idMenu, String nama, double harga) {
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }


    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
   /*  
    public void MenuFavorite(){
        MenuModel.favorite++;
    }
    public void JumlahTerjual(){
        MenuModel.JumlahTejual++;
    }
   
    public void LihatFeedback(){
        
    }
*/

    
}
