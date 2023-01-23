package Controller;

import Model.RegLogModel;
import Entity.RegLogEntity;
import java.util.ArrayList;

/**
 *
 * @author Yoga Pratama
 */
public class RegLogController {
    public RegLogModel reglogM = new RegLogModel();
    
    public RegLogController(){
        
    }
    
    public ArrayList<RegLogEntity> view(){
        return reglogM.getDataPetugas();
    }
    
    public void insert(RegLogEntity petugas){
        reglogM.insert(petugas);
    }
    
    public void update(int index, RegLogEntity petugas){
        reglogM.update(index, petugas);
    }
    
    public void delete(int index){
        reglogM.delete(index);
    }
    
}
