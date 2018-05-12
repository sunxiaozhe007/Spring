package b_factory_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {

    @Test
    public void demo(){
        String xmlPath = "b_factory_bean/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        //获得代理类
        UserService userService = (UserService) applicationContext.getBean("proxyService");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
