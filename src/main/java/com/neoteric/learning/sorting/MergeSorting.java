package com.neoteric.learning.sorting;

import java.util.Arrays;

public class MergeSorting {


        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                int middle = left + (right - left) / 2;
                mergeSort(array, left, middle);
                mergeSort(array, middle + 1, right);
                merge(array, left, middle, right);
            }
        }


        public static void merge(int[] array, int left, int middle, int right) {
            int n1 = middle - left + 1;
            int n2 = right - middle;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; i++) {
                leftArray[i] = array[left + i];
            }
            for (int j = 0; j < n2; j++) {
                rightArray[j] = array[middle + 1 + j];
            }

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }


            while (j < n2) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }


        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            System.out.println("Original Array: " + Arrays.toString(array));

            mergeSort(array, 0, array.length - 1);

            System.out.println("Sorted Array: " + Arrays.toString(array));
        }
    }


