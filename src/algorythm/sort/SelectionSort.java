package algorythm.sort;

import java.util.Arrays;

/**
 * 선택정렬 (selection sort) - O(n^2)
 *
 * 정렬되지 않은 데이터들에 대해
 * 가장 작은 데이터를 찾아 가장 앞의 데이터와
 * 교환해나가는 방식
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = {9, 2, 1, 4, 5, 6, 3, 8, 7, 0};

        SelectionSort s = new SelectionSort();
        s.sort(ints);

        Arrays.stream(ints)
            .forEach(System.out::println);

    }

    /**
     * 1. 앞에서 부터 데이터 하나를 선택한다.
     *
     * 2. 내가 선택한 데이터 이후에 있는 원소들 중 가장 작은 값을 찾는다.
     *
     * 3. 내가 선택한 값과 바꾼다.
     * @param ints
     */
    public void sort(int[] ints) {
        int minIndex=0;

        for (int i = 0; i < ints.length - 1; i++) {
            int min = ints[i];

            for (int k = i + 1; k < ints.length; k++) {
                if (min > ints[k]) {
                    min = ints[k];
                    minIndex = k;
                }
            }

            ints[minIndex] = ints[i];
            ints[i] = min;
        }
    }

}
