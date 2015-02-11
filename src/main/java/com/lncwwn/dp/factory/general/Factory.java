package com.lncwwn.dp.factory.general;

/**
 * general factory to create sender instance.
 *
 * @author victor
 * @date 2/11/15
 */
public class Factory {

    public Sender createSender(String name) {
        if (null == name)
            return null;
        Sender sender = null;
        if ("email".equals(name)) {
            sender = new EmailSender();
        }
        if ("sms".equals(name)) {
            sender = new SmsSender();
        }

        return sender;
    }

}
