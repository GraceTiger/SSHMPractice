import com.zxc.config.MainConfig;
import com.zxc.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(MainConfig.class);
    }

    @Test
    public void test1(){
        Person person = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println("person = " + person);
        System.out.println(person == person2);
    }
}
