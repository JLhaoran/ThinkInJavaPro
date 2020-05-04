package fastec.com.rrcc.generics.demo01;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: XiaoMing
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午12:21
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午12:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class XiaoMing extends Person{

    public RawPlate getPlate(){
        return new RawPlate();
    }

    public <T> AIPlate<T> getAIPlate(){
        return new AIPlate<T>();
    }

    @Override
    public String toString() {
        return "XiaoMing";
    }
}
