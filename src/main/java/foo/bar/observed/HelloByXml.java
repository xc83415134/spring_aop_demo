package foo.bar.observed;

import foo.bar.annotation.PrintLog;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/17.
 */
@Component
public class HelloByXml {
    @PrintLog(type = 0)
    public void sayHello(String arg) {
        System.out.println(arg);
    }
}
