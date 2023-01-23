/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.TiketEntity;
import Model.TiketModel;
import java.util.ArrayList;

public class TiketController {
    public TiketModel tiketM = new TiketModel();
    
    public TiketController(){
        
    }
    
    public ArrayList<TiketEntity> view(){
        return tiketM.getDataTiket();
    }
    
    public void insert(TiketEntity tiket){
        tiketM.insert(tiket);
    }
    
    public void update(int index, TiketEntity tiket){
        tiketM.update(index, tiket);
    }
    
    public void delete(int index){
        tiketM.delete(index);
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
