package com.callapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.callapp.learn.CreateFile.CreateFile;
import static com.callapp.learn.WriteFile.WriteFile;

public class main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CreateFile(reader);
        WriteFile(reader);
    }
}
