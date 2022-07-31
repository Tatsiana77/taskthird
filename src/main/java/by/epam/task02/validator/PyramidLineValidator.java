package by.epam.task02.validator;

public class PyramidLineValidator {
    private static final String VALID_PYRAMID_LINE_REGEX = "([-]?\\d+\\.\\d+\\s+){3}([-]?\\d+\\.\\d+)";

    public PyramidLineValidator() {
    }

    public static boolean isValidLine(String line) {
        return line.matches(VALID_PYRAMID_LINE_REGEX);
    }
}
