
package app;
 import java.util.ArrayList;
import java.util.List;
import model.barang;

public class Main {
    public static void main(String[] args) {
        barang keyboard =new barang("BRG-001", "Keyboard USB", 10);
        barang mouse =new barang("BRG-002", "Mouse USB", 8);
        
        List<barang> daftarbarang = new ArrayList<barang> ();
        daftarbarang.add(keyboard);   
        daftarbarang.add(mouse);
        
        System.out.println("DATA AWAL");
        tampilan(daftarbarang);
        
        keyboard.pinjam(3);
        keyboard.kembalikan(2);
         
         System.out.println("SETELAH TRANSAKSI CONTOPH");
        tampilan(daftarbarang);
        
        try{
         keyboard.pinjam(100);
        } catch (IllegalArgumentException e) {
              System.out.println("Gagal: " + e.getMessage());  
        }
            System.out.println("Keyboard tersedia:" +  keyboard.getjumlahTersedia() );
    }
    private static void tampilan(List<barang> daftarbarang) {
        for (barang barang : daftarbarang) {
          System.out.println(barang.getKode() + "|" + barang.getNama() + "|" + barang.getjumlahTersedia());
        }
    }
    
}
