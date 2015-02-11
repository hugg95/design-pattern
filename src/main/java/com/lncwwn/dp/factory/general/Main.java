package com.lncwwn.dp.factory.general;

/**
 * Test the general factory method.
 *
 * @author victor
 * @date 2/11/15
 */
public class Main {

    public static void main(String[] args) {
        Factory f = new Factory();
        Sender s = f.createSender("email");
        s.send();
        s = f.createSender("sms");
        s.send();
    }
}
