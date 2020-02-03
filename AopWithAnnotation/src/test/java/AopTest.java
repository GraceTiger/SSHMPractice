import com.zxc.service.IAccountService;
import com.zxc.service.impl.AccountServiceImpl;
import config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        IAccountService accountService = (IAccountService) context.getBean("accountService");
        accountService.save();
    }
}
