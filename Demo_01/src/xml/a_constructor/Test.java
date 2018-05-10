package xml.a_constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void demo1() throws Exception {
       String xmlPath = "xml/a_constructor/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
