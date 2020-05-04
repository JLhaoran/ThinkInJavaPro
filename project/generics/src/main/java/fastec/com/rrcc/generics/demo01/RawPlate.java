package fastec.com.rrcc.generics.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: RawPlate
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午3:50
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午3:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RawPlate implements Plate{
    private List items = new ArrayList(10);

    public RawPlate(){

    }

    @Override
    public void set(Object fruit) {
        items.add(fruit);
    }

    @Override
    public Object get() {
        int index = items.size() -1;
        if(index>= 0){
            return (Fruit) items.get(index);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "RawPlate{" +
                "items=" + items +
                '}';
    }
}
