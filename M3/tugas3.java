
/*
 * String Nama = "Zaidan Zaki Maksudi";
 * String NPM = "51424398";
 * String Kelas = "1IA20";
 */

 public class tugas2 {
    public static void main(String[] args) {
        // Inisialisasi string 'gundar' dengan teks tertentu
        String gundar = "gunadarma dgx tolong dibenarkan!";

        // Menampilkan isi string dan panjangnya
        System.out.println(gundar + "\nPanjang string = " + gundar.length());

        // Perulangan sebanyak 5 kali
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // Menampilkan urutan iterasi keberapa yang sedang dijalankan

            // Jika i kurang dari 2, tampilkan string dalam huruf kapital
            if (i < 2) {
                System.out.println(gundar.toUpperCase());

            // Jika i antara 2 dan 3, tampilkan string dalam huruf kecil
            } else if (i >= 2 && i < 4) {
                System.out.println(gundar.toLowerCase());

            // Jika i 4 atau lebih, tampilkan posisi substring "gunadarma"
            } else {
                System.out.println("Index Gundar : " + gundar.indexOf("gunadarma"));

            }
        }

    }
}

