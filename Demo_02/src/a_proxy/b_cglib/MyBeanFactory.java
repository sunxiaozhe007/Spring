package a_proxy.b_cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyBeanFactory {

    public static UserServiceImpl createService(){
        //目标类
        final UserServiceImpl userService = new UserServiceImpl();


        //切面类
        final MyAspect myAspect = new MyAspect();


        //代理类
        //1.核心类
        Enhancer enhancer = new Enhancer();
        //2.确定父类
        enhancer.setSuperclass(userService.getClass());
        //3.设置回调函数 MethodInterceptor接口等效jdk：InvocationHandler接口
        //      intercept 等效 jdk：invoke
                    //参数1，参数2，参数3 与invoke相同
                    //参数4：methodProxy 方法的代理
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

               //前方法
                myAspect.before();

                //执行目标类的方法
                Object object = method.invoke(userService,objects);
                //执行代理类的父类==执行目标类（目标类和代理类 父子关系）
                methodProxy.invokeSuper(o,objects);

                //后方法
                myAspect.after();

                return object;
            }
        });

        UserServiceImpl proxService = (UserServiceImpl) enhancer.create();
        return proxService;
    }
}
