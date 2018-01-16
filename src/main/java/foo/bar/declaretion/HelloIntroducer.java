package foo.bar.declaretion;

import foo.bar.observed.DeclareHello;
import foo.bar.observed.IDeclareHello;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/16.
 *
 * 将{@link DeclareHello}介绍给{@link HelloIntroducer}
 * 这是一种装饰模式，是对原类的加强
 */
@Component
@Aspect
public class HelloIntroducer {

    @DeclareParents(value = "foo.bar.observed.HelloByAnnotation", defaultImpl = DeclareHello.class)
    public static IDeclareHello declareHello;
}
