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

import java.util.Scanner;

/**
 *
 * @author Tanya Jain <https://tanya-jain.xyz>
 */
public class UserInput {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
    //Create Scanner object
    Scanner input = new Scanner(System.in);
    
    /** for strings  **/
    //Output the prompt for user input
    System.out.println("Enter a line");
    
    //Command to let user enter a line of text
    String line = input.nextLine();
    
    //Print the input received
    System.out.println("Text received is: " + line);
    
    
    /** for integer**/
    System.out.println("Enter a integer");
    int Num = input.nextInt();
    System.out.println("Value received is: " + Num);
    
    /** for float **/
    System.out.println("Enter a floating point number");
    float floatNum = input.nextFloat();
    System.out.println("Value received is: " + floatNum);
    
    /** for double **/
    System.out.println("Enter a double");
    double doubleNum = input.nextDouble();
    System.out.println("Value received is: " + doubleNum);
  }
  
}

/* output
Enter a line
Today is Monday.
Text received is: Today is Monday.
Enter a integer
27
Value received is: 27
Enter a floating point number
27.729
Value received is: 27.729
Enter a double
27.7299
Value received is: 27.7299
 */