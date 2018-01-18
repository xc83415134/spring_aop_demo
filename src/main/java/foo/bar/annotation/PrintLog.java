package foo.bar.annotation;

import java.lang.annotation.*;

/**
 * Created by xuc on 2018/1/18.
 * 日志生成注解(切点)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface PrintLog {
    int type();
}
