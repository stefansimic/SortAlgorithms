package data;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DataFactory {
    private static int arrayLength = 1000;

    public static Integer[] createData() {
        var array = DataFactory.createArrayWithNumbers();

        return DataFactory.randomizeArrayNumbers(array);
    }

    private static Integer[] createArrayWithNumbers() {
        Integer[] array = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = i;
        }

        return array;
    }

    private static Integer[] randomizeArrayNumbers(Integer[] array) {
        Integer[] arr = array;

        List<Integer> list = Arrays.asList(arr);

        Collections.shuffle(list);

        return list.toArray(new Integer[arr.length]);
    }
}
