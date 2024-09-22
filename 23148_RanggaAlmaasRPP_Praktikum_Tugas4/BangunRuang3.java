class Kubus extends Kubus {
    double sisi;

    // Konstruktor untuk Kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}