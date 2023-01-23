package Entity;

/**
 *
 * @author Yoga Pratama
 */
public class AnggotaEntity extends UserEntity{
    protected String noTelp;
    
    public AnggotaEntity(){
        
    }
    
    public AnggotaEntity(String id, String nama, String alamat, String noTelp){
        super(id, nama, alamat);
        this.noTelp = noTelp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
}
