package foo.bar.observer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/17.
 * 小脑活动
 */
@Component
public class Cerebellum {

    public void think(String arg){
        System.out.println("1.说话前要注意三思而后行:" + arg);
    }

    /**
     * 目标方法返回后执行
     */
    public void listen(String arg){
        System.out.println("2.说完后要虚心接受长辈的教诲s");
    }

    /**
     * 目标方法抛出异常后
     */
    public void reflection(String arg){
        System.out.println("3.说错话后要反思为什么");
    }

    /**
     * 目标方法前、后执行两次
     */
    public void doThings(ProceedingJoinPoint joinPoint, String arg) throws Throwable {
        System.out.println("4.准备干点其他事");
        joinPoint.proceed();
        System.out.println("4.其他事做完");
    }
}
