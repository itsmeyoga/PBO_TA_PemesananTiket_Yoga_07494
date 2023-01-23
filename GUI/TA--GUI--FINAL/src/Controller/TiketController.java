package Controller;

import Entity.TiketEntity;
import Model.TiketModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.AllObjectController;
/**
 *
 * @author Yoga Pratama
 */
public class TiketController {
    public TiketModel tiketM = new TiketModel();
    
    public TiketController(){
        
    }
    
    public ArrayList<TiketEntity> view(){
        return tiketM.getDataTiket();
    }
    
    public void insert(String idtiket, String namapemesan, String jenistiket, String tujuantiket, String jadwaltiket, String jumlahtiket){
        TiketEntity tiket = new TiketEntity();
        tiket.setIdTiket(idtiket);
        tiket.setNamapemesan(namapemesan);
        tiket.setJenis(jenistiket);
        tiket.setTujuan(tujuantiket);
        tiket.setJadwal(jadwaltiket);
        tiket.setJumlahtiket(jumlahtiket);
        tiketM.insert(tiket);
    }
    
    public void update(int index, String idtiket, String namapemesan, String jenistiket, String tujuantiket, String jadwaltiket, String jumlahtiket){
        TiketEntity tiket = new TiketEntity();
        tiket.setIdTiket(idtiket);
        tiket.setNamapemesan(namapemesan);
        tiket.setJenis(jenistiket);
        tiket.setTujuan(tujuantiket);
        tiket.setJadwal(jadwaltiket);
        tiket.setJumlahtiket(jumlahtiket);
        tiketM.update(index, tiket);
    }
    
    public void delete(int index){
        tiketM.delete(index);
    }
    
    public DefaultTableModel listtiket(){
    DefaultTableModel dtmlisttiket = new DefaultTableModel();
    Object[] kolom ={"ID Tiket", "Nama Pemesan", "Jenis Tiket", "Tujuan Tiket", "Jadwal Tiket", "Jumlah Tiket"};
    dtmlisttiket.setColumnIdentifiers(kolom);
    int size = AllObjectController.tiket.view().size();
    for (int i = 0; i < size; i++){
        Object [] tiket =new Object[6];
        tiket[0] = AllObjectController.tiket.view().get(i).getIdTiket();
        tiket[1] = AllObjectController.tiket.view().get(i).getNamapemesan();
        tiket[2] = AllObjectController.tiket.view().get(i).getJenis();
        tiket[3] = AllObjectController.tiket.view().get(i).getTujuan();
        tiket[4] = AllObjectController.tiket.view().get(i).getJadwal();
        tiket[5] = AllObjectController.tiket.view().get(i).getJumlahtiket();
        dtmlisttiket.addRow(tiket);
    }
    return dtmlisttiket;
}
    
    public int cekTiket(String idTiket){
    int keterangan = -1;
        if(tiketM.getDataTiket().size()>0){
            for(int i=0;i<tiketM.getDataTiket().size();i++){
             if(idTiket.equals(tiketM.getDataTiket().get(i).getIdTiket())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public TiketEntity showDaftarTiket(int index){
        return tiketM.getDataTiket.get(index);
    }
    
}
