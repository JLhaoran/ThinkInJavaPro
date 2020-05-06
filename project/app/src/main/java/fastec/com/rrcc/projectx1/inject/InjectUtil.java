package fastec.com.rrcc.projectx1.inject;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

import fastec.com.rrcc.projectx1.annotation.InjectView;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.projectx1.inject
 * @ClassName: InjectUtil
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/6 上午9:22
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/6 上午9:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class InjectUtil {

    public static void inject(Activity activity) {
        Class<? extends Activity> cls = activity.getClass();
        //获得此类所有的成员
        Field[] fields = cls.getDeclaredFields();

        //遍历带注解的所有字段对象 并处理
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectView.class) == true) {
                InjectView injectView = field.getAnnotation(InjectView.class);
                //通过反射来获取值id
                int id = injectView.value();
                View view = activity.findViewById(id);
                //反射设置 属性的值
                field.setAccessible(true);
                try {
                    //反射赋值
                    field.set(activity, view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
