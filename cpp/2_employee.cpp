// Write a program to input employee number, basic salary and grade of an
// employee. Calculate according to the given criteria, the net salary as:
// Net salary = basic + da + hra - tax
// Grade criteria:
// GRADE            DA                        HRA                     TAX
//   A      60% of basic salary      50% of basic salary      20% of basic salary
//   A      40% of basic salary      30% of basic salary      15% of basic salary
//   A      30% of basic salary      20% of basic salary      10% of basic salary
//  else            0                          0                       0

#include <iostream>
#include <stdio.h>
int main()
{
    int emp, basic, da=0, hra=0, tax=0, net_salary=0;
    char grade;
    std::cout<<"Enter employee number";
    std::cin>> emp;
    std::cout<<"Enter the employee basic salary";
    std::cin>> basic;
    std::cout<<"Enter grade";
    std::cin>> grade;
    da = 60.0 / 100 * basic;
    hra = float(50) / 100 * basic;
    tax = 10.0 / 100 * basic;
    net_salary = basic + da + hra - tax;
    std::cout<<"da = " << da << ", hra = " << hra << ", tax = " << tax;
    std::cout<<"net salary is " << net_salary;
    return 0;
}