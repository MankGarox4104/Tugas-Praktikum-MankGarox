public class AnakAyam{

    public static void main(String[] args) {
        int N = 10;

        System.out.println("Menggunakan perulangan for:");
        for (int i = N; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }

        System.out.println("\nMenggunakan perulangan while:");
        int j = N;
        while (j > 0) {
            if (j == 1) {
                System.out.println("Anak ayam turun " + j + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + j + ", mati satu tinggal " + (j - 1));
            }
            j--;
        }

        System.out.println("\nMenggunakan perulangan do-while:");
        int k = N;
        do {
            if (k == 1) {
                System.out.println("Anak ayam turun " + k + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + k + ", mati satu tinggal " + (k - 1));
            }
            k--;
        } while (k > 0);
    }
}