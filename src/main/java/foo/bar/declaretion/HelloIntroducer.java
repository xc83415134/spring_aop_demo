package foo.bar.declaretion;

import foo.bar.observed.DeclareHello;
import foo.bar.observed.IDeclareHello;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/16.
 *
 * ��{@link DeclareHello}���ܸ�{@link HelloIntroducer}
 * ����һ��װ��ģʽ���Ƕ�ԭ��ļ�ǿ
 */
@Component
@Aspect
public class HelloIntroducer {

    @DeclareParents(value = "foo.bar.observed.HelloByAnnotation", defaultImpl = DeclareHello.class)
    public static IDeclareHello declareHello;
}
