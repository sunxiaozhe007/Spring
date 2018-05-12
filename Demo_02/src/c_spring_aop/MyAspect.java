package c_spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类中确定通知，需要实现不同接口，接口就是规范，从而确定方法名称
 * 采用环绕通知MethodInterceptor
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("前方法");

        //手动执行目标方法
        Object object = methodInvocation.proceed();

        System.out.println("后方法");

        return object;
    }
}
