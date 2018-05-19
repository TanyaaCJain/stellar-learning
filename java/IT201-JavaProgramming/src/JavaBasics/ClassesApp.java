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

// Classes contain 
// 1. Data
// 2. Subroutines (methods)
class Student {
 
    // Instance variables (data or "state")
    protected String name;
    public int rollno, Total;
    
    public static int count = 0;
     
    public Student() {
        this.name = "Anonymous";
        rollno = ++count;
        Total =0;
        System.out.println("Default Constructor called");
    }
    
    public Student(String name) {
        this.name = name;
        rollno = ++count;
        System.out.println("Parameterized Constructor called");
    }
    
    public void setName(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
              
    void speak() {
        System.out.println("My name is: " + name);
    }
     
}

class Marks extends Student {
    int Maths, English;

    Marks(int Maths, int English) {
      this.Maths = Maths;
      this.English = English;
      Total = Maths + English;
    }

    public void SetInfo(String name, int rollno)
    {
      this.name = name;
      this.rollno = rollno;
    }

    public void Show()
    {
      System.out.println("name: " + name);
      System.out.println("rollno: " + rollno);
      System.out.println("Marks in Maths: " + Maths);
      System.out.println("Marks in English: " + English + "\n");
    }
}
 
public class ClassesApp {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Student student1 = new Student();
    System.out.println("Student1 name: " + student1.getName());
    student1.setName("Markus");
    Student student2 = new Student("Brooke");
    System.out.println("Student1 name: " + student1.getName());
    System.out.println("Student1 rollno: " + student1.rollno);
    System.out.println("Student2 name: " + student2.getName());
    System.out.println("Student2 rollno: " + student2.rollno);
    System.out.println("Total number of students in class: " + Student.count);
    
    Marks marks1 = new Marks(99,98);
    marks1.SetInfo(student1.getName(), student1.rollno);
    Marks marks2 = new Marks(100,97);
    marks2.SetInfo(student2.getName(), student2.rollno);
    
    System.out.println("Details of Marks1 student: \n");
    marks1.Show();
    System.out.println("Details of Marks2 student: \n");
    marks2.Show();
    System.out.println("Total number of students in class: " + Marks.count/2);
  }
  
}

/** output
Default Constructor called
Student1 name: Anonymous
Parameterized Constructor called
Student1 name: Markus
Student1 rollno: 1
Student2 name: Brooke
Student2 rollno: 2
Total number of students in class: 2
Default Constructor called
Default Constructor called
Details of Marks1 student: 

name: Markus
rollno: 1
Marks in Maths: 99
Marks in English: 98

Details of Marks2 student: 

name: Brooke
rollno: 2
Marks in Maths: 100
Marks in English: 97

Total number of students in class: 2
 */