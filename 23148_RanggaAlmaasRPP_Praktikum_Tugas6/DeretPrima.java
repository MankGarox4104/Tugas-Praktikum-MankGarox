public class DeretPrima{

    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0-20:");
        deretBilanganPrima();

        System.out.println("\nBilangan Bukan Prima dari 0-20:");
        deretBilanganBukanPrima();
    }

    public static void deretBilanganPrima() {
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    public static void deretBilanganBukanPrima() {
        int num = 0;
        while (num <= 20) {
            boolean isPrime = true;
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (!isPrime && num > 1) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}