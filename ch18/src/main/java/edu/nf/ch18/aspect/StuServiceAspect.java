package edu.nf.ch18.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/12/8
 * @Aspect注解标注当前类为一个切面
 * @Component标识为收ioc容器
 */
@Aspect
@Component
public class StuServiceAspect {
    /**
     * 定义切入点，只能给定义一个方法，不需要任何逻辑
     * 此方法仅仅用于给@Pointcut注解标注，用于声明切入点表达式
     */
    @Pointcut("execution(* edu.nf.ch18.service.impl.*.*(..))")
    public void myPointcut(){
    }

    /**
     * 前置通知
     * @param jp
     */
    @Before("myPointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知，参数" + jp.getArgs()[0]);
    }

    /**
     * 环绕通知
     * @param pjp
     * @throws Throwable
     */
    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("环绕通知前");
        //调用目标方法
        Object returnVal = pjp.proceed();
        System.out.println("环绕方法后");
        return returnVal;
    }

    /**
     * 后置通知
     * @param jp
     * @param returnVal
     */
    @AfterReturning(value = "myPointcut()",returning = "returnVal")
    public void afterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知：" + returnVal);
    }

    /**
     * 异常通知
     * @param jp
     * @param e
     */
    @AfterThrowing(value = "myPointcut()", throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        System.out.println("异常通知，异常：" + e.getMessage());
    }

    /**
     * 最终通知
     * @param jp
     */
    @After(value = "myPointcut()")
    public void after(JoinPoint jp){
        System.out.println("最终通知");
    }

}
