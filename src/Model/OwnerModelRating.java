package Model;

public class OwnerModelRating {
    private String namamenu;
    private double rating;
    private String komentar;

    public OwnerModelRating(String namamenu, double rating, String komentar) {
        this.namamenu = namamenu;
        this.rating = rating;
        this.komentar = komentar;
    }

    public String getNamamenu() {
        return namamenu;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
    
    
}
