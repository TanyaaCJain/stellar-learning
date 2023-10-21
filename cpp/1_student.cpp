// Write a program to input roll number, marks in 5 subjects
// and calculate the total marks, percentage and grade via
// the following grade criteria:
// PERCENTAGE   GRADE
//    >= 90       A
//    80-90       B
//    70-80       C
//     < 70       D

#include <iostream>
#include <stdio.h>
int main()
{
    int rno, m1, m2, m3, m4, m5, total, percentage;
    char grade;
    std::cout<<"Enter roll number";
    std::cin>> rno;
    std::cout<<"Enter the marks scored in all five subjects";
    std::cin>> m1 >> m2 >> m3 >> m4 >> m5;
    total = m1 + m2 + m3 + m4 + m5;
    percentage = float(total) / 500.0 * 100;
    std::cout<<"Total marks out of 500 are: "<< total;
    std::cout<<"percentage obtained is " << percentage;
    if (percentage < 70)
        grade = 'D';
    else if (percentage >= 70 && percentage < 80)
        grade = 'C';
    else if (percentage >= 80 && percentage < 90)
        grade = 'B';
    else if (percentage >= 90)
        grade = 'A';
    std::cout<< "Grade is " << grade;
    return 0;
}