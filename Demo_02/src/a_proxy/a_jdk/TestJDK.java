package a_proxy.a_jdk;

import org.junit.Test;

public class TestJDK {
    @Test
    public void demo1(){
        UserService userService = (UserService) MyBeanFactory.createService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

}
