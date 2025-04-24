public class CariDuplikat {
    public static void main(String[] args) {
        // Array angka yang ingin dicari posisinya
        int[] cari = {1,2,5,7,8,11};

        // Array 2 dimensi tempat pencarian dilakukan
        int[][] duad = {
            {1,2,3,4,5,6,7,8,9,10,11},
            {1,3,5,7,9,11},
            {2,4,6,8,10}
        };

        // Loop untuk setiap angka dalam array cari
        for (int k = 0; k < cari.length; k++) {
            int num = cari[k]; // angka yang sedang dicari
            System.out.print("Angka Terduplikat : " + num + "\nLokasi : ");

            boolean found = false; // penanda apakah angka ditemukan

            // Loop melalui setiap subarray (baris) dalam duad
            for (int i = 0; i < duad.length; i++) {
                // Loop setiap elemen dalam subarray
                for (int j = 0; j < duad[i].length; j++) {
                    if (duad[i][j] == num) {
                        if (found) {
                            System.out.print("dan "); // cetak "dan" jika angka ditemukan di lebih dari satu baris
                        }
                        System.out.print("[" + (i + 1) + "] "); // cetak lokasi baris (indeks+1)
                        found = true;
                        break; // lanjut ke baris berikutnya
                    }
                }
            }

            // Jika angka tidak ditemukan di duad
            if (!found) {
                System.out.print("Not found");
            }
            // Memberi jeda antar outputs
            System.out.println("\n");
        }
    }
}
