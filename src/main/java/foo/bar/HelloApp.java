package foo.bar;

import foo.bar.observed.HelloByAnnotation;
import foo.bar.observed.HelloByXml;
import foo.bar.observed.IDeclareHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        excuteByAnnotion(context);
        System.out.println("============这是一条可爱的分割线==============");
        excuteByXml(context);
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

    /**
     * 基于XML配置
     * @param context
     */
    private static void excuteByXml(ApplicationContext context) {
        HelloByXml helloByXml = context.getBean(HelloByXml.class);
        helloByXml.sayHello("Hello world!  -- by xml");
    }
}
