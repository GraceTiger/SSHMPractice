import com.zxc.config.SpringConfig;
import com.zxc.service.IEmployeeService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @Test
    public void addTest(){
        IEmployeeService departmentService = (IEmployeeService) context.getBean("employeeService");

    }

    @After
    public void destroy(){

    }
}
