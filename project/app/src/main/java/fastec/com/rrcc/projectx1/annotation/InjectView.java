package fastec.com.rrcc.projectx1.annotation;
import android.support.annotation.IdRes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.projectx1.annotation
 * @ClassName: InjectInterface
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/6 上午9:30
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/6 上午9:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectView {
    @IdRes int value();
}
