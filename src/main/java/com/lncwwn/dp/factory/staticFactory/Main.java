package com.lncwwn.dp.factory.staticFactory;

import com.lncwwn.dp.factory.generalFactory.Sender;

/**
 * test static factory.
 *
 * @author victor
 * @date 2/11/15
 */
public class Main {

    public static void main(String[] args) {
        Sender s = Factory.createEmailSender();
        s.send();
        s = Factory.createSmsSender();
        s.send();
    }

}
