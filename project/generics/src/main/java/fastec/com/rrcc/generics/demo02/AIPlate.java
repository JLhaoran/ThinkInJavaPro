package fastec.com.rrcc.generics.demo02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AIPlate<T extends Comparable<T>> implements Plate<T>{

    private List<T> items = new ArrayList<T>(10);

    public AIPlate(){

    }

    public void set(T t) {
        items.add(t);
        Collections.sort(items);
    }

    public T get(){
        int index = items.size() -1;
        if(index>= 0){
            return items.get(index);
        }else{
            return null;
        }

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "items=" + items +
                '}';
    }
}

