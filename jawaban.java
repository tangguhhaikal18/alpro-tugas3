// ini yang pertama
public class jawaban {
    public static void main(String[] args) {
        // Pola bintang
        for (int i = 1; i <= 5; i++) {  // Baris
            for (int j = 1; j <= i; j++) {  // Kolom
                System.out.print("* ");  // Menampilkan bintang
            }
            System.out.println();  // Pindah ke baris baru setelah setiap baris
        }
    }
}

// ini yang kedua
public class jawaban {
    public static void main(String[] args) {
        // Pola angka
        for (int i = 1; i <= 5; i++) {  // Baris
            for (int j = 1; j <= i; j++) {  // Kolom
                System.out.print(j + " ");  // Menampilkan angka
            }
            System.out.println();  // Pindah ke baris baru setelah setiap baris
        }
    }
}
