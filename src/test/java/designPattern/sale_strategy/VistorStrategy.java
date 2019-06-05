package designPattern.sale_strategy;

import org.springframework.stereotype.Service;

/**
 * Created by HP-8560p on 2018/8/30.
 */
@Service
public class VistorStrategy implements SaleStrategy {


    @Override
    public String type() {
        return "vistor";
    }

    @Override
    public void sale(String name) {

        System.out.println("普通客人");

    }
}
