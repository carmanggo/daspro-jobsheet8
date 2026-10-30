import java.util.Scanner;

public class Tugas302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko   : ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);

        int[] pelanggan = new int[jumlahToko];
        int[] totalBarang = new int[jumlahToko];

        int totalBarangSemuaToko = 0;
        int tokoTerbaik = 1;
        int barangTerbanyak = -1;

        for (int i = 0;  i < jumlahToko; i++) {

            do {
                System.out.print("Masukkan jumlah pelanggan toko " + (i + 1) + ": ");
                pelanggan[i] = sc.nextInt();
            } while (pelanggan[i] < 0);

            for (int j = 1;j <= pelanggan[i]; j++) {
                int jumlahBarang;

                do {
                    System.out.print(" Jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = sc.nextInt();
                } while (jumlahBarang < 0);

                totalBarang[i] += jumlahBarang;
            }
            totalBarangSemuaToko += totalBarang[i];

            if (totalBarang[i] > barangTerbanyak) {
                barangTerbanyak = totalBarang[i];
                tokoTerbaik = i + 1;
            }
        }
        System.out.println();

        for (int i = 0; i < jumlahToko; i++) {
            System.out.println("Toko " + (i + 1) + " - pelanggan: " + pelanggan[i] + ", total barang: " +totalBarang[i]);
        
        }
        System.out.println("Total barang seluruh toko: " +totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " +tokoTerbaik);

        sc.close();

        
    }
}
