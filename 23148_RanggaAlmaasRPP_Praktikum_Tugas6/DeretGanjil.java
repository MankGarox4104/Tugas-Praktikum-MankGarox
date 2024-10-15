public class DeretGanjil {

    public static void main(String[] args) {
        int sumEven = 0;
        System.out.print("Deret bilangan genap (for loop): ");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
            sumEven += i;
        }
        System.out.println("\nJumlah bilangan genap: " + sumEven);

        int sumOdd = 0;
        int j = 1;
        System.out.print("\nDeret bilangan ganjil (while loop): ");
        while (j <= 20) {
            System.out.print(j + " ");
            sumOdd += j;
            j += 2;
        }
        System.out.println("\nJumlah bilangan ganjil: " + sumOdd);

        int sumEvenDoWhile = 0;
        int k = 0;
        System.out.print("\nDeret bilangan genap (do-while loop): ");
        do {
            System.out.print(k + " ");
            sumEvenDoWhile += k;
            k += 2;
        } while (k <= 20);
        System.out.println("\nJumlah bilangan genap (do-while): " + sumEvenDoWhile);

        int sumOddDoWhile = 0;
        int l = 1;
        System.out.print("\nDeret bilangan ganjil (do-while loop): ");
        do {
            System.out.print(l + " ");
            sumOddDoWhile += l;
            l += 2;
        } while (l <= 20);
        System.out.println("\nJumlah bilangan ganjil (do-while): " + sumOddDoWhile);
    }
}
