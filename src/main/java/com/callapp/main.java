package com.callapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

import static com.callapp.learn.CreateFile.CreateFile;
import static com.callapp.learn.WriteFile.WriteFile;
import static com.callapp.utils.InputOutput.inputOutput;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = inputOutput("Create(c) - Edit(e): ");
        if (Objects.equals(file, "c")) {
            CreateFile(reader);
        }

        WriteFile(reader);
    }
}
