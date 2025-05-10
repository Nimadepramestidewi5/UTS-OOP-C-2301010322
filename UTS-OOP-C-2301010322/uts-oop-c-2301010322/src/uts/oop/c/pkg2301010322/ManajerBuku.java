package uts.oop.c.pkg2301010322;

/**
 *
 * @author LAB F
 */
public class ManajerBuku {
    private Buku[] daftar = new Buku[100];
    public int jumlah = 0;

    public void tambah(Buku b) {
        if (jumlah < daftar.length) {
            daftar[jumlah] = b;
            jumlah++;
        } else {
            System.out.println("Kapasitas buku penuh.");
        }
    }

    public void tampilkan() {
        if (jumlah == 0) {
            System.out.println("Belum ada data buku.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + ". " + daftar[i]);
            }
        }
    }

    public void ubah(int index, String judulBaru, String pengarangBaru) {
        if (index >= 0 && index < jumlah) {
            daftar[index].setJudul(judulBaru);
            daftar[index].setPengarang(pengarangBaru);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void hapus(int index) {
        if (index >= 0 && index < jumlah) {
            for (int i = index; i < jumlah - 1; i++) {
                daftar[i] = daftar[i + 1];
            }
            daftar[jumlah - 1] = null;
            jumlah--;
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}
