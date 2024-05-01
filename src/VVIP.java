// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    private final int hargaPresale = (int) (200 * 0.8);
    private final int hargaReguler = 200;

    @Override
    public int getHarga(String tahap) {
        if (tahap.equalsIgnoreCase("Presale")) {
            return hargaPresale;
        } else {
            return hargaReguler;
        }
    }
}