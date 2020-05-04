package fastec.com.rrcc.generics.demo01;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: Test1
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午4:04
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午4:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test1 {

    public static void main(String[] args){
      Test1 test1 = new Test1();
//      test1.scene0();
      test1.scene1();
    }

    public void scene0(){
        Xiaoli xiaoli = new Xiaoli();
        XiaoMing xiaoMing = new XiaoMing();
        XiaoMingMa xiaoMingMa = new XiaoMingMa();

        RawPlate rawPlate = xiaoMing.getPlate();
        xiaoMingMa.addFruit(rawPlate);

        xiaoli.eat((Banana) rawPlate.get());
        /**
         * Exception in thread "main" java.lang.ClassCastException: fastec.com.rrcc.generics.demo01.Apple cannot be cast to fastec.com.rrcc.generics.demo01.Banana
         at fastec.com.rrcc.generics.demo01.Test1.scene0(Test1.java:30)
         at fastec.com.rrcc.generics.demo01.Test1.main(Test1.java:19)

         */
    }

    public void scene1(){
        Xiaoli xiaoli = new Xiaoli();
        XiaoMing xiaoMing = new XiaoMing();
        XiaoMingMa xiaoMingMa = new XiaoMingMa();

        AIPlate<Banana> aiPlate = xiaoMing.getAIPlate();
        xiaoMingMa.addFruitToAi(aiPlate);

         xiaoli.eat(aiPlate.get());

    }

}
