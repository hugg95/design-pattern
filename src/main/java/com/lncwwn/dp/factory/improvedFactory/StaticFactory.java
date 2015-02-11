package com.lncwwn.dp.factory.improvedFactory;

import com.lncwwn.dp.factory.generalFactory.EmailSender;
import com.lncwwn.dp.factory.generalFactory.Sender;
import com.lncwwn.dp.factory.generalFactory.SmsSender;

/**
 * static factory method.
 *
 * @author victor
 * @date 2/11/15
 */
public class StaticFactory {

    public static Sender createEmailSender() {
        return new EmailSender();
    }

    public static Sender createSmsSender() {
        return new SmsSender();
    }

}
