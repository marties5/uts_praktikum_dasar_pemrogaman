import java.util.Scanner;

public class manajemen_nilai_siswa_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float totalNilai = 0;
        int jumlahSiswa = 0;
        float[] nilaiSiswa = new float[100];
        char next;

        do {
            System.out.print("Masukkan nama siswa : ");
            String namaSiswa = input.nextLine();
            System.out.print("Masukkan nilai siswa " + namaSiswa + " : ");
            float nilai = input.nextFloat();
            input.nextLine();
            nilaiSiswa[jumlahSiswa] = nilai;
            totalNilai += nilai;
            jumlahSiswa++;

            System.out.println("Total nilai sementara: " + totalNilai);
            System.out.println("Jumlah siswa saat ini: " + jumlahSiswa);
            System.out.println();

            System.out.print("Apakah anda ingin melanjutkan (ya/selesai): ");
            next = input.next().charAt(0);
            input.nextLine();
        } while (Character.toString(next).equalsIgnoreCase("ya") || Character.toString(next).equalsIgnoreCase("y"));

        float rataNilai = (jumlahSiswa > 0) ? totalNilai / jumlahSiswa : 0;
        int countDiAtasRata = 0;
        int countDiBawahRata = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            if (nilaiSiswa[i] > rataNilai) {
                countDiAtasRata++;
            } else if (nilaiSiswa[i] < rataNilai) {
                countDiBawahRata++;
            }
        }

        if (jumlahSiswa <= 2) {
            System.out.println("masukkan minimal 2 siswa");
        } else {
            System.out.println("Rata-rata nilai akhir: " + rataNilai);
            System.out.println("Jumlah siswa di atas rata-rata: " + countDiAtasRata);
            System.out.println("Jumlah siswa di bawah rata-rata: " + countDiBawahRata);

            boolean mayoritasDiAtasRata = countDiAtasRata > (jumlahSiswa / 2.0);
            System.out.println("Mayoritas siswa " + (mayoritasDiAtasRata ? "di atas" : "di bawah") + " rata-rata.");

            input.close();
        }

    }
}