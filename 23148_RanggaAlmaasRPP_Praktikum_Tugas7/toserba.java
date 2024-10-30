import java.util.Scanner;

class toserba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data barang
        String[] kodeBarang = { "a001", "a002", "a003" };
        String[] namaBarang = { "Buku", "Pensil", "Pulpen" };
        int[] hargaBarang = { 3000, 4000, 5000 };

        // Input jumlah item
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();

        // Deklarasi array untuk menyimpan jumlah beli dan kode barang yang diinput
        String[] inputKodeBarang = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayarPerBarang = new int[jumlahItem];

        // Input data per barang
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            inputKodeBarang[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
        }

        // Menampilkan hasil
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("============================================================");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            // Mencari nama barang dan harga berdasarkan kode
            for (int j = 0; j < kodeBarang.length; j++) {
                if (inputKodeBarang[i].equals(kodeBarang[j])) {
                    int jumlahBayar = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    totalBayarPerBarang[i] = jumlahBayar;

                    // Menampilkan setiap baris barang
                    System.out.printf("%-4d %-12s %-12s %-7d %-12d %-12d\n",
                            (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar);
                }
            }
        }

        System.out.println("============================================================");
        System.out.println("Total Bayar                           " + totalBayar);
    }
}