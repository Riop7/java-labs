package lab2.java.exceptions;

import java.io.FileNotFoundException;

public class FileNotFoundExc extends FileNotFoundException {
    public FileNotFoundExc() {
        super("File not found");
    }
}
