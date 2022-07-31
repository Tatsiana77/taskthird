package by.epam.task02.validator;

import java.io.File;

public class PyramidValidator {
    public PyramidValidator() {
    }
    public static boolean isValidFile(String pathFile) {
        if (pathFile == null) {
            return false;
        }
        File file = new File(pathFile);
        if (!file.isFile()) {
            return false;
        }
        return file.length() != 0;
    }
}
