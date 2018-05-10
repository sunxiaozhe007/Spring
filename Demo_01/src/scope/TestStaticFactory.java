package scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

    @Test
    public void demo2(){
        //spring工厂
        String xmPath = "scope/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmPath);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService);
        System.out.println(userService2);
    }
}
