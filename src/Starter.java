import data.DataFactory;
import display.ConsoleDisplay;
import display.Display;
import sortAlgorithms.AbstractSortAlgorithm;
import sortAlgorithms.BubbleSortAlgorithm;

public class Starter {
    public static void main(String[] args) {
        var array = DataFactory.createData();
        Display display = new ConsoleDisplay();

        AbstractSortAlgorithm bubbleSort = new BubbleSortAlgorithm(display);

        bubbleSort.sort(array);

        System.out.println();
        System.out.println("End");
    }
}
