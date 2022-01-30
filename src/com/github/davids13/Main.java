package com.github.davids13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Path imagePathSrc = Path.of("image/free-jpg.jpeg");

        System.out.println("The exits? " + Files.exists(imagePathSrc));

        /* read bytes from an image */
        try (InputStream in = new FileInputStream(imagePathSrc.toString())) {
            byte[] allBytes = in.readAllBytes();
            for (byte allByte : allBytes) {
                System.out.printf("0x%x ", +allByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* read image bytes to Array of Bytes */
        byte[] bytesFromImage;
        try {
            bytesFromImage = Files.readAllBytes(imagePathSrc);
            System.out.println("\nArray of bytes" + Arrays.toString(bytesFromImage));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
