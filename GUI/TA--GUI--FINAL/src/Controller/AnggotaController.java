package Controller;

import Entity.AnggotaEntity;
import Model.AnggotaModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.AllObjectController;

/**
 *
 * @author Yoga Pratama
 */
public class AnggotaController {
    public AnggotaModel anggotaM = new AnggotaModel();
    
    public AnggotaController(){
        
    }
    
    public ArrayList<AnggotaEntity> view(){
        return anggotaM.getDataAnggota();
    }
    
    public void insert(String idanggota, String namaanggota, String alamatanggota, String notelp){
        AnggotaEntity anggota = new AnggotaEntity();
        anggota.setId(idanggota);
        anggota.setNama(namaanggota);
        anggota.setAlamat(alamatanggota);
        anggota.setNoTelp(notelp);
        anggotaM.insert(anggota);
    }
    
    public void delete(int index){
        anggotaM.delete(index);
    }
    
    public DefaultTableModel listanggota(){
    DefaultTableModel dtmlistanggota = new DefaultTableModel();
    Object[] kolom ={"ID", "Nama Anggota", "Alamat", "No.Telp"};
    dtmlistanggota.setColumnIdentifiers(kolom);
    int size = AllObjectController.anggota.view().size();
    for (int i = 0; i < size; i++){
        Object [] anggota =new Object[4];
        anggota[0] = AllObjectController.anggota.view().get(i).getId();
        anggota[1] = AllObjectController.anggota.view().get(i).getNama();
        anggota[2] = AllObjectController.anggota.view().get(i).getAlamat();
        anggota[3] = AllObjectController.anggota.view().get(i).getNoTelp();
        dtmlistanggota.addRow(anggota);
    }
    return dtmlistanggota;
}
    
    public int cekAnggota(String idAnggota){
        int keterangan = -1;
        if(anggotaM.getDataAnggota().size()>0){
            for(int i=0;i<anggotaM.getDataAnggota().size();i++){
             if(idAnggota.equals(anggotaM.getDataAnggota().get(i).getId())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public AnggotaEntity showDaftarAnggota(int index){
        return anggotaM.getDataAnggota().get(index);
    }
}
