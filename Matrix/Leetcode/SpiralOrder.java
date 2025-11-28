package Matrix.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        int dir=0;

        while (top <= bottom && left <= right) {
            switch (dir) {
                case 0 -> { // Move left → right
                    for (int i = left; i <= right; i++) {
                        list.add(matrix[top][i]);
                    }
                    top++; // move boundary down after top row is done
                }
                case 1 -> { // Move top → bottom
                    for (int i = top; i <= bottom; i++) {
                        list.add(matrix[i][right]);
                    }
                    right--; // move boundary left
                }
                case 2 -> { // Move right → left
                    for (int i = right; i >= left; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--; // move boundary up
                }
                case 3 -> { // Move bottom → top
                    for (int i = bottom; i >= top; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++; // move boundary right
                }
            }

            dir = (dir + 1) % 4;
        }
        System.out.println(list);
    }
}
