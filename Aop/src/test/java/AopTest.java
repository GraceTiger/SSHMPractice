import com.zxc.service.IAccountService;
import com.zxc.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        IAccountService accountService = (IAccountService) context.getBean("accountService");
        accountService.save();
    }
}
