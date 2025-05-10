package uts.oop.c.pkg2301010322;

import java.util.Scanner;

/**
 *
 * @author Ni Made Pramesti Dewi
 * 10 Mei 2025
 */
public class AplikasiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajerBuku manajer = new ManajerBuku();
        int pilihan;

        do {
            System.out.println("\n=== MENU BUKU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Buku: ");
                    String kode = scanner.nextLine();
                    System.out.print("Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = scanner.nextLine();
                    Buku b = new Buku(kode, judul);
                    b.setPengarang(pengarang);
                    manajer.tambah(b);
                    break;
                case 2:
                    manajer.tampilkan();
                    break;
                case 3:
                    manajer.tampilkan();
                    System.out.print("Pilih nomor buku yang diubah: ");
                    int idxUbah = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.print("Judul Baru: ");
                    String judulBaru = scanner.nextLine();
                    System.out.print("Pengarang Baru: ");
                    String pengarangBaru = scanner.nextLine();
                    manajer.ubah(idxUbah, judulBaru, pengarangBaru);
                    break;
                case 4:
                    manajer.tampilkan();
                    System.out.print("Pilih nomor buku yang dihapus: ");
                    int idxHapus = Integer.parseInt(scanner.nextLine()) - 1;
                    manajer.hapus(idxHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
