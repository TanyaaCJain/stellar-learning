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
public class StringClassApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int dd = 27, mm = 05;
    String text = "Party is on";
    String blank = " ";
    String hello = "Hello,";
    String user = "User!";
    String greeting = hello + blank + user;
    
    System.out.println(greeting);
    System.out.println(text + blank + dd + " / " + mm);
    System.out.println("We will await your presence!");
  }
  
}

/* output
Hello, User!
Party is on 27 / 5
We will await your presence!
*/