package com.peienxie.iso8583;

import com.peienxie.iso8583.type.MTI;
import com.peienxie.iso8583.type.TPDU;

import java.util.Optional;

public class ISO8583Template {
    /** The ISO8583 message TPDU (Transaction Protocol Data Unit) */
    private Optional<TPDU> tpdu = Optional.empty();
    /** The ISO8583 message type identifier */
    private Optional<MTI> mti = Optional.empty();
    /** The ISO8583 message fields, only support primary bitmap */
    private ISO8583Field<?>[] fields = new ISO8583Field[64];

    /** Creates a empty ISO8583 template object */
    public ISO8583Template() {}

    public Optional<TPDU> getTPDU() {
        return this.tpdu;
    }

    public ISO8583Template setTPDU(TPDU tpdu) {
        this.tpdu = Optional.of(tpdu);
        return this;
    }

    public Optional<MTI> getMTI() {
        return this.mti;
    }

    public ISO8583Template setMTI(MTI mti) {
        this.mti = Optional.of(mti);
        return this;
    }
}
