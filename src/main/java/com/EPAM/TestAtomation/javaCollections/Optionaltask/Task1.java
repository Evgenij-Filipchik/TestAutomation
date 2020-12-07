package com.EPAM.TestAtomation.javaCollections.Optionaltask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/data.txt");

        List<String> list = Files.lines(path).collect(Collectors.toList());

        for (String s : list)
        {
            System.out.println(s);
        }

    }
}
