package com.example.files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamExample {
    public static void main(String args[])
            throws IOException {

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")));

            out.writeUTF("Testowy strumien binarny");
            out.writeShort(32000);
            out.writeLong(12312341543254l);
            out.writeFloat(23.56f);
            out.writeDouble(123245.42334);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); // wymuszenie zapisu z bufora

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}

