package mybatis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/15.
 */
public class TestMapperXml {
    public static final String nameSpace = "";

    public static final Map<String,String> methodSqlMapping = new HashMap<>();

    static {
        methodSqlMapping.put("selectByPrimary","select * from test where id = %d");
    }
}
