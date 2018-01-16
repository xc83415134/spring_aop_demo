package foo.bar.observed;

import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/16.
 *
 * {@link HelloByAnnotation} 的装饰类，为其添加方法
 */
@Component
public class DeclareHello implements IDeclareHello{
    public void sayBye(){
        System.out.println("执行再见方法：Bye!");
    }
}
