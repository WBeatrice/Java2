// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

package Lesson2.Homework;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        int[] array = {5, 6, 2, 4, 3, 7, 1};
        Sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--){
            Enumeration(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i --){
            int temp = array[0];
            array[0] = array[i];
            array[i]= temp;

            Enumeration(array, i, 0);
        }
    }
    private static void Enumeration(int[] array, int size, int index){
        int init = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && array[left] > array[init]){
            init = left;
        }

        if (right < size && array[right] > array[init]){
            init = right;
        }

        if (init != index){
            int temp = array[index];
            array[index] = array[init];
            array[init] = temp;

            Enumeration(array, size, init);
        }
    }
}
