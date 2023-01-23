/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.AnggotaEntity;
import Model.AnggotaModel;
import java.util.ArrayList;

public class AnggotaController {
    public AnggotaModel anggotaM = new AnggotaModel();
    
    public AnggotaController(){
        
    }
    
    public ArrayList<AnggotaEntity> view(){
        return anggotaM.getDataAnggota();
    }
    
    public void insert(AnggotaEntity anggota){
        anggotaM.insert(anggota);
    }
    
    public void delete(int index){
        anggotaM.delete(index);
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
