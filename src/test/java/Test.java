import com.alibaba.fastjson.JSON;
import com.plocc.kafka.model.Msg;
import com.plocc.kafka.model.TestMsg;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z8242_000 on 2015/7/28.
 */
public class Test {
    public static void main(String[] args) {
        TestMsg testMsg = new TestMsg();
        String json = JSON.toJSONString(testMsg, true);
        System.out.println(JSON.parseObject(json, Map.class));
    }
}
