package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class yang digunakan untuk menampilkan tanda sesuai kondisi umur.
 * 
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private final String red = "\033[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        if ((umur >= 0) && (umur <= 5))
            return red.concat("LAGI LUCU-LUCU NYA");
        else if ((umur > 5) && (umur <= 10))
            return red.concat("MASIH ANAK-ANAK");
        else if ((umur > 10) && (umur <= 13))
            return red.concat("MASIH REMADJA");
        else if ((umur > 13) && (umur <= 19))
            return red.concat("ALAY");
        else if ((umur > 19) && (umur <= 29))
            return red.concat("LAGI GALAU NYARI JODOH");
        else if ((umur > 29) && (umur <= 35))
            return red.concat("LAGI SIBUK NYARI UANG");
        else if ((umur > 35) && (umur <= 150))
            return red.concat("SUDAH TUA");
        else
            return red.concat("TIDAK TERDETEKSI DI KEHIDUPAN");
    }
}
