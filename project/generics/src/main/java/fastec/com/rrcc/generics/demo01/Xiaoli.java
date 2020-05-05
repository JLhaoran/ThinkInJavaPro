package fastec.com.rrcc.generics.demo01;

import java.lang.reflect.Method;

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

    public AIPlate<Apple> getSnakePlate(AIPlate<Apple> appleAIPlate
    ){
        appleAIPlate.set(new Apple());
//        appleAIPlate.set(new Banana());
/**
 * 很明显 苹果盘放香蕉是不被允许的 编译就通不过
 * 那就考虑将苹果盘 强转为水果盘 应该可以放其它水果了吧
 * 但是现实是Java 不允许这样操作的
 */
//        AIPlate<Fruit> fruitAIPlate = (AIPlate<Fruit>)appleAIPlate;
//        fruitAIPlate.set(new Banana());
        /**
         * 使用上界通配符
         */
       AIPlate<? extends Fruit> fruits = appleAIPlate;
//       fruits.set(new Banana());
        /**
         * 通过反射可以实现 可写
         */
        try {
           Method set = fruits.getClass().getMethod("set",Object.class);
           set.invoke(fruits,new Banana());
           set.invoke(fruits,new Apple());
           set.invoke(fruits,new Beef());


        }catch (Exception e){

        }


       return appleAIPlate;
    }


}
