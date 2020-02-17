import com.zxc.config.RootConfig;
import com.zxc.model.Account;
import com.zxc.service.IAccountService;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {

    private IAccountService accountService;

    @Before
    public void init(){
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        accountService = (IAccountService) context.getBean("accountService");
    }

    @org.junit.Test
    public void selectAllTest(){
        List<Account> accounts = accountService.selectAll();
        for (Account account : accounts) {
            System.out.println("account = " + account);
        }
    }
}
