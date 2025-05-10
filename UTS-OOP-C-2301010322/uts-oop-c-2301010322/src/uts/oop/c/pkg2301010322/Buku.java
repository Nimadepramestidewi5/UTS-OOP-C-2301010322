package uts.oop.c.pkg2301010322;

/**
 *
 * @author Ni Made Pramesti Dewi
 * 10 Mei 2025
 */
public class Buku {
    private String kode;
    private String judul;
    private String pengarang;

    public Buku() {
        this.kode = "000";
        this.judul = "Tanpa Judul";
        this.pengarang = "Anonim";
    }

    // Overloading constructor
    public Buku(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = "Belum Ditentukan";
    }

    public String getKode() { return kode; }
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }

    public void setJudul(String judul) { this.judul = judul; }
    public void setPengarang(String pengarang) { this.pengarang = pengarang; }

    // Overriding toString
    @Override
    public String toString() {
        return "Kode: " + kode + " | Judul: " + judul + " | Pengarang: " + pengarang;
    }
    
}
