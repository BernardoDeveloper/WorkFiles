package com.files.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    String phraseType;

    public InputOutput(String phrase) {
        phraseType = phrase;
    }

    public static String inputOutput(String phrase) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(phrase);

        return reader.readLine();
    }
}
