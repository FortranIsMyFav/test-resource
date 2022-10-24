package com.scmtf;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current paths on CLASSPATH:");

        String classpath = System.getProperty("java.class.path");
        String[] classPathValues = classpath.split(File.pathSeparator);
        for (String classPath: classPathValues) {
            System.out.println(classPath);
        }
        /*
        TODO: Add code to do the following
        - Create a File() object on src/dist/orekit-data
        - read contents of test.txt
        - read contents of userCSV.csv
        */

    }
}