
package model;


public class barang {
    private String kode;
    private String nama;
    private int jumlahTersedia;
    
    public Barang(String kode,String nama, int jumlahTersedia){
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode barang wajib diisi.");
        }
        if (nama == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang wajib diisi.");
        }
        if (jumlahTersedia < 0) {
            throw new IllegalArgumentException("Jumlah awal tidak boleh negatif");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.jumlahTersedia = jumlahTersedia;    
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public String getjumlahTersedia(){
        return jumlahTersedia;
    }
    
    public void pinjam(int jumlah) {
        if (jumlah <= ) {
            throw new IllegalArgumentException("Jumlah pinjam harus positif");
        }
        if (jumlah > jumlahTersedia ) {
            throw new IllegalArgumentException("Jumlah pinjam harus positif");
        }
        
    }
}
