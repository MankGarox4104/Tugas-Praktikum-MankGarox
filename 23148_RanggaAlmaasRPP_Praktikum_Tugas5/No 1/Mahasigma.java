
class Mahasigma {
    String npm;
    String namaMahasiswa;
    double nilaiKehadiran;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    char grade;
    String keterangan;

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tentukanGrade() {
        if (nilaiAkhir >= 76) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
    }

    public void tampilkanData() {
        System.out.println("NPM Mahasiswa  : " + npm);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + grade);
        System.out.println("Keterangan     : " + keterangan);
    }
}