package designPattern.sale_strategy;

/**
 *策略模式
 *
 */
public interface SaleStrategy {

    /**
     * 定义类型
     * @return
     */
    public String type();

    /**
     * 具体实现
     * @param name
     */
    public void sale(String name);




}
