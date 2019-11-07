package pbo1.nim10118017;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main untuk class Age.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        Age age = new Age(calendar.get(Calendar.YEAR));
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
        
    }
    
}
