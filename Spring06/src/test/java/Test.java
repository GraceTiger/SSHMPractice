import com.zxc.model.Account;
import com.zxc.service.IAccountService;
import com.zxc.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Test {

    private ApplicationContext context;
    private IAccountService accountService;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
        accountService = context.getBean("accountService", AccountServiceImpl.class);
    }

    @org.junit.Test
    public void selectAllTest() throws SQLException {
        List<Account> accounts = accountService.selectAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @org.junit.Test
    public void selectByIdTest() throws SQLException {
        Account account = accountService.selectById(1);
        System.out.println("account = " + account);
    }
    @org.junit.Test
    public void insertTest() throws SQLException {
        Account account = new Account();
        account.setId(4);
        account.setMoney((double) 2000);
        account.setUid(43);
        accountService.insert(account);
    }
    @org.junit.Test
    public void updateTest() throws SQLException {
        Account account = new Account();
        account.setId(4);
        account.setMoney((double) 10000);
        account.setUid(43);
        accountService.update(account);
    }
    @org.junit.Test
    public void deleteTest() throws SQLException {
        accountService.delete(4);
    }
}
