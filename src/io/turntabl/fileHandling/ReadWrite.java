package io.turntabl.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("./myfile.txt");
        String fileContent="Among all the creatures on Earth, human being is definitely superior. " +
                "Writing a few lines or words about myself to introduce, " +
                "I feel myself to be tiny part of this entire world that is filled with the human beings around.\n" +
                "\n" +
                "I am a human. I myself am humble, kind, caring and courageous. " +
                "I am most respected, loved and responsible human being. " +
                "Though, it is quite hard to write about yourself yet I have tried myself best to express all about myself.";

        Files.writeString(filePath, fileContent, StandardOpenOption.CREATE);
        String content = Files.readString(filePath);

        System.out.println(content);

    }
}
