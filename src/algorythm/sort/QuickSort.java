package algorythm.sort;

import java.util.Arrays;

/**
 * 퀵정렬  O(n^2), Θ(nlogn)
 * <p>
 * 퀵정렬은 평균적으로 nlogn의 시간복잡도를 가지지만,
 * 최악의 경우 n^2의 시간복잡도를 가진다.
 * <p>
 * 1. 랜덤배열에서 빠른 정렬 속도를 보인다.
 * 2. 피벗(pivot)을 선정하는 방법에 따라 속도가 달라진다.
 * 3. 순열이나 역순의 경우 매우 느린 속도를 보인다.
 * 4. 재귀함수 기반으로 구현시 복잡하게 생각될 수 있다.
 * <p>
 * 장점
 * 속도가 빠르다.
 * 시간 복잡도가 O(nlog₂n)를 가지는 다른 정렬 알고리즘과 비교했을 때도 가장 빠르다.
 * 추가 메모리 공간을 필요로 하지 않는다.
 * 퀵 정렬은 O(log n)만큼의 메모리를 필요로 한다.
 * 단점
 * 정렬된 리스트에 대해서는 퀵 정렬의 불균형 분할에 의해 오히려 수행시간이 더 많이 걸린다.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {9, 2, 1, 4, 5, 6, 3, 8, 7, 0};
        quickSort(ints, 0, ints.length - 1);

        Arrays.stream(ints).forEach(System.out::println);
    }

    /**
     * 분할 정복 (Divide and conquer)을 이용하여 정렬을 수행
     *
     * @param arr
     */
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while ((arr[left] < pivot) && (left < right)) {
                left++;
            }

            while ((arr[right] > pivot) && (left < right)) {
                right--;
            }

            if (left < right) {
                swamp(arr, left, right);
            }
        }

        return left;
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int newPivotIndex = partition(arr, left, right);

            quickSort(arr, left, newPivotIndex - 1);
            quickSort(arr, newPivotIndex + 1, right);
        }
    }

    public static void swamp(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
