package com.rocketmq.rocketmq.Message;

/**
 * @Class:COnsumerTest
 * @Author: ZHR on:2021/4/14 11:14
 * @Description: consumer测试
 */
import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Consumer;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.PropertyKeyConst;

import java.util.Properties;

public class ConsumerTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // 您在控制台创建的 Group ID
        properties.put(PropertyKeyConst.GROUP_ID, "GID_110");
        // 鉴权用 AccessKeyId，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey, "LTAI5tNVrz11tTJT7sDLBAon");
        // 鉴权用 AccessKeySecret，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, "EpWOWn1wLjFWTsGjMPW4Q8Pq5fmLai");
        // 设置 TCP 接入域名，进入控制台的实例详情页面，在页面上方选择实例后，在实例信息中的“获取接入点信息”区域查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR,"http://MQ_INST_1008910413281655_BXkRmjF0.mq-internet-access.mq-internet.aliyuncs.com:80");
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe("FirstTry", "*", new MessageListener() {
            public Action consume(Message message, ConsumeContext context) {
                System.out.println("Receive: " + message);
                return Action.CommitMessage;
            }
        });
        consumer.start();
        System.out.println("Consumer Started");
    }
}

    
