package foo.bar.observed;

import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/17.
 */
@Component
public class HelloByXml {
    public void sayHello(String arg) {
        System.out.println(arg);
    }
}
