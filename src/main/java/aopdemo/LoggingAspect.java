package aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* aopdemo.ShoppingCart.checkOut(..))")
    public  void  beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature());
       String arg =  jp.getArgs()[0].toString();
        System.out.println("Before Logger with Argument: "
        +arg);
    }
    @After("execution(* *.*.checkOut(..))")
    public  void  afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* aopdemo.ShoppingCart.quantity(..))")
    public  void afterReturningPointCut(){
        System.out.println("After Returning");
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public  void afterReturning(String retVal){
        System.out.println("After Returning: " + retVal);
    }
}
