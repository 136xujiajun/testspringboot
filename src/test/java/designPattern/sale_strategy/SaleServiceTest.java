package designPattern.sale_strategy;

import com.springboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SaleServiceTest {

    //自动注入会调用这个  SaleService的构造方法。
    // 会自动传入它是实现的类。
    @Autowired
    private SaleService saleService;

    @Test
    public void test1(){
        saleService.sale("帅哥","vistor");
        saleService.sale("美女","vip");
    }


}
