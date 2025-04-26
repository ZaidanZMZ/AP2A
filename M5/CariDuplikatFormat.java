public class CariDuplikatFormat {
    public static void main(String[] args) {
        // Membuat array 1D berisi beberapa angka
        int[] cari = {12, 1, 5, 12, 1, 7, 9};
        
        // Membuat array 2D berisi beberapa angka
        int[][] duad = {
            {4, 10, 8, 12},
            {5, 10, 12, 7},
            {1, 3, 8, 6}
        };

        //Cek duplikat di array 1D
        System.out.println("- Output 1D:");
        int counter1D = 1; // Untuk menghitung elemen ganda ke-berapa

        // Loop setiap elemen array 1D
        for (int i = 0; i < cari.length; i++) {
            boolean sudahDicek = false; // Tandai apakah angka ini sudah dicek sebelumnya

            // Loop untuk cek apakah angka ini sudah pernah muncul sebelum posisi i
            for (int k = 0; k < i; k++) {
                if (cari[i] == cari[k]) {
                    sudahDicek = true; // Jika sudah pernah muncul, tandai true
                    break;
                }
            }

            // Kalau angka ini belum dicek sebelumnya
            if (!sudahDicek) {
                int count = 0; // Hitung berapa kali angka ini muncul
                String lokasi = ""; // String untuk menyimpan lokasi duplikat

                // Loop semua elemen lagi untuk cari lokasi angka yang sama
                for (int j = 0; j < cari.length; j++) {
                    if (cari[i] == cari[j]) {
                        count++; // Tambah jumlah ditemukan
                        if (!lokasi.equals("")) {
                            lokasi += " dan "; // Tambahkan "dan" jika sudah ada lokasi sebelumnya
                        }
                        lokasi += "[" + j + "]"; // Tambahkan lokasi ke string
                    }
                }

                // Jika ditemukan lebih dari 1 kali, cetak
                if (count > 1) {
                    System.out.println("Elemen ganda " + counter1D + ": " + cari[i]);
                    System.out.println("Lokasi : " + lokasi);
                    System.out.println();
                    counter1D++; // Naikkan nomor elemen ganda
                }
            }
        }

        // Cek duplikat di array 2D
        System.out.println("- Output 2D:");
        int counter2D = 1; // Untuk menghitung elemen ganda ke-berapa di 2D

        // Loop setiap elemen array 2D
        for (int i = 0; i < duad.length; i++) {
            for (int j = 0; j < duad[i].length; j++) {
                boolean sudahDicek = false; // Tandai apakah angka ini sudah dicek sebelumnya

                // Loop semua elemen sebelum (i,j) untuk cek apakah sudah pernah diperiksa
                for (int a = 0; a < duad.length; a++) {
                    for (int b = 0; b < duad[a].length; b++) {
                        // Lewati elemen setelah (i,j) supaya tidak cek ke depan
                        if (a > i || (a == i && b >= j)) {
                            continue;
                        }
                        if (duad[i][j] == duad[a][b]) {
                            sudahDicek = true; // Jika ditemukan sebelumnya, tandai
                            break;
                        }
                    }
                    if (sudahDicek) {
                        break; // Jika sudah dicek, keluar loop
                    }
                }

                // Kalau angka ini belum dicek sebelumnya
                if (!sudahDicek) {
                    int count = 0; // Hitung berapa kali angka ini muncul
                    String lokasi = ""; // String untuk menyimpan lokasi duplikat

                    // Loop semua elemen untuk cari lokasi angka yang sama
                    for (int m = 0; m < duad.length; m++) {
                        for (int n = 0; n < duad[m].length; n++) {
                            if (duad[i][j] == duad[m][n]) {
                                count++; // Tambah jumlah ditemukan
                                if (!lokasi.equals("")) {
                                    lokasi += " dan "; // Tambahkan "dan" jika sudah ada lokasi sebelumnya
                                }
                                lokasi += "[" + m + "][" + n + "]"; // Tambahkan lokasi ke string
                            }
                        }
                    }

                    // Jika ditemukan lebih dari 1 kali, cetak
                    if (count > 1) {
                        System.out.println("Elemen ganda " + counter2D + ": " + duad[i][j]);
                        System.out.println("Lokasi : " + lokasi);
                        System.out.println();
                        counter2D++; // Naikkan nomor elemen ganda
                    }
                }
            }
        }
    }
}
