package algorythm.sort;

import java.util.Arrays;

/**
 * 삽입 정렬 (Insertion sort) - O(n^2), Ω(n)
 *
 *  삽입정렬은 자료 배열의 모든 요소를 앞에서부터 차례대로
 *  이미 정렬된 배열 부분과 비교하여,
 *  자신의 위치를 찾아 삽입함으로써
 *  정렬을 완성하는 알고리즘
 *
 *  장점 : 구현이 간단하다.
 *  단점 : 배열이 길어질수록 효율이 떨어진다.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {9, 2, 1, 4, 5, 6, 3, 8, 7, 0};

        InsertionSort s = new InsertionSort();
        s.insertionSort(ints);

        Arrays.stream(ints)
            .forEach(System.out::println);
    }

    /**
     *  1. 정렬은 두번째 인덱스부터 시작(선택)한다 --> 처음 정렬을 시작할 때만
     *          why? 첫번째 리스트는 하나이기 때문에 정렬이 되어있다고 보기때문
     * 2. 내가 선택한 원소를 Key에 저장한다.
     * 3. Key와 내가 선택한 이전에 있는 원소들과 비교하며 삽입해나간다.
     * 4. 내가 선택한 원소의 다음 인덱스에 있는 원소를 선택한다.
     * @param arr
     */
    public void insertionSort(int[] arr) {
        int key;
        int targetIndex;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            targetIndex = i-1;

            while (targetIndex >= 0 && key < arr[targetIndex]) {
                arr[targetIndex + 1] = arr[targetIndex];
                targetIndex --;
            }
            arr[targetIndex + 1] = key;
        }
    }
}
