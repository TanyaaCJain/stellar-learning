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
public class StringArrays {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Declare an array of (references to) strings 'words'.
    String[] words = new String[3];
    
    // The references to strings in the array are initialized to null.
    System.out.println("words[0] before value assignment: " + words[0]);
         
    // Set the array elements (point the references at strings)
    words[0] = "It's";
    words[1] = "a";
    words[2] = "pleasure";
         
    // Access an array element and print it.
    System.out.println("words[2]:" + words[2]);
         
    // Simultaneously declare and initialize an array of strings
    String[] cmyk = {"cyan", "magenta", "yellow", "key(black)"};
         
    // Iterate through an array
    System.out.printf("String cmyk: ");
    for(String color: cmyk) {
        System.out.print("\t" + color);
    }
         
    // Default value for a reference is "null"
    String text = null;
         
    System.out.println("\nDefault value of text: " + text);
         
    // Can also create without initializing. The last array index is optional.
    String[][] texts = new String[2][];

    // Each sub-array is null.
    System.out.println("Default value of sub-array texts[0]: " + texts[0]);
    
    texts[0] = new String[3];
    texts[0][1] = "Hello there";

    System.out.println("texts[0][1]: " + texts[0][1]);

  }
  
}

/** output
words[0] before value assignment: null
words[2]:pleasure
String cmyk: 	cyan	magenta	yellow	key(black)
Default value of text: null
Default value of sub-array texts[0]: null
texts[0][1]: Hello there
 */