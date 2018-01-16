package foo.bar.observer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/16.
 *
 * 大脑活动
 * 执行顺序：
 *   {@link Around} -> {@link Before} -> 目标方法 -> {@link Around}
 *        -> {@link After}
 *        -> {@link AfterReturning} 或 {@link AfterThrowing}
 */
@Component
@Aspect
public class brain {

    /**
     * 定义切点
     * *:返回任意
     * *.sayHello:指定方法
     * String:指定接收类型
     * arg:指定接收参数
     */
    @Pointcut("execution(* foo.bar.observed.HelloByAnnotation.sayHello(String)) && args(arg)")
    public void speak(String arg){}

    /**
     * 目标方法调用前执行
     */
    @Before("speak(arg)")
    public void think(String arg){
        System.out.println("1.说话前要注意三思而后行:" + arg);
    }

    /**
     * 目标方法返回后执行
     */
    @AfterReturning("speak(arg)")
    public void listen(String arg){
        System.out.println("2.说完后要虚心接受长辈的教诲");
    }

    /**
     * 目标方法抛出异常后
     */
    @AfterThrowing("speak(arg)")
    public void reflection(String arg){
        System.out.println("3.说错话后要反思为什么");
    }

    /**
     * 目标方法前、后执行两次
     */
    @Around("speak(arg)")
    public void doThings(ProceedingJoinPoint joinPoint, String arg) throws Throwable {
        System.out.println("4.准备干点其他事");
        joinPoint.proceed();
        System.out.println("4.其他事做完");
    }
}