package com.plocc.kafka.model;

/**
 * Created by z8242_000 on 2015/8/3.
 */
public enum UserNotifyMsgType {
    // ======================================================================================
    // 基础系统
    // 验证码
    CodeVerification(1100002, "验证码", null),
    // PV统计
    PvStatistical(1100003, "PV统计", null),
    // ======================================================================================
    // 停车场
    // 车辆入场
    ParkingLeave(1200001, "车辆入场", null),
    // ======================================================================================
    // 用户系统
    // 注册成功
    UserRegister(1300001, "注册成功", null),
    // 手机绑定
    UserMobileBind(1300002, "手机绑定", null),
    // 手机绑定
    UserEmailBind(1300003, "邮箱绑定", null),
    // 找回密码
    UserFindPassword(1300004, "找回密码", null),
    // 系统通知
    UserSystemNotify(1300005, "系统通知", UserSystemNotifyMsg.class),
    // ======================================================================================
    // 订单系统
    // 订单创建
    OrderCreate(1400001, "订单创建", null),
    // 订单准备好、正在发货
    OrderReady(1400002, "订单准备好、正在发货", null),
    // 订单取消
    OrderCancel(1400003, "订单取消", null),
    // 订单代付
    OrderGeneration(1400005, "订单代付", null),
    // 订单创建
    OrderPaySuccess(1400004, "订单支付成功", null),
    // 订单退款
    OrderPayRefund(1400005, "订单退款", null),
    // 电子兑换券生成
    ElectronicTicketGenerate(1400006, "电子兑换券生成", null),
    // ======================================================================================
    // 团购系统
    // 团购券生成
    GrouponTicketGenerate(1500001, "团购券生成", null),
    // 团购券消费
    GrouponTicketConsume(1500002, "团购券消费", null),
    // ======================================================================================
    // 电影票系统
    // 电影票生成
    MovieTicketsGenerate(1600001, "电影票生成", null),
    // 电影票生成失败
    MovieTicketsGenerateFail(1600002, "电影票生成失败", null),
    // ======================================================================================
    // 滴滴卡开通
    CrmDiDiCardOpen(1700001, "滴滴卡开通", null),
    // 积分增加
    CrmScoreAdd(1700002, "积分增加", null),
    // 礼品券码生成
    CrmScoreTicketGenerate(1700003, "礼品券码生成", null);

    private int id;
    private String name;
    private Class notifyMsg;

    UserNotifyMsgType(int id, String name, Class notifyMsg) {
        this.id = id;
        this.name = name;
        this.notifyMsg = notifyMsg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*
    * 渠道：短信、APP推送、邮件、微信、
    */
}
