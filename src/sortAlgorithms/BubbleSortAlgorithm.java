package sortAlgorithms;

import display.Display;


public class BubbleSortAlgorithm extends AbstractSortAlgorithm {
    public BubbleSortAlgorithm(Display display) {
        super(display);
    }

    @Override
    public boolean iterateThroughArray(Integer[] array) {
        boolean continueSorting = false;

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                Integer numberToChange = array[i];

                array[i] = array[i + 1];
                array[i + 1] = numberToChange;
                continueSorting = true;
            }
        }

        return continueSorting;
    }
}
