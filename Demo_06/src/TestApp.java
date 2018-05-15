import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

public class TestApp {
    @Test
    public void demo(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("proxyFactoryBean");
        accountService.transfer("sun","xiao",100.0);


    }
}
