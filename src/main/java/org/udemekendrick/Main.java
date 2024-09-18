package org.udemekendrick;

import org.udemekendrick.fizzBuzz.Solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.fizzBuzz(10);
        System.out.println(Arrays.toString(result));
    }
}