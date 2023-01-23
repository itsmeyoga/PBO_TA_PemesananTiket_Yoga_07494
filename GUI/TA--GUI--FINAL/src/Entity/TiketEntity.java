package Entity;

/**
 *
 * @author Yoga Pratama
 */
public class TiketEntity {
    private String idTiket, namapemesan, jenis, tujuan, jadwal, jumlahtiket;
    
    public TiketEntity(String idTiket, String namapemesan, String jenis, String tujuan, String jadwal, String jumlahtiket){
        this.idTiket = idTiket;
        this.namapemesan = namapemesan;
        this.jenis = jenis;
        this.tujuan = tujuan;
        this.jadwal = jadwal;
        this.jumlahtiket = jumlahtiket;
    }
    
    public TiketEntity(){
        
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public String getNamapemesan() {
        return namapemesan;
    }

    public void setNamapemesan(String namapemesan) {
        this.namapemesan = namapemesan;
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

    public String getJumlahtiket() {
        return jumlahtiket;
    }

    public void setJumlahtiket(String jumlahtiket) {
        this.jumlahtiket = jumlahtiket;
    }
}
