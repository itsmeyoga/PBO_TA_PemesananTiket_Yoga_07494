/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.AnggotaEntity;
import java.util.ArrayList;

public class AnggotaModel implements InterfacesModel{
    private ArrayList<AnggotaEntity> DataAnggota;
    
    public AnggotaModel(){
        DataAnggota = new ArrayList<>();
    }
    
    public ArrayList<AnggotaEntity> getDataAnggota(){
        return DataAnggota;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataAnggota.add((AnggotaEntity) x);
    }
    
    public void update(int index, Object x){
        DataAnggota.set(index, (AnggotaEntity) x);
    }
    
    public void delete(int index){
        DataAnggota.remove(index);
    }
    
    public void get_where(int index){
        DataAnggota.get(index);
    }
}
