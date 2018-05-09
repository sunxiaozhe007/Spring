package demo_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestDI {

    @org.junit.Test
    public void demo1(){
        //从Spring容器获得

        String xmlPath = "demo_2/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) applicationContext.getBean("bookService");

        bookService.addBook();
    }



    @org.junit.Test
    public void demo2(){
        //使用BeanFactory

        String xmlPath = "demo_2/applicationContext.xml";

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));

        BookService bookService = (BookService) beanFactory.getBean("bookService");

        bookService.addBook();
    }
}
