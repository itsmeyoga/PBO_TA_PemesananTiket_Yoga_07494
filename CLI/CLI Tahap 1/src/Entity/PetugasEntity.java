package Entity;

/**
 *
 * @author Yoga Pratama
 */
public class PetugasEntity extends UserEntity{
    private String passwordPtgs;
    
    public PetugasEntity(){
        
    }
    
    public PetugasEntity(String id, String nama, String alamat, String passwordPtgs){
        super(id, nama, alamat);
        this.passwordPtgs = passwordPtgs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswordPtgs() {
        return passwordPtgs;
    }

    public void setPasswordPtgs(String passwordPtgs) {
        this.passwordPtgs = passwordPtgs;
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
}
