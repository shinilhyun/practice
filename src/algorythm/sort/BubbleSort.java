package algorythm.sort;

import java.util.Arrays;

/**
 * 버블 정렬 (bubble sort) - O(n^2)
 * <p>
 * 버블정렬은  두 인접한 원소를 검사하여 정렬하는 방법
 * 시간복잡도가 O(n2) 으로 상당히 느린편에 속하지만 코드가 단순해서 자주 사용
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {9, 2, 1, 4, 5, 6, 3, 8, 7, 0};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(ints);
        Arrays.stream(ints)
            .forEach(System.out::println);
    }

    /**
     * 1. 앞에서부터 다음 인덱스와 비교한다.(인접한 인덱스끼리 비교)
     * 2. 큰 것은 뒤로 보낸다.
     * 3. 배열의 끝까지 1~2과정을 반복하며, 한 회전이 끝나면
     * 다시 앞으로 돌아와 1~2의 과정을 반복한다.
     *
     * @param arr
     */
    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }

        }

    }
}
