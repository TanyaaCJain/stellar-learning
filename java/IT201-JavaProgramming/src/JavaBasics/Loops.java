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
public class Loops {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int start = 0, stop = 5, step = 0;
    
    /** while loop */
    while(start < stop)
    {
      System.out.println("while statement " + start);
      start = start + 1;
    }
    
    System.out.printf("\n");
    
    while(true)
    {
      System.out.println("while statement " + step);
      
      if (step > 4) 
      {
        break;
      }
      
      step++;
    }
    
    System.out.printf("\n");
    
    /** for loop */
    
    /** infinite for loop 
    for (;;)
    {
      System.out.println("hello");
    } 
    **/
    
    for (int i = 0; i <= stop+1; i++)
    {
      if (i % 2 == 0)
      {
        System.out.printf("for loop statement %d is even\n", i);
      }
      else if (i % 2 != 0)
      {
        System.out.printf("for loop statement %d is odd\n", i);
      }
    }
    
    System.out.printf("\n");
    start = 0;
    
    do{
      System.out.printf("do while statement %d \n", start);
      start++;
    }while(start < stop);

  }
  
}

/** output
while statement 0
while statement 1
while statement 2
while statement 3
while statement 4

while statement 0
while statement 1
while statement 2
while statement 3
while statement 4
while statement 5

for loop statement 0 is even
for loop statement 1 is odd
for loop statement 2 is even
for loop statement 3 is odd
for loop statement 4 is even
for loop statement 5 is odd
for loop statement 6 is even
 
do while statement 0 
do while statement 1 
do while statement 2 
do while statement 3 
do while statement 4 
 */