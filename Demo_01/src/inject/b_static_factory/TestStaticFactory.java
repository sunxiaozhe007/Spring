package inject.b_static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

    @Test
    public void demo1(){
        //自定义工厂
        UserService userService = MyBeanFactory.createService();
        userService.addUser();
    }

    @Test
    public void demo2(){
        //spring工厂
        String xmPath = "inject/b_static_factory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmPath);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.addUser();
    }
}
