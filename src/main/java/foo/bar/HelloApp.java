package foo.bar;

import foo.bar.observed.HelloByAnnotation;
import foo.bar.observed.IDeclareHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        excuteByAnnotion(context);
    }

    /**
     * 基于注解配置
     * @param context
     */
    private static void excuteByAnnotion(ApplicationContext context) {
        HelloByAnnotation helloByAnnotation = context.getBean(HelloByAnnotation.class);
        helloByAnnotation.sayHello("Hello world!  -- by annotation");

        IDeclareHello declareHello = (IDeclareHello)helloByAnnotation;
        declareHello.sayBye();
    }
}
