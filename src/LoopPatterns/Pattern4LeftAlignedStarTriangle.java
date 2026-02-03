package LoopPatterns;

public class Pattern4LeftAlignedStarTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // STEP 1: Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // 2 spaces for alignment
            }

            // STEP 2: Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
