package com.etn319;

import com.google.common.reflect.ClassPath;

import java.io.IOException;

@SuppressWarnings("UnstableApiUsage")
public class Main {
    public static void main(String[] args) throws IOException  {
        ClassPath path = ClassPath.from(Main.class.getClassLoader());
        path.getAllClasses().forEach(System.out::println);
    }
}
