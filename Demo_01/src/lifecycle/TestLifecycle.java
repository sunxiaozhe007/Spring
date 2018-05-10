package lifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

    @Test
    public void demo1() throws Exception {
       String xmlPath = "lifecycle/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();

        //要求：1.容器必须close，销毁方法执行 2.必须是单例的
        //applicationContext.getClass().getMethod("close").invoke(applicationContext);
        //此方法接口中没有定义，实现类提供
        applicationContext.close();
    }
}
