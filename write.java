package pemesanan;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class write {
    public void write(){
        Scanner input = new Scanner(System.in);
        try {
            data rekap = new data();
            System.out.println("Input ke txt");
            File file = new File("data.txt");
            String format = String.format(rekap.getNama() +"\t"+rekap.getAlamat()+"\t"+rekap.getPakaianJenis()+"\t"+rekap.getUkuran()+"\t");
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt",true));
            bw.write(format);
            bw.flush();
            bw.newLine();
            bw.close();
            System.out.println("Data berhasil ditambahkan");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
