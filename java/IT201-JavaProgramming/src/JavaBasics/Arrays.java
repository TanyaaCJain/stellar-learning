/*
 * The MIT License
 *
 * Copyright 2018 Tanya Jain <https://tanya-jain.xyz>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package JavaBasics;

/**
 *
 * @author Tanya Jain <https://tanya-jain.xyz>
 */
public class Arrays {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Declare 1D array values of size 3
    int[] values;
    values = new int[3];

    System.out.println("Value[0] before value assignment: " + values[0]);

    values[0] = 18;
    values[1] = 27;
    values[2] = 36;
    
    // Only need 1 index to access values.
    System.out.printf("Values 1d array:");
    System.out.printf("\t %d",values[0]);
    System.out.printf("\t %d",values[1]);
    System.out.printf("\t %d",values[2]);

    // Initialize 1D array numbers of size 3
    int[] numbers = {3, 6, 9};

    System.out.printf("\nNumbers 1d array:");
    for(int i=0; i < numbers.length; i++) {
        System.out.printf("\t %d",numbers[i]);
    }
    
    // Declare 2D array matrix of size 2x3
    int[][] matrix;
    matrix = new int[2][3];
    
    // To iterate through 2D arrays. First iterate through rows, 
    // then for each row, go through the columns.
    for(int col=0; col < matrix[0].length; col++) 
    {
        matrix[0][col] = values[col];
    }
    /** java.lang.System.arraycopy(Object source, int sourcePosition, 
     * Object destnation, int destinationPosition, int length)
     */
    System.arraycopy(numbers, 0, matrix[1], 0, matrix[1].length);
    
    System.out.println("\nMatrix 2d array:");
    for(int row = 0; row < matrix.length; row++) 
    {
        for(int col=0; col < matrix[row].length; col++) 
        {
            System.out.print(matrix[row][col] + "\t");
        }

        System.out.println();
    }

    // 2D array (grid or table)
    int[][] grid = {
        {3, 6, 8343},
        {72, 45},
        {3, 6, 18, 90}
    };
    
    System.out.println("Grid 2d array:");
    // Need 2 indices to access values
    System.out.println("grid[2][1]:" + grid[1][1]);
    System.out.println("grid[0][2]:" + grid[0][2]);
  }
  
}

/** output
Value[0] before value assignment: 0
Values 1d array:	 18	 27	 36
Numbers 1d array:	 3	 6	 9
Matrix 2d array:
18	27	36	
3	6	9	
Grid 2d array:
grid[2][1]:45
grid[0][2]:8343
 */