package display;

public class ConsoleDisplay {
    public static void printArray(Integer[] array) {
        System.out.println("--");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }
}
