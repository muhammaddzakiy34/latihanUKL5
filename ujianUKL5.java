package UKL2025;

import java.util.Scanner;

public class ujianUKL5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        // Inisialisasi variabel untuk total nilai
        double totalNilai = 0.0;
        
        // Loop untuk memasukkan nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }
        
        // Hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;
        
        // Cetak hasil rata-rata
        System.out.println("Rata-rata nilai ujian adalah: " + rataRata);
        
        scanner.close();
    }

}
