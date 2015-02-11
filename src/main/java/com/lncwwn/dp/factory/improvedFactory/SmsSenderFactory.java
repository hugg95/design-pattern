package com.lncwwn.dp.factory.improvedFactory;

import com.lncwwn.dp.factory.generalFactory.Sender;
import com.lncwwn.dp.factory.generalFactory.SmsSender;

/**
 * SmsSenderFactory class, implements Factory interface.
 *
 * @author victor
 * @date 2/11/15
 */
public class SmsSenderFactory implements Factory {
    @Override
    public Sender createSender() {
        return new SmsSender();
    }
}
