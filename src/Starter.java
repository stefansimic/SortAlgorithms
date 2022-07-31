import SortAlgorithms.BubbleSortAlgorithm;
import SortAlgorithms.SortAlgorithm;
import data.DataFactory;

public class Starter {
    public static void main(String[] args) {
        var array = DataFactory.createData();

        SortAlgorithm bubbleSort = new BubbleSortAlgorithm();

        bubbleSort.sort(array);

        System.out.println();
        System.out.println("End");
    }
}
