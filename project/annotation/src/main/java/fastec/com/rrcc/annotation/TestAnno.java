package fastec.com.rrcc.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.annotation
 * @ClassName: TestAnno
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/5 下午3:51
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/5 下午3:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestAnno{

    public static void main(String[] args){
//        testAn(MONDAY);
        testEnum(Week.MONDAY);
    }

    //枚举方法
    public static void testEnum(Week week){
        String str = "";
        switch (week) {
            case MONDAY:
                str = ">今天星期一";
                break;
            case TUESDAY:
                str = ">今天星期二";
                break;
            case WEDNESDAY:
                str = "今天星期三";
                break;
            case THURSDAY:
                str = ">今天星期四";
                break;
            case FRIDAY:
                str = ">今天星期五";
                break;
            case SATURDAY:
                str = ">今天星期六";
                break;
            case SUNDAY:
                str = ">今天周末";
                break;
        }
        System.out.print(str);
    }
    //而现在为了进行内存优化，我们现在不再使用枚举，则方法定义为：
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;

    //改为
    public static void testEnum(int week){

    }
    //但因为是基本类型 无法达到限制作用
    //于是采用以下方法

    @IntDef(value = {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY})//限定
    @Target({ElementType.PARAMETER})//作用于参数的注解
    @Retention(RetentionPolicy.SOURCE)//保留级别为源码
    public @interface week{

    }


    public static void testAn(@week int week) {
        String str = "";
        switch (week) {
            case 0:
                str = "今天星期一";
                break;
            case 1:
                str = "今天星期二";
                break;
            case 2:
                str = "今天星期三";
                break;
            case 3:
                str = "今天星期四";
                break;
            case 4:
                str = "今天星期五";
                break;
            case 5:
                str = "今天星期六";
                break;
            case 6:
                str = "今天周末";
                break;
        }
        System.out.print(str);
    }

}




