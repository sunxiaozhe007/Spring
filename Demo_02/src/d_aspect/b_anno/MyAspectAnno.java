package d_aspect.b_anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，含有多个通知
 */
@Component
@Aspect
public class MyAspectAnno {

    //切入点当前有效
   // @Before("execution(* d_aspect.a_xml.UserServiceImpl.*(..))")
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
