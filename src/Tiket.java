// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    // Method astrak untuk mendapat harga tiket berdasar dari tahap pembelian
    abstract int getHarga(String tahap);
}