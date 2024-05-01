// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    // Constructor untuk inisialisasi objek pemesanan
    // Tahap disini untuk menentukan presale/reguler
    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        int totalHarga = tiket.getHarga(tahap) * jumlah;
        // Menggunakan format rupiah, dengan 1 angka di belakang koma
        String totalHargaFormat = String.format("Rp %,.1f", (double) totalHarga);
        System.out.println("--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        // Menggunakan getClass dan getSimpleName untuk mendapat nama jenis tiket lebih mudah
        System.out.println("Jenis Tiket: " + tiket.getClass().getSimpleName());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: " + totalHargaFormat);
    }
}