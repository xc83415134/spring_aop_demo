package foo.bar.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by xuc on 2018/1/18.
 */
@Aspect
@Component
public class PrintLogOperation {
    @Around("within(foo.bar.observed..*) && @annotation(printLog)")
    public void offerMailPo(ProceedingJoinPoint jp, PrintLog printLog) throws Throwable {
        if (printLog.type() == 0){
            System.out.println("你好啊，我是一条日志...");
        }
        jp.proceed();
    }
}
