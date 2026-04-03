import java.util.Scanner;
public class DosenMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen25 list = new DataDosen25();
        int pilih;

        do {
            System.out.println("\n MENU DATA DOSEN");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda → tertua)");
            System.out.println("4. Sorting DSC (Usia tertua → termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    Dosen25 d = new Dosen25(kd, nama, jenisKelamin, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}