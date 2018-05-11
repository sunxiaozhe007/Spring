package web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

    @Test
    public void demo02(){

        String xmlPath = "web/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        StudentAction studentAction = (StudentAction) applicationContext.getBean("studentAction");
        studentAction.ececute();
    }

}
