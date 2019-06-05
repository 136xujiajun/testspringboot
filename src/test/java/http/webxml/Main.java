package http.webxml;

/**
 * Created by Administrator on 2018/12/1.
 */
public class Main {


    public static void main(String[] args) {;
        MobileCodeWS mobileCodeWS= new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();

        String aNull = mobileCodeWSSoap.getMobileCodeInfo("13093703531",null);

        System.out.println(aNull);

    }
}
