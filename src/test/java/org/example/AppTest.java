package org.example;



/**
 * Unit test for simple App.
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void matrixTest() {
        MatrixPrinter printer = new MatrixPrinter();


        String expected = "1, 2, 3, 4, 5, 6, 7, 8, 9";
        String result = printer.printMatrix(input);
        assertEquals(expected, result);
    }

}
