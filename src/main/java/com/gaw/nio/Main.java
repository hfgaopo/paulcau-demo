package com.gaw.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

/**
 * @author gaopo
 * @date 2019/3/13.
 */
public class Main {
    public static void main(String[] args) {

        try {

            RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");

            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(48);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }

            aFile.close();


            Selector selector=Selector.open();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
