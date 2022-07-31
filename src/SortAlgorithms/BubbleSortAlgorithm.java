package SortAlgorithms;

import display.ConsoleDisplay;

public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public Integer[] sort(Integer[] unsortedArray) {
        boolean arrayUnsorted;

        do {
            ConsoleDisplay.printArray(unsortedArray);
            arrayUnsorted = iterateWithAlgorithm(unsortedArray);

        } while (!arrayUnsorted);

        ConsoleDisplay.printArray(unsortedArray);

        return unsortedArray;
    }

    private boolean iterateWithAlgorithm(Integer[] unsortedArray) {
        boolean arraySorted = true;

        for (int i = 0; i < unsortedArray.length -1; i++) {
            if (unsortedArray[i] > unsortedArray[i + 1]) {
                Integer numberToChange = unsortedArray[i];

                unsortedArray[i] = unsortedArray[i + 1];
                unsortedArray[i + 1] = numberToChange;
                arraySorted = false;
            }
        }

        return arraySorted;
    }
}
