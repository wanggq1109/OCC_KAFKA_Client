import com.plocc.kafka.KafkaLocator;
import com.plocc.kafka.model.ParkingLeaveMsg;
import com.plocc.kafka.model.TestMsg;
import com.plocc.kafka.producter.MsgSender;
import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.Topic;
import com.plocc.kafka.support.TopicHelper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 发送消息测试
 */
public class MessageSenderTest<T> {

    public static void main(String[] args) {

        // 构建 发送消息对象
        MsgSender<TestMsg> messageSender = KafkaLocator.buildSender(TopicHelper.TEST_TEST);
        for (int i = 0; i < -1; i++) {
            // 消息类型之支持 String
            TestMsg testMsg = new TestMsg();
            testMsg.setId(1243);
            testMsg.setName("xiaojiang");
            testMsg.setContent("Hi,我是第" + i + "条消息。" + UUID.randomUUID());
            testMsg.setCreate(new Date());
            messageSender.sendMessage(testMsg);
        }
    }
}
