// Write a program to input seconds and convert
// it into hour, minutes and seconds

#include <iostream>
#include <stdio.h>
int main()
{
    int hr, min, sec;
    std::cout<<"Enter time in seconds";
    std::cin>> sec;
    hr = sec / 3600;
    sec = sec % 3600;
    min = sec / 60;
    sec = sec % 60;
    std::cout<< hr << "hour(s) " << min << "minute(s) " << sec << "second(s)";
    return 0;
}