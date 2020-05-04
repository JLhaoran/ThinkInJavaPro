package fastec.com.rrcc.generics.demo01;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: Xiaoli
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午12:10
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午12:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Xiaoli extends Person {
    public void eat(Banana banana){
        //正准备高兴的吃香蕉的时候，发现是苹果，生气了
        System.out.println("小丽吃"+ banana);
    }

    @Override
    public String toString() {
        return "Xiaoli";
    }
}
