package com.callapp.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void CreateFile(BufferedReader reader) {
        try {
            // Get user input
            System.out.print("Type fileName: ");
            String fileName = reader.readLine();

            if (fileName.contains(" ")) {
                System.out.println("filename can't has whitespace.");
                return;
            }

            File myObj = new File(fileName + ".json");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already created.");
            }
        } catch (IOException e) {
            System.out.println("File error.");
            e.printStackTrace();
        }
    }
}
