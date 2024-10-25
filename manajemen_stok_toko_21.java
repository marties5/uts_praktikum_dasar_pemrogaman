import java.util.Scanner;

public class manajemen_stok_toko_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = "";
        int jumlahStok = 0;
        double hargaPerUnit = 0.0;
        String[] daftarNamaBarang = new String[100];
        int[] daftarSisaStok = new int[100];
        int count = 0;
        System.out.println("==================================");
        System.out.println("+------ Manajemeng Gudang -------+");
        System.out.println("==================================");
        while (true) {
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk keluar): ");
            nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok: ");
            jumlahStok = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan harga per unit: ");
            hargaPerUnit = Double.parseDouble(scanner.nextLine());

            double totalNilaiStok = jumlahStok * hargaPerUnit;
            System.out.printf("Total nilai stok untuk %s: %.2f\n", nama, totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan: ");
            int permintaan = Integer.parseInt(scanner.nextLine());

            if (permintaan <= jumlahStok) {
                jumlahStok -= permintaan;
                System.out.printf("Permintaan dapat dipenuhi. Stok tersisa: %d\n", jumlahStok);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }

            daftarNamaBarang[count] = nama;
            daftarSisaStok[count] = jumlahStok;
            count++;
        }

        System.out.println("\nInformasi Stok Barang:");
        for (int i = 0; i < count; i++) {
            System.out.printf("Nama Barang: %s, Sisa Stok: %d\n", daftarNamaBarang[i], daftarSisaStok[i]);
        }
        System.out.println("=================================\n");
        scanner.close();
    }
}
