package LoopPatterns;

public class Pattern8PerfectDiamond {
    public static void main(String[] args) {
        int n = 5;

        // ========== UPPER HALF (Pyramid) ==========
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ========== LOWER HALF (Inverted Pyramid) ==========
        for (int i = n - 1; i >= 1; i--) { // Start from n-1 (skip middle)
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
