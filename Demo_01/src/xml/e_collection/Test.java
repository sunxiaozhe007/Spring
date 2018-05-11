package xml.e_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void demo1() {
    String xmlPath = "xml/e_collection/applicationContex.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    CollData collData = (CollData) applicationContext.getBean("collData");
    System.out.println(collData);
}
}
