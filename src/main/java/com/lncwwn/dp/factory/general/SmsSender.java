package com.lncwwn.dp.factory.general;

/**
 * sms sender
 *
 * @author victor
 * @date 2/11/15
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
