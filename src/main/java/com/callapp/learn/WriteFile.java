package com.callapp.learn;

import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import static com.callapp.utils.InputOutput.inputOutput;

public class WriteFile {
    public static void WriteFile(BufferedReader reader) {
        try {
            String fileName = inputOutput("type filename to edit: ").toString();

            String key = inputOutput("Type key: ").toString();
            String value = inputOutput("Type value: ").toString();

            // TODO: loop to create a complete json;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(key, value);

            FileWriter myWriter = new FileWriter(fileName + ".json");
            myWriter.write(jsonObject.toJSONString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
