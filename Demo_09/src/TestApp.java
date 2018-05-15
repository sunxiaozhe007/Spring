import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestApp {

    @Autowired//junit整合，不需要在spring xml配置扫描
    private AccountService accountService;
    @Test
    public void demo(){

        accountService.transfer("sun","xiao",100.0);

    }
}
