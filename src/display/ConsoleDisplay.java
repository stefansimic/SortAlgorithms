package display;

public class ConsoleDisplay implements Display {
    public void display(Integer[] array) {
        System.out.println("--");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }
}
