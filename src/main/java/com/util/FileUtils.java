package com.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List readyFileLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = org.apache.commons.io.FileUtils.readLines(new File(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
