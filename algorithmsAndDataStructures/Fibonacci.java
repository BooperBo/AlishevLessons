package algorithmsAndDataStructures;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaive(n, mem));
    }

    // Наивный, медленным, очевидным
    private static long fibNaive(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;
        return fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
    }

    // Эффективный
//    O(n+n) = O(2n) = O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; // O(n)
        arr[0] = 0; // O(1)
        arr[1] = 1; // O(1)
        for (int i = 2; i <= n; i++) // O(n)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n]; // O(1)
    }
}

// O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(2n + 3) = O(n)
