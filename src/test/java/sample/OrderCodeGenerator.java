package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderCodeGenerator {

    //自增长序列
    private int i = 0;

    public String getOrderCode() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-");

        return simpleDateFormat.format(now) + ++i;
    }
}
