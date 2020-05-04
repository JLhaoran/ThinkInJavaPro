package fastec.com.rrcc.generics.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: AIPlate
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午3:53
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午3:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AIPlate<T> implements Plate<T> {
    List<T> items = new ArrayList<T>();

    public AIPlate() {
    }

    public AIPlate(T t) {
        items.add(t);
    }


    @Override
    public void set(T t) {
        items.add(t);
    }

    @Override
    public T get() {
        int index = items.size() -1;
        if(index>= 0){
            return items.get(index);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "AIPlate{" +
                "items=" + items +
                '}';
    }
}

