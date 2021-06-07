package pemesanan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       menu();
    }
    public static void menu(){
       Scanner in = new Scanner(System.in);
        System.out.println("==== Program Pemasanan Pakaian ===");
        System.out.println("1.Pesan Sekarang");
        System.out.println("2.Cetak Struck");
        System.out.println("masukkan pilihan anda :");
        int pilih = in.nextInt();
        switch (pilih){
            case 1:
                pesan();
            case 2:
                cetak();
            default:
                menu();
        }
    }
    public static void pesan(){
        Scanner in = new Scanner(System.in);
        data d = new data();
        System.out.println("Nama anda :");
        String namaAnda = in.nextLine();
        d.setNama(namaAnda);

        System.out.println("Alamat anda :");
        String alamat = in.nextLine();
        d.setAlamat(alamat);

        System.out.println("list Barang :");
        System.out.println("1.Baju \n2.Celana \n3.Jas");
        System.out.println("Input jenis :");
        String namaJenis = in.nextLine();
        d.setPakaianJenis(namaJenis);
        System.out.println("Input ukuran :");
        String ukuran = in.nextLine();
        d.setUkuran(ukuran);
        System.out.println("Input Jumlah :");
        int jumlah = in.nextInt();
        d.setJumlah(jumlah);
    }
    public static void cetak(){

    }
}
