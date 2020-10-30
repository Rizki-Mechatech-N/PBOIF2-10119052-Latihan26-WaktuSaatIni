package pboif2.pkg10119052.latihan26.waktusaatini;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Waktu Saat Ini
 * 
 */
public class PBOIF210119052Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("E, dd MMMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari : "+format.format(tanggal));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
    }
    
}
