package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixPrinter {
    int [][] matrix;
    String output;
    public MatrixPrinter (int [] [] matrix){
        matrix = matrix;
        output = "";
    }
    public String printMatrix() {
        while (recursivePoping(matrix)){

        }
        return "yeet";
    }

    private int [][] rotateAntiClockwise(int [][] matrixToRotate){
        //TODO return matrix rotated 90

        int[][] input = {
                { 1, 2, 3},
                { 8, 9, 4},
                { 7, 6, 5},
        };
        return input;
    }



    private boolean recursivePoping(int [] [] matrixToPop){
        //If this has under has rows of 2 or under we cannot pop as it would no longer be a matrix it would be an array
        List<int[]> list = new ArrayList<>(Arrays.asList(matrixToPop));
        if(matrixToPop.length < 3){
            return false;
        } else {
            output = output + saveRow(list.get(0));
            list.remove(0);
            return recursivePoping(list.toArray(new int[][]{}));

        }

    }
    private String saveRow(int[] rowToSave){
        return Arrays.stream(rowToSave).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }

}
