package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) {
                for (int notNullIndex = nullIndex + 1; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void swap(String[] array, int sourceIndex, int destIndex) {
        String temp = array[sourceIndex];
        array[sourceIndex] = array[destIndex];
        array[destIndex] = temp;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (String word : compressed) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}