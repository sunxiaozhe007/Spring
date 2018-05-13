package dbcp;

import domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDBCP{

    @Test
    public void demo(){
        User user = new User();
        user.setId(1);
        user.setUsername("sxz");
        user.setPassword("sxz");


        String xmlPath = "dbcp/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.update(user);
    }

}
