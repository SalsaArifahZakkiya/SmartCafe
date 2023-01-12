
package Model;

public class Pelanggan{
    private String NoMeja;
    private String Nama;
    private String CatatanPesanan;
    
    public Pelanggan(){
        
    }

    public Pelanggan(String NoMeja, String Nama) {
        this.NoMeja = NoMeja;
        this.Nama = Nama;
    }
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getCatatanPesanan() {
        return CatatanPesanan;
    }

    public void setCatatanPesanan(String CatatanPesanan) {
        this.CatatanPesanan = CatatanPesanan;
    }
    
    
    public Pelanggan(String NoMeja) {
        this.NoMeja = NoMeja;
    }

    public String getNoMeja() {
        return NoMeja;
    }

    public void setNoMeja(String NoMeja) {
        this.NoMeja = NoMeja;
    }
   
     
    
}
