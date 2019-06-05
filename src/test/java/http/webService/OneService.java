package http.webService;

import designPattern.adapter.Source;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2018/12/1.
 */
//给类添加注解
@WebService
public class OneService {


    //2.至少包含一个可以对外公开的服务
    public String sayHello(String name){
        System.out.println("invoke"+name);
        return "Hollo"+name;
    }


    public static void main(String[] args) {
        //第一个参数称为Binding即绑定地址
        //第二个参数是实现者，即谁提供服务

        String address = "http://localhost:9999/oneService";
        Endpoint.publish(address,new OneService());

        System.out.println("wsdl地址 :"+address+"?WSDL");
    }


}
