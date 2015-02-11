package com.lncwwn.dp.factory.improvedFactory;

import com.lncwwn.dp.factory.generalFactory.EmailSender;
import com.lncwwn.dp.factory.generalFactory.Sender;

/**
 * EmailSenderFactory class, implements Factory interface.
 *
 * @author victor
 * @date 2/11/15
 */
public class EmailSenderFactory implements Factory {
    @Override
    public Sender createSender() {
        return new EmailSender();
    }
}
