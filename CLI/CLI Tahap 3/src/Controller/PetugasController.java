/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PetugasModel;
import Entity.PetugasEntity;
import java.util.ArrayList;

public class PetugasController {
    public PetugasModel petugasM = new PetugasModel();
    
    public PetugasController(){
        
    }
    
    public ArrayList<PetugasEntity> view(){
        return petugasM.getDataPetugas();
    }
    
    public void insert(PetugasEntity petugas){
        petugasM.insert(petugas);
    }
    
    public void update(int index, PetugasEntity petugas){
        petugasM.update(index, petugas);
    }
    
    public void delete(int index){
        petugasM.delete(index);
    }
    
}
