package com.kata.triple;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Write a function
 * TripleDouble(long num1, long num2)
 * which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1
 * and also a straight double of the same number in num2.
 * If this isn't the case, return 0
 */
public class TripleTrouble {
    public int runTripleDouble(long num1, long num2) {
        Map<String, List<String>> num1map = Arrays.stream(String.valueOf(num1).split("")).collect(Collectors.groupingBy(x -> x));
        Map<String, List<String>> num2map = Arrays.stream(String.valueOf(num2).split("")).collect(Collectors.groupingBy(x -> x));
        List<String> num1Triple = num1map.keySet().stream().filter(x -> num1map.get(x).size() == 3).collect(Collectors.toList());
        List<String> num2Double = num2map.keySet().stream().filter(x -> num2map.get(x).size() == 2).collect(Collectors.toList());
        long count = num1Triple.stream().filter(x -> num2Double.stream().anyMatch(y -> y.equals(x))).count();
        return count > 0 ? 1 : 0;
    }
}
