public class MahasiswaDemo25 {
    public static void main(String[] args) {
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        Mahasiswa25 m1 = new Mahasiswa25("111", "ayu", "2c", 3.7);
        Mahasiswa25 m2 = new Mahasiswa25("222", "dika", "2c", 3.0);
        Mahasiswa25 m3 = new Mahasiswa25("333", "ila", "2c", 3.8);
        Mahasiswa25 m4 = new Mahasiswa25("444", "susi", "2c", 3.1);
        Mahasiswa25 m5 = new Mahasiswa25("555", "yayuk", "2c", 3.4);
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Masukkan Data Mahasiswa ke-1");
        m1.tampilInformasi();
        System.out.println("----------------------");

        System.out.println("Masukkan Data Mahasiswa ke-2");
        m2.tampilInformasi();
        System.out.println("----------------------");

        System.out.println("Masukkan Data Mahasiswa ke-3");
        m3.tampilInformasi();
        System.out.println("----------------------");

        System.out.println("Masukkan Data Mahasiswa ke-4");
        m4.tampilInformasi();
        System.out.println("----------------------");

        System.out.println("Masukkan Data Mahasiswa ke-5");
        m5.tampilInformasi();
        System.out.println("----------------------");

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
