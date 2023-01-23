/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class TiketEntity {
    private String idTiket, jenis, tujuan, jadwal;
    private int jumlah;
    
    public TiketEntity(String idTiket, String jenis, String tujuan, String jadwal, int jumlah){
        this.idTiket = idTiket;
        this.jenis = jenis;
        this.tujuan = tujuan;
        this.jadwal = jadwal;
        this.jumlah = jumlah;
    }
    
    public TiketEntity(){
        
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
}
