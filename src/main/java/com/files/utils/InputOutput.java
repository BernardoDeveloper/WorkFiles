package com.files.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public InputOutput(String phrase) {
    }

    public static String inputOutput(String phrase) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(phrase);

        return reader.readLine();
    }
}
