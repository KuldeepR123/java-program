package com.examples.threading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public void displayFiles(File[] files) {
        synchronized (this) {
            if (files == null) {
                return;
            }
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(" SubDirectory Name : " + f.getName());
                    if (f.isFile()) {
                        File file = new File(f.getAbsolutePath());
                        StringBuffer sb = new StringBuffer();
                        int counter = 0;
                        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                sb.append(line);
                                sb.append("\n");
                                counter += 1;
                            }
                        } catch (IOException e) {
                            System.out.println("File not found !");
                        }
                        System.out.println(f.getName() + "have" + counter + "lines");
                        System.out.println(f.getName() + "'s Content");
                        System.out.println(sb);
                    }
                    displayFiles(f.listFiles());
                } else {
                    File file = new File(f.getAbsolutePath());
                    StringBuffer sb = new StringBuffer();
                    int counter = 0;
                    try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            sb.append(line);
                            sb.append("\n");
                            counter += 1;
                        }
                    } catch (IOException e) {
                        System.out.println("File not found !");
                    }
                    System.out.println(f.getName() + " have " + counter + " lines ");
                    System.out.println(f.getName() + "'s Content");
                    System.out.println(sb);
                }
            }
        }

    }
}
