package br.com.jfelipe.algorithms.countingvalleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Proposed solution to solve the following problem:
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;
        int valleys = 0;
        char[] path = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (level == 0 && path[i] == 'D') valleys++;

            level = (path[i] == 'U') ? level + 1 : level - 1;
        }

        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


