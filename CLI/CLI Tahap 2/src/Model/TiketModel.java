/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.TiketEntity;
import java.util.ArrayList;

public class TiketModel {
    private ArrayList<TiketEntity> DataTiket;
    public ArrayList<TiketEntity> getDataTiket;
    
    public TiketModel(){
        DataTiket = new ArrayList<>();
    }
    
    public ArrayList<TiketEntity> getDataTiket(){
        return DataTiket;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataTiket.add((TiketEntity) x);
    }
    
    public void update(int index, Object x){
        DataTiket.set(index, (TiketEntity) x);
    }
    
    public void delete(int index){
        DataTiket.remove(index);
    }
    
    public void get_where(int index){
        DataTiket.get(index);
    }
    
}
