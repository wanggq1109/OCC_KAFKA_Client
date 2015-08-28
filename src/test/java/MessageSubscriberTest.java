import com.plocc.kafka.KafkaLocator;
import com.plocc.kafka.consumer.MsgHandler;
import com.plocc.kafka.consumer.MsgSubscriber;
import com.plocc.kafka.model.TestMsg;
import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.Topic;
import com.plocc.kafka.support.TopicHelper;

/**
 * 订阅消息测试
 */
public class MessageSubscriberTest {

    public static void main(String[] args) {
        // 构建订阅消息对象
        MsgSubscriber messageSubscriber = KafkaLocator.buildSubscribe();
        // 实现MessageExecutor接口重写execute、编写自己的逻辑
        messageSubscriber.subscribe(new MsgHandler<TestMsg>() {
            public Topic getTopic() {
                return TopicHelper.PARKING_ENTER;
            }

            public void execute(TestMsg message) {
                // 消息类型之支持 String
                System.out.println(message);
            }
        });
    }
}
