package designPattern.sale_strategy;

import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 策略模式
 *
 * 略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。
 * 策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，
 * 就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。下面就以一个示意性的实现讲解策略模式实例
 */
@Service
public class SaleService {

    Map<String, SaleStrategy> strategyMap = new HashMap<>();

    public SaleService(List<SaleStrategy> strategyList){
        for (SaleStrategy saleStrategy : strategyList) {
            strategyMap.put(saleStrategy.type(),saleStrategy);
        }

    }

    public void sale(String name,String type){
        //根据type自动匹配策略
        strategyMap.get(type).sale(name);

    }

}
