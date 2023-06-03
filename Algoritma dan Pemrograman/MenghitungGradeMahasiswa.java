package Tugas;
import java.util.Scanner;
public class MenghitungGradeMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, Tugas;
        char grade;
        final double n_tugas, n_kuis, n_uts, n_uas, n_akhir;
        System.out.println("==========Menghitung Grade Mahasiiswa=========");
        System.out.println("Masukkan Nama   :                             ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM    :                             ");
        nim = input.nextLine();
        System.out.println("Nilai Tugas     :                             ");
        n_tugas = input.nextInt();
        System.out.println("Nilai Kuis      :                             ");
        n_kuis = input.nextInt();
        System.out.println("Nilai UTS       :                             ");
        n_uts = input.nextInt();
        System.out.println("Nilai UAS       :                             ");
        n_uas = input.nextInt();
        n_akhir = (0.20 * n_tugas + 0.15 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
        if (n_akhir >= 85 && n_akhir <= 100){
            grade = 'A';
        }
        else if (n_akhir >= 75 && n_akhir < 85){
            grade = 'B';
            
        }
        else if (n_akhir >= 65 && n_akhir < 75){
            grade = 'C';
        
        }
        else if (n_akhir >= 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        System.out.println("\n" + nama + " dengan NIM " + nim + 
           " Memiliki nilai akhir " + n_akhir + " dan mendapatkan Grade "+ grade);
    
        }
    
}
