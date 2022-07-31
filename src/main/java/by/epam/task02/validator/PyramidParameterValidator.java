package by.epam.task02.validator;



public class PyramidParameterValidator {

    private static final String COORDINATE_REGEXP = "^(-?\\d+(.\\d+)?)$";
    private static final String SIDE_LENGTH_REGEXP = "^(\\d+(.\\d+)?)$";

    public PyramidParameterValidator() {
    }

    public static boolean isCoordinate(String stringForCheck) {
        return stringForCheck.matches(COORDINATE_REGEXP);
    }

    public static boolean isSideLength(String stringForCheck) {
        return stringForCheck.matches(SIDE_LENGTH_REGEXP);
    }

}

