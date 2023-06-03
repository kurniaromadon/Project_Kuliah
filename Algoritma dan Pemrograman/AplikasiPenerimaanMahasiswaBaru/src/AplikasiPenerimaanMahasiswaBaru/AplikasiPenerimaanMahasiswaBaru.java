package AplikasiPenerimaanMahasiswaBaru;
/**
 *
 * @author kurniaromadon
 */
import java.io. *;
public class AplikasiPenerimaanMahasiswaBaru {

    public static void main(String[] args) throws IOException {
        String Nama_P [] = new String [4];
        String NISN [] = new String [4];
        String Asal_Sekolah [] = new String [4];
        String Alamat [] = new String [4];
        String TTL [] = new String [4];
        String Hasil [] = new String [4];
        double N_Akhir [] = new double [4];
        double N_Bi,N_Bing = 0, N_IPA = 0, N_Mat = 0;
        double N_Juara = 0.0;
        double R_UN;
        String Pilihan_1 [] = new String [4];
        String Juara;
        int Kode_Juara [] = new int [4];
        int Predikat = 0;
        int i = 0, j = 0;
        
       BufferedReader in = new BufferedReader (new InputStreamReader (System.in)) ;
       while (i<=2){
           System.out.print ("Masukkan Nama Peserta :"); Nama_P[i] = in.readLine();
           System.out.print ("Masukkan Asal Sekolah :"); Asal_Sekolah[i]= in.readLine() ;
           System.out.print ("Masukkan NISN :"); NISN[i] = in.readLine();
           System.out.print ("Masukkan Alamat:"); Alamat[i] = in.readLine() ;
           System.out.print ("Masukkan Tempat Tanggal Lahir :"); TTL[i] = in.readLine();
           System.out.println ("============================================================================");
           System.out.println ("NILAI UJIAN NASIONAL") ;
           System.out.print ("Masukkan Nilai UN Bahasa Indonesia :"); N_Bi = Double.parseDouble(in.readLine());
           System.out.print ("Masukkan Nilai UN Bahasa Inggris :"); N_Bing = Double.parseDouble(in.readLine());
           System.out.print ("Masukkan Nilai UN IPA :"); N_IPA = Double.parseDouble(in.readLine());
           System.out.print ("Masukkan Nilai UN Matematika :"); N_Mat = Double.parseDouble(in.readLine());
           System.out.println ("============================================================================");

           System.out.print ("Apakah Anda Memiliki Pretasi? YA/TIDAK :"); Pilihan_1 [i] = in.readLine();
           if (Pilihan_1[i].equalsIgnoreCase("YA")){
               System.out.println ("Tingkat Nasional Tekan 1");
               System.out.println ("Tingkat Provinsi Tekan 2");
               System.out.println ("Tingkat Kabupaten / Kota Tekan 3") ;
               System.out.print ("Juara Tingkat? : "); Kode_Juara [i] = Integer.parseInt(in.readLine());
               System.out.println ("============================================================================");
               System.out.println ("Predikat Juara Pilih Dari 1 s/d 3");
               System.out.print ("Predikat Juara :"); Predikat = Integer.parseInt(in.readLine());
               System.out.println ("============================================================================");
               
               if (Kode_Juara[j] == 1)
                   if (Kode_Juara[j] == 1){
                       Juara = "Nasional";
                            if(Predikat == 1){
                                N_Juara = 3.5;
                            }
                            else if(Predikat == 2){
                                N_Juara = 3.0;
                            }
                            else if(Predikat == 3){
                                N_Juara = 2.5;
                            }
                            else {
                                N_Juara =0;
                            }
                    }
                   else if (Kode_Juara[j]==2){
                       Juara = "Provinsi";
                       if(Predikat == 1){
                           N_Juara = 2.0;
                       }
                       else if(Predikat == 2){
                                N_Juara = 1.5;
                       }
                       else if(Predikat == 3){
                                N_Juara = 1.0;
                       }
                       else {
                                N_Juara =0;
                       }
                       
                   }
                    else if (Kode_Juara[j]==3){
                       Juara = "Kabupaten";
                       if(Predikat == 1){
                           N_Juara = 1.5;
                       }
                       else if(Predikat == 2){
                                N_Juara = 1.0;
                       }
                       else if(Predikat == 3){
                                N_Juara = 0.5;
                       }
                       else {
                                N_Juara =0;
                       }
                    }
               else {
                                N_Juara =0;
                }
            else {
                                N_Juara =0;
            }
            
               
            R_UN = (N_Bi + N_Bing + N_IPA + N_Mat)/4;
            N_Akhir[i] = R_UN + N_Juara;
            
            if(N_Akhir[i] >= 80.0){
                Hasil[i] = "Anda Diterima";
            }
            else{
                Hasil[i] = "Anda Tidak Diterima";
            }
            i++;
      
            }
           
              
     System.out.println ("=========================================================================================");
     System.out.println ("================================PENERIMAAN MAHASISWA BARU================================");
     System.out.println ("============================SEKOLAH TINGGI TEKNOLOGI BANDUNG=============================");
     System.out.println ("=======================JL SOEKARNO HATTA NO. 378 BOJONGLOA BANDUNG=======================");
     System.out.println ("=========================================================================================");
     System.out.println ("NAMA      NISN        ASAL        ALAMAT      TEMPAT TANGGAL      TOTAL NILAI     NILAI");
     System.out.println ("PESERTA               SEKOLAH                     LAHIR                           SELEKSI");
     System.out.println ("=========================================================================================");
     
    for (i=0;i<=2;i++){
     System.out.println(Nama_P[i] + "   " + NISN[i] + "     " + Asal_Sekolah[i] + " " + Alamat[i] + " " + TTL[i] + "      " + N_Akhir[i] + "      " + Hasil [i]);
                   
        }
     
    }
    
  }
    
}

