package foo.bar.observed;

import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/16.
 * 说话的人A
 */
@Component
public class HelloByAnnotation {
    public void sayHello(String arg) {
        System.out.println(arg);
    }
}
