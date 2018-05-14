package jdbcdaosupport;

import domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestC3P0 {

    @Test
    public void demo(){



        String xmlPath = "jdbcdaosupport/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> allUser = userDao.findAll();

        for (User user : allUser){
            System.out.println(user);
        }
    }

}
