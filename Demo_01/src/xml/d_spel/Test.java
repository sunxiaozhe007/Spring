package xml.d_spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void demo1() {
    String xmlPath = "xml/d_spel/applicationContex.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    Customer customer = (Customer) applicationContext.getBean("customer");
    System.out.println(customer);
}
}
