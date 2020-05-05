package fastec.com.rrcc.generics.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
//class Test2<T> {
//    public static T one;
//    public static T test(T t){}
//
//    public static <T> T staticTest(T t){
//        return t;
//    }
//}

class Test3{

//    public static <E> void append(List<E> list){
//        E e = new E();
//        list.add(e);
//
//    }
    //通过一个反射 获取类的实例
    public static <E> void append(List<E> list,Class<E> cls)throws Exception{
      E e = cls.newInstance();//OK
      list.add(e);
    }
}

public class Test1 {


    public static void main(String[] args) throws Exception{
//      scene2();
//      scene3();
//        scene4();
//        scene5();
//        scene6();
         scene8();

    }
    HashMap<String,String> map;
    //验证泛型与反射关系
    public static void scene8() throws Exception{
        /**
         * 擦除  其实在类常量池里面保留了泛型信息
         */
        Field filed = Test1.class.getDeclaredField("map");
        //正在运行的Java应用程序中的类和接口 返回一个Field对象，该对象反映此Class对象所表示的类或接口的指定已声明字段
        System.out.println(filed.getGenericType());
        //返回一个 Type 对象，它表示此 Field 对象所表示字段的声明类型
        System.out.println(filed.getGenericType() instanceof ParameterizedType);
        ParameterizedType ptype = (ParameterizedType)filed.getGenericType();
        //ParameterizedType 表示参数化类型，如 Collection<String>
        System.out.println(ptype.getRawType());
        //getRawType 返回 Type 对象，表示声明此类型的类或接口
        for(Type type:ptype.getActualTypeArguments()){
            //返回表示此类型实际类型参数的 Type 对象的数组
            System.out.println(type);
        }
        System.out.println(ptype.getOwnerType());
        //返回 Type 对象，表示此类型是其成员之一的类型
    }

    /**
     * 使用无边界通配符
     *
     */
    public static void scene7(){
        //<?> == <? extends Object>
        AIPlate<?> plates = new AIPlate<Apple>();
//        Fruit fruit = plates.get();
//
//        plates.set(new Banana());


    }

    /**
     * 使用下界通配符
     */
    public static void scene6(){
        AIPlate<? super Fruit> lowerAIPlate = new AIPlate<Food>();
        lowerAIPlate.set(new Apple());
        lowerAIPlate.set(new Banana());

//        Fruit fruit = lowerAIPlate.get();
        Object fruit1 = lowerAIPlate.get();
        System.out.print(fruit1);
    }

    public static void scene5(){
//     AIPlate<Apple> aiPlate[] = new AIPlate<Apple>[10];
//     T arr[] = new T[10];
        Apple apples[] = new Apple[10];
        Fruit fruits[] = new  Fruit[10];
        System.out.print(apples.getClass());
        System.out.print(fruits.getClass());
        fruits = apples;
//      fruits[0] = new Banana();//Exception in thread "main"
// java.lang.ArrayStoreException
        /**
         * Fruit 是 Apple的父类，所以Fruit[] 也是 Apple[]的父类，这就是协变
         * 但是如果加入泛型，由于类型擦除，就不能确定其类型，所以不能创建泛型数组
         */
       Plate<?> plate[] = new Plate<?>[10];

    }


    public static void scene4(){
        ArrayList<String> strings = new ArrayList<String>();
        //instanceof 严格来说是Java中的一个双目运算符，用来测试一个对象是否为一个类的实例
//        if( strings instanceof ArrayList<String>){
//
//        }

        if (strings instanceof ArrayList<?>){
            System.out.print("true 0");
        }

    }

    public static void scene0(){
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

    public static void scene1(){
        Xiaoli xiaoli = new Xiaoli();
        XiaoMing xiaoMing = new XiaoMing();
        XiaoMingMa xiaoMingMa = new XiaoMingMa();

        AIPlate<Banana> aiPlate = xiaoMing.getAIPlate();
        xiaoMingMa.addFruitToAi(aiPlate);

         xiaoli.eat(aiPlate.get());

    }

    public static void scene2(){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        ArrayList<Banana> bananas = new ArrayList<Banana>();
        System.out.print(apples.getClass() == bananas.getClass());
    }

    public static void scene3(){
        AIPlate<Banana> plate = new AIPlate<Banana>();

    }

//    @Override
//    public boolean equals(T t) {
//        return super.equals(t);
//    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
