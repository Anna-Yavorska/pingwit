package org.example.hw_9;

import java.util.Arrays;

public class ArrayOfStrings {
    public static void main(String[] args) {
        StringLength stringLength = new StringLength();
        String[] words = new String[]{"Apple", "engineer", "rabbit", "telephone", "elephant", "tractor", "radio", "owl"};
        int[] lengths = stringLength.collectStringLengths(words);
        System.out.println(Arrays.toString(lengths));
    }
}
