import java.util.Scanner;

// Kelas utama untuk aplikasi pemesanan tiket
public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Meminta user menginputkan nama
        System.out.print("Masukkan nama pembeli: ");
        String nama = c.nextLine();

        System.out.println();
        System.out.println("Pilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");

        // Meminta user menginputkan tahap pembelian
        System.out.print("Pilih tahap pembelian (1/2): ");
        String tahap = c.nextLine();

        System.out.println();
        // Inisialisasi objek
        Tiket tiket = null;
        if (tahap.equals("1")) { // Jika memilih 1 atau tahap presale
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");

            // Meminta user menginputkan jenis tiketnya
            System.out.print("Pilih jenis tiket (1/2): ");
            String jenis = c.nextLine();

            // Seleksi kondisi jika yang dipilih adalah tahap presale
            if (jenis.equals("1")) {
                tiket = new VIP();
            } else if (jenis.equals("2")) {
                tiket = new VVIP();
            }
        } else if (tahap.equals("2")) { // Jika yang dipilih adalah tahap reguler
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            String jenis = c.nextLine();
            if (jenis.equals("1")) {
                tiket = new Festival();
            } else if (jenis.equals("2")) {
                tiket = new VIP();
            } else if (jenis.equals("3")) {
                tiket = new VVIP();
            }
        }

        System.out.println();
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = c.nextInt();

        System.out.println();
        // Membuat objek pemesanan berdasarkan inputan dari user
        Pemesanan pesanan = new Pemesanan(nama, tahap.equals("1") ? "Presale" : "Reguler", tiket, jumlah);
        pesanan.cetakNota();
    }
}