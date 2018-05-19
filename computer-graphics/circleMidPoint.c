// C program for implementing
// Mid-Point Circle Drawing Algorithm
#include<graphics.h>
#include<stdio.h>
#include <X11/Xlib.h>

// Implementing Mid-Point Circle Drawing Algorithm
void midPointCircleDraw(int x_centre, int y_centre, int r)
{
    int x = r, y = 0;

    // Printing the initial point on the axes
    // after translation
    putpixel(x + x_centre, y + y_centre,5);

    // When radius is zero only a single
    // point will be printed
    if (r > 0)
    {
        putpixel(x + x_centre, -y + y_centre,5);
        putpixel(y + x_centre, x + y_centre,5);
        putpixel(-y + x_centre, x + y_centre,5);
    }

    // Initialising the value of P
    int P = 1 - r;
    while (x > y)
    {
        y++;

        // Mid-point is inside or on the perimeter
        if (P <= 0)
            P = P + 2*y + 1;

        // Mid-point is outside the perimeter
        else
        {
            x--;
            P = P + 2*y - 2*x + 1;
        }

        // All the perimeter points have already been printed
        if (x < y)
            break;

        // Printing the generated point and its reflection
        // in the other octants after translation
        putpixel(x + x_centre, y + y_centre,5);
        putpixel(-x + x_centre, y + y_centre,5);
        putpixel(x + x_centre, -y + y_centre,5);
        putpixel(-x + x_centre, -y + y_centre,5);

        // If the generated point is on the line x = y then
        // the perimeter points have already been printed
        if (x != y)
        {
            putpixel(y + x_centre, x + y_centre,5);
            putpixel(-y + x_centre, x + y_centre,5);
            putpixel(y + x_centre, -x + y_centre,5);
            putpixel(-y + x_centre, -x + y_centre,5);
        }
    }
}

// Driver code
int main()
{
    int gd=DETECT,gm;
    initgraph(&gd,&gm,"NULL");
    // To draw a circle of radius 50 centred at (150, 150)
    midPointCircleDraw(150, 150, 100);
    getch();
    return 0;
}
