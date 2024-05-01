// Kelas turunan untuk tiket VIP
class VIP extends Tiket {

    // 0.8 dari 80% yaitu harga yg akan diambil setelah potongan 20% itu
    private final int hargaPresale = (int) (150 * 0.8);
    private final int hargaReguler = 150;

    // Implementasi method
    @Override
    // Mengembalikan harga sesuai dengan tahap pembeliannya
    public int getHarga(String tahap) {
        if (tahap.equalsIgnoreCase("Presale")) {
            return hargaPresale;
        } else {
            return hargaReguler;
        }
    }
}