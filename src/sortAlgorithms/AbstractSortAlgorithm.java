package sortAlgorithms;

import display.Display;

public abstract class AbstractSortAlgorithm {
    Display display;

    public AbstractSortAlgorithm(Display display) {
        this.display = display;
    }

    public Integer[] sort(Integer[] array) {
        boolean continueSorting;
        this.display.display(array);

        do {
            continueSorting = iterateThroughArray(array);
            this.display.display(array);
        } while(continueSorting);

        return array;
    };

    public abstract boolean iterateThroughArray(Integer[] array);
}
