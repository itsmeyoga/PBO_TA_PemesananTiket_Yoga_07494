package Model;

import Entity.RegLogEntity;
import java.util.ArrayList;

/**
 *
 * @author Yoga Pratama
 */
public class RegLogModel implements InterfacesModel {
    public ArrayList<RegLogEntity> DataRegLog;
    
    public RegLogModel(){
        DataRegLog = new ArrayList<>();
    }
    
    public ArrayList<RegLogEntity> getDataPetugas(){
        return DataRegLog;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataRegLog.add((RegLogEntity) x);
    }
    
    public void update(int index, Object x){
        DataRegLog.set(index, (RegLogEntity) x);
    }
    
    public void delete(int index){
        DataRegLog.remove(index);
    }
    
}
