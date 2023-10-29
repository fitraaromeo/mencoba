/**
 * Program untuk mencari bilangan prima dalam sebuah array
 */
public class PrimaDalamArray {
    /**
     *
     * @param angka bilangan yang akan diperiksa.
     * @return true jika bilangan prima, false jika bukan.
     */
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metode utama program
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 10, 11, 13, 17, 20};

        System.out.print("Bilangan prima dalam array ini: ");
        for (int angka : array) {
            if (isPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
    }
}
