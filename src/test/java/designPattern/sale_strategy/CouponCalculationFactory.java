package designPattern.sale_strategy;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class CouponCalculationFactory implements ApplicationContextAware {

    private Map<String, SaleStrategy> implClassMap = new HashedMap();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // applicationContext.getBeansOfType是spring根据接口类型在applicationContext中找到对应的实现
        Map<String, SaleStrategy> map = applicationContext.getBeansOfType(SaleStrategy.class);
        map.forEach((key,value) -> {
            implClassMap.put(key,value);
        });
    }

    public SaleStrategy getSaleStrategy(String beanName){
        return implClassMap.get(beanName);
    }
}
