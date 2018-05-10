package inject.c_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    @Test
    public void demo1(){
        //自定义实例工厂
        //1 创建工厂
        MyBeanFactory myBeanFactory = new MyBeanFactory();
        //2 通过工厂获得对象
        UserService userService = myBeanFactory.createService();
        userService.addUser();
    }

    @Test
    public void demo2(){
        //spring工厂
        String xmPath = "inject/c_factory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmPath);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.addUser();
    }
}
