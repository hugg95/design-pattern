package com.lncwwn.dp.factory.improvedFactory;

import com.lncwwn.dp.factory.generalFactory.Sender;

/**
 * test static factory.
 *
 * @author victor
 * @date 2/11/15
 */
public class Main {

    public static void main(String[] args) {
        Sender s = StaticFactory.createEmailSender();
        s.send();
        s = StaticFactory.createSmsSender();
        s.send();

        // use another factory
        Factory f = new EmailSenderFactory();
        s = f.createSender();
        s.send();
        f = new SmsSenderFactory();
        s = f.createSender();
        s.send();
    }

}
