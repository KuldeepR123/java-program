package com.examples.threading;

import java.io.File;

public class Files extends Thread {
    ReadFiles readFiles;

    Files(ReadFiles readFiles) {
        this.readFiles = readFiles;
    }

    @Override
    public void run() {
        File[] files = new File("/home/pp-2/Desktop/Kuldeep/Files").listFiles();
        readFiles.displayFiles(files);
    }
}
