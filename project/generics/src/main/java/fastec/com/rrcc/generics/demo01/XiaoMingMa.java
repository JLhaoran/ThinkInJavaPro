package fastec.com.rrcc.generics.demo01;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: XiaoMingMa
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午3:45
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午3:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class XiaoMingMa extends Person {

    public void addFruit(RawPlate rawPlate){
        rawPlate.set(new Apple());
    }

    /**
     * 这里不是泛型方法，这只是一个普通方法，只是使用了AIPlate<Banana>这个泛型类做形参而已
     * @param aiPlate
     */
    public  void addFruitToAi(AIPlate<Banana> aiPlate){
        aiPlate.set(new Banana());
    }


    @Override
    public String toString() {
        return "XiaoMingMa";
    }
}
