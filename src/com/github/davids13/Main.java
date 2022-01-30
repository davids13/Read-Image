package com.github.davids13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        /* read bytes from an image */

        Path imagePathSrc = Path.of("image/spider-man.png");

        try (InputStream in = new FileInputStream(imagePathSrc.toString())) {

            byte[] allBytes = in.readAllBytes();

            for (byte allByte : allBytes) {
                System.out.printf("0x%x ", +allByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
