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
public class VariablesApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int intNum = 324;
    short shortNum = 603;
    long longNum = 4059;
    
    double doubleNum = 9.5436;
    float floatNum = 351.3f;
    
    char character = 'i';
    boolean boolPositive = true;
    boolean boolNegative = false;
    boolean compareNum = intNum < shortNum;
    
    byte byteNum = 127;
    byte bitty = (byte)207;
    
    System.out.println(intNum);
    System.out.println(shortNum);
    System.out.println(longNum);
    System.out.println(doubleNum);
    System.out.println(floatNum);
    System.out.println(character);
    System.out.println(boolPositive);
    System.out.println(boolNegative);
    System.out.println(byteNum);
    System.out.println(bitty);
    System.out.println(compareNum);
  }
  
}

/*output
324
603
4059
9.5436
351.3
i
true
false
127
-49
true
*/