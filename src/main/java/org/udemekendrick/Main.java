package org.udemekendrick;

import org.udemekendrick.fizzBuzz.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.fizzBuzz(5);
        System.out.println(Arrays.toString(result));
    }
}