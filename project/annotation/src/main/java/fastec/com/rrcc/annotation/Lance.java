package fastec.com.rrcc.annotation;

/**
 * @ProjectName: project
 * @Package: fastec.com.rrcc.annotation
 * @ClassName: Lance
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/5/5 下午12:13
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/5/5 下午12:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public @interface Lance {
    String value(); //无默认值
    int age() default 1; //有默认值
}
