package by.epam.task02.util;

public class ShapeIdGenerator {
    private static long counter;

    private ShapeIdGenerator() {
    }

    public static long generateId() {
        return counter++;
    }
}
