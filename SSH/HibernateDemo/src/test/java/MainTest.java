import com.zxc.config.SpringConfig;
import com.zxc.model.Department;
import com.zxc.service.IDepartmentService;
import com.zxc.service.impl.DepartmentServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    private Session session;
    private Transaction transaction;
    private ApplicationContext context;


    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
      /*  Configuration configuration = new Configuration();
        //不给参数就默认加载hibernate.cfg.xml文件，
        configuration.configure();
        //创建Session工厂对象
        SessionFactory factory = configuration.buildSessionFactory();
        //得到Session对象
        session = factory.openSession();
        //使用Hibernate操作数据库，都要开启事务,得到事务对象
        transaction = session.getTransaction();
        //开启事务
        transaction.begin();*/
    }

    @Test
    public void addTest(){
        Department department = new Department();
        department.setCode("N01");
        department.setName("绣虎");
        IDepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.add(department);
    }

    @Test
    public void addTest2(){
        IDepartmentService departmentService = (IDepartmentService) context.getBean("departmentService");
        Department department = new Department();
        department.setCode("N02");
        department.setName("西瓜");
        System.out.println(departmentService);
        departmentService.add(department);
    }

/*    @After
    public void destroy(){
        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
    }*/
}
