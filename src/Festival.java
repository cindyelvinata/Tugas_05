// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Seperti perintah soal, harganya 100
    private final int hargaPembelianReguler = 100;

    // Implementasi method untuk mendapat harga tiket festival
    @Override
    // tahapPenjualan disini digunakan untuk parameter method getHarga
    public int getHarga(String tahapPenjualan) {
        return hargaPembelianReguler;
    }
}