package LoopPatterns;

public class Pattern5InvertedLeftAlignedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) { // Reverse the logic

            // STEP 1: Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // STEP 2: Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
