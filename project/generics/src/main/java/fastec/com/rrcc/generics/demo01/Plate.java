package fastec.com.rrcc.generics.demo01;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.generics.demo01
 * @ClassName: Plate
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/4 下午12:19
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/4 下午12:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Plate<T> {
    public void set(T t);
    public T get();
}
