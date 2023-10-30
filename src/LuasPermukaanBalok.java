import java.util.Scanner;

/**
 * @author yunita
 */
public class LuasPermukaanBalok {
    /**
     * menghitung luas permukaan balok
     * @param args
     */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang balok: ");
            double panjang = input.nextDouble();
            /**
             * rumus menghitung panjang balok
             */

            System.out.print("Masukkan lebar balok: ");
            double lebar = input.nextDouble();
            /**
             * rumus menghotung lebar balok
             */

            System.out.print("Masukkan tinggi balok: ");
            double tinggi = input.nextDouble();
            /**
             * rumus menghitung tinggi balok
             */
            double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
            /**
             * menghitung luas permukaan balok
             */
        }
    }

