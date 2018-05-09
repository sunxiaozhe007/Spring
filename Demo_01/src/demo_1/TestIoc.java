package demo_1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

    @Test
    public void demo01(){
        UserService userService = new UserServiceImpl();
        userService.addUser();
    }

    @Test
    public void demo02(){
        //从Spring容器获得
        //1：获得容器
        String xmlPath = "demo_1/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //2：获得内容
        //不需要自己new 都是从spring容器获得
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
    }

}
