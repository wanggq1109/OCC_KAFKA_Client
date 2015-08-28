package com.plocc.kafka.support;

import com.plocc.kafka.model.*;

/**
 * Created by z8242_000 on 2015/7/28.
 */
public class TopicHelper {

    /**
     * Test 相关主题
     */
    public static final Topic<TestMsg> TEST_TEST = ConfigHelper.buildTopic("test", "test");

    /**
     * User 相关主题定义
     */
    // 创建
    public static final Topic USER_CREATE = ConfigHelper.buildTopic("user", "create");
    // 注册
    public static final Topic USER_REGISTER = ConfigHelper.buildTopic("user", "register");
    // 通知
    public static final Topic<UserNotifyMsg> USER_NOTIFY = ConfigHelper.buildTopic("user", "notify");
    
    //支付汇总
    public static final Topic<PayVoMsg> PARKING_PAY = ConfigHelper.buildTopic("parking", "pay");

    /**
     * Parking 停车场相关主题定义
     */
    // 入场
    public static final Topic<ParkingEnterMsg> PARKING_ENTER = ConfigHelper.buildTopic("parking", "enter");
    //微信入场
    public static final Topic<ParkingEnterMsg> PARKING_ENTER_WECHAT = ConfigHelper.buildTopic("parking", "enter_wechat");
    // 出场
    public static final Topic<ParkingLeaveMsg> PARKING_LEAVE = ConfigHelper.buildTopic("parking", "leave");
    
    //订餐
    public static final Topic<DinnerMsg> DINNER = ConfigHelper.buildTopic("meal", "dinner");

    public static final Topic<PosTxnMsg> POS_TXN = ConfigHelper.buildTopic("pos", "txn");
    /**
     * Pos 收银台相关
     */
    // 交易数据、PosReceiptMessage
    public static final Topic POS_RECEIPT = ConfigHelper.buildTopic("pos", "receipt");
    // 心跳监控(开机时间、关机时间)
    public static final Topic POS_MONITOR = ConfigHelper.buildTopic("pos", "monitor");

    /**
     * Qrcode 二维码
     */
    // 扫描订单
    public static final Topic<QrcodeScanOrderMsg> QRCODE_SCAN_ORDER = ConfigHelper.buildTopic("qrcode", "scan_order");

    /**
     * CRM 相关
     */
    // 会员积分变动
    public static final Topic<PlcrmScoreChangeMsg> PLCRM_SCORE_CHANGE = ConfigHelper.buildTopic("plcrm", "score_change");
    /**
     * 购买和使用券码相关
     */
    public static final Topic<TicketMsg> PLTICKET_TICKET_STAT = ConfigHelper.buildTopic("plTicket", "ticket_stat");

    /**
     * 消息推送渠道
     */
    // APP
    public static final Topic<PushAppMsg> PUSH_APP_MSG = ConfigHelper.buildTopic("push", "app_msg");
    // 微信
    public static final Topic<PushWeixinMsg> PUSH_WEIXIN_MSG = ConfigHelper.buildTopic("push", "weixin_msg");
    // 短信
    public static final Topic<PushSmsMsg> PUSH_SMS_MSG = ConfigHelper.buildTopic("push", "sms_msg");
    // 邮件
    public static final Topic<PushSmsMsg> PUSH_EMAIL_MSG = ConfigHelper.buildTopic("push", "email_msg");
    // DB(入我们自己数据的消息)
    public static final Topic<PushDbMsg> PUSH_DB_MSG = ConfigHelper.buildTopic("push", "db_msg");

}
