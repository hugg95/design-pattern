package com.lncwwn.dp.factory.generalFactory;

/**
 * email sender
 *
 * @author victor
 * @date 2/11/15
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send email");
    }
}
