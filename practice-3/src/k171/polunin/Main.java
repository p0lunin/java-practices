package k171.polunin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int sumColumnsHavingNegativeElement(int[][] arr) {
        var sum = 0;
        for (int y = 0; y < arr[0].length; y++) {
            var colSum = 0;
            var havingNegative = false;
            for (int[] ints : arr) {
                colSum += ints[y];
                if (ints[y] < 0) havingNegative = true;
            }
            if (havingNegative) sum += colSum;
        }
        return sum;
    }

    static ArrayList<Integer> indexesOfSortedColumns(int[][] arr) {
        var list = new ArrayList<Integer>();
        for (int y = 0; y < arr[0].length; y++) {
            var isSorted = true;
            var prev = arr[0][y];
            for (int x = 1; x < arr.length; x++) {
                if (arr[x][y] > prev) prev = arr[x][y];
                else { isSorted = false; break; }
            }
            if (isSorted) list.add(y);
        }
        return list;
    }

    static int moveLeft(int[][] arr, int k) {
        var newArr = new int[arr.length][arr[0].length];
        var offset = k % arr[0].length;
        for (int x = 0; x < arr[0].length; x++) {
            for (int y = 0; )
        }
    }
}
