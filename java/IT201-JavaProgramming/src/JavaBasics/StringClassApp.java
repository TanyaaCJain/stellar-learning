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
    System.out.println("We will await your presence!\n");
    
    // Inefficient
    String quote = "";
    quote += "Beauty is n the eye";
    quote += " ";
    quote += "of the beholder";
    System.out.println("Quote: " + quote);

    // More efficient.
    //initialized the string health to ""
    StringBuilder health = new StringBuilder(""); 
    health.append("I must be healthy. ");
    health.append("I shall only eat fruits and green vegetables.");
    System.out.println("Health: " + health.toString());

    // OR
    StringBuilder fitness = new StringBuilder();
    fitness.append("It is essential to workout to remain fit. ")
    .append(" ")
    .append("One must walk for at least 30 minutes a day.");
    System.out.println("Fitness: " + fitness.toString());

    ///// Formatting //////////////////////////////////

    // Outputting newlines and tabs
    System.out.print("Some lines of text.\t are now indented by a tab.\n"
        + "carried over by a newline.");
    System.out.println(" There is no harm in a little bt more info");

    // Formatting integers
    // %-10d means: output an integer in a space ten characters wide,
    // padding with space and left-aligning (%10d would right-align)
    System.out.printf("Total cost %-10d; quantity is %d\n", 819, 18);

    // Demo-ing integer and string formatting control sequences
    for(int i=0; i<9; i++) {
        System.out.printf("%2d: %s\n", i, "Iterating");
    }

    // Formatting floating point value

    // Two decimal place:
    System.out.printf("Total value: %.2f\n", 5.6673);

    // One decimal place, left-aligned in 6-character field:
    System.out.printf("Total value: %-6.1f\n", 343.0234234);

    // You can also use the String.format() method if you want to retrieve
    // a formatted string.
    String formatted = String.format("This is a floating-point value: %.3f", 5.12145);
    System.out.println(formatted);

    // Use double %% for outputting a % sign.
    System.out.printf("Giving it %d%% is physically impossible.", 100);
  }
  
}

/* output
run:
Hello, User!
Party is on 27 / 5
We will await your presence!

Quote: Beauty is n the eye of the beholder
Health: I must be healthy. I shall only eat fruits and green vegetables.
Fitness: It is essential to workout to remain fit.  One must walk for at least 
30 minutes a day.
Some lines of text.	    are now indented by a tab.
carried over by a newline. There is no harm in a little bt more info
Total cost 819       ; quantity is 18
 0: Iterating
 1: Iterating
 2: Iterating
 3: Iterating
 4: Iterating
 5: Iterating
 6: Iterating
 7: Iterating
 8: Iterating
Total value: 5.67
Total value: 343.0 
This is a floating-point value: 5.121
Giving it 100% is physically impossible.
*/