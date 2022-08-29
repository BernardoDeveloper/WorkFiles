package com.callapp.learn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void WriteFile(BufferedReader reader) {
        try {
            System.out.print("type filename to edit: ");
            String fileName = reader.readLine();

            FileWriter myWriter = new FileWriter(fileName);

            System.out.println("Type data:");
            String data = reader.readLine();

            // TODO: Format data

            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
