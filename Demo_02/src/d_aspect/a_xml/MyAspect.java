package d_aspect.a_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，含有多个通知
 */
public class MyAspect {

    public void Mybefore(JoinPoint joinPoint){
        System.out.println("前置通知" + joinPoint.getSignature().getName());
    }

    public void MyafterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知" + joinPoint.getSignature().getName()+",----->" + ret);

    }

    public Object MyArround(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("前");
        //手动执行目标方法
        Object object = joinPoint.proceed();

        System.out.println("后");
        return object;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("抛出异常通知：");

    }
}
