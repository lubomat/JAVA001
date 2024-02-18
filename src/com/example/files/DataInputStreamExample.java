package com.example.files;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String args[])
            throws IOException {

        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")));

           // out.writeUTF("Testowy strumien binarny");
            String str = in.readUTF();
            System.out.println(str);

           // out.writeShort(32000);
            short shortNum = in.readShort();
            System.out.println(shortNum);

           // out.writeLong(12312341543254l);
            long longNum = in.readLong();
            System.out.println(longNum);

           // out.writeFloat(23.56f);
            float floatNum = in.readFloat();
            System.out.println(floatNum);

           // out.writeDouble(123245.42334);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);

            //  out.writeByte(12);
            byte byteNum = in.readByte();
            System.out.println(byteNum);

            //out.writeChar('A');
            char charSign = in.readChar();
            System.out.println(charSign);



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}
