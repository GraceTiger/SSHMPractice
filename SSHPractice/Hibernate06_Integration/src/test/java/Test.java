import com.zxc.config.RootConfig;
import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    private IProductService productService;

    @Before
    public void init(){
        System.out.println("Test.init");
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        productService = (IProductService) context.getBean("productService");
    }

    @org.junit.Test //添加商品
    public void add() throws Exception {
        productService.add(2,"肥皂",20,100);
    }

    @org.junit.Test //修改商品
    public void modify() throws Exception {
        productService.modify(23,"肥皂",3,15,50);
    }

    @org.junit.Test //修改价格
    public void changePrice() throws Exception {
        productService.changePrice(23,200);
    }
    
    @org.junit.Test //通过编号查询价格
    public void getPriceByProduct() throws Exception {
        double price = productService.getPriceByProduct(24);
        System.out.println("price = " + price);
    }

    @org.junit.Test //删除商品
    public void delete() throws Exception {
        productService.delete(23);
    }

    @org.junit.Test //根据编号获取商品信息
    public void getProduct() throws Exception {
        System.out.println(productService.getProduct(24));
    }

    @org.junit.Test //根据编号获取总金额
    public void getAmountByProduct() throws Exception {
        System.out.println(productService.getAmountByProduct(24));
    }

    @org.junit.Test //根据类别编号获取某类商品的总金额
    public void getTotalQTYByCategory() throws Exception {
        System.out.println(productService.getTotalQTYByCategory(2));
    }

    @org.junit.Test //检查指定的产品是否在指定的产品类别中
    public void checkProductInCategory() throws Exception {
        System.out.println(productService.checkProductInCategory(24,2));
    }
}
