package fastec.com.rrcc.annotation;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.annotation
 * @ClassName: Annotation
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/5 下午12:10
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/5 下午12:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Annotation{
    boolean equals(Object obj);
    int hashCode();
    String toString();
    Class<? extends Annotation> annotationType();
}
