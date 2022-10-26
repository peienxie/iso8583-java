package com.peienxie.iso8583;

import java.nio.ByteBuffer;
import java.text.ParseException;

public class ISO8583Parser {
    private final ISO8583Template template;

    public ISO8583Parser(ISO8583Template template) {
        this.template = template;
    }

    public ISO8583Message parse(byte[] bytes) {
        ISO8583Message m = new ISO8583Message();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        // parse TPDU
        if (template.getTPDU().isPresent()) {
            try {
                m.setTPDU(template.getTPDU().get().parse(bytes));
            } catch (ParseException e) {
                // throw new ParseException("", curPos + e.getErrorOffset());
            }
        }

        // parse MTI
        if (template.getMTI().isPresent()) {
            m.setMTI(template.getMTI().get().parse(bytes));
        }

        // parse bitmap
        byte[] bitmap = new byte[8];

        // parse each fields
        //
    }
}
