package com.peienxie.iso8583;

import org.junit.Test;

import java.nio.ByteBuffer;

public class ISO8583ParserTest {

    private void use(ByteBuffer buf) {
        System.out.printf(
                "pos: %d, limit: %d, cap: %d, remaining: %d\n",
                buf.position(), buf.limit(), buf.capacity(), buf.remaining());
        buf.get();
        buf.get();
        buf.get();
        System.out.printf(
                "pos: %d, limit: %d, cap: %d, remaining: %d\n",
                buf.position(), buf.limit(), buf.capacity(), buf.remaining());
    }

    @Test
    public void parseWithByteBuffer() {
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put("123".getBytes());
        buf.put("654321".getBytes());
        buf.flip();

        System.out.printf(
                "pos: %d, limit: %d, cap: %d, remaining: %d\n",
                buf.position(), buf.limit(), buf.capacity(), buf.remaining());
        use(buf);
        System.out.printf(
                "pos: %d, limit: %d, cap: %d, remaining: %d\n",
                buf.position(), buf.limit(), buf.capacity(), buf.remaining());
        buf.get();
        buf.get();
        buf.get();
        System.out.printf(
                "pos: %d, limit: %d, cap: %d, remaining: %d\n",
                buf.position(), buf.limit(), buf.capacity(), buf.remaining());
    }
}
