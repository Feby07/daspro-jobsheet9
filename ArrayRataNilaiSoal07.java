import java.util.Scanner;

public class ArrayRataNilaiSoal07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i< nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] >= 75) {
                totalLulus+= nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }

        if (lulus > 0 ) {
            double rata2Lulus = totalLulus / lulus;
            System.out.println("Rata-rata nilai lulus= " + rata2Lulus);
        } else {
            System.out.println("Tidak ada mahasiswa lulus");
        }

        if (tidakLulus > 0) {
            double rata2TidakLulus = totalTidakLulus / tidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }

    }
}
