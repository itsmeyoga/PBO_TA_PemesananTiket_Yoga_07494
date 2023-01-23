/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.PetugasEntity;
import java.util.ArrayList;

public class PetugasModel implements InterfacesModel {
    public ArrayList<PetugasEntity> DataPetugas;
    
    public PetugasModel(){
        DataPetugas = new ArrayList<>();
    }
    
    public ArrayList<PetugasEntity> getDataPetugas(){
        return DataPetugas;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataPetugas.add((PetugasEntity) x);
    }
    
    public void update(int index, Object x){
        DataPetugas.set(index, (PetugasEntity) x);
    }
    
    public void delete(int index){
        DataPetugas.remove(index);
    }
    
}
