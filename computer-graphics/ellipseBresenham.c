#include <stdio.h>
#include <graphics.h>
#include <math.h>
void main()
{
  long int d1,d2;
  int i,gd = DETECT,gm,x,y;
  long int x_radius,y_radius,x_radius_square,y_radius_square,two_x_radius_square,two_y_radius_square,dx,dy;
  x_radius = 150;
  y_radius = 50;
  printf("The x Radius of the ellipse is ");
  printf("%ld",x_radius);
  printf("The y Radius of the ellipse is ");
  printf("%ld",y_radius);
  initgraph(&gd,&gm,"NULL");
  x_radius_square = x_radius*x_radius;
  y_radius_square = y_radius*y_radius;
  two_x_radius_square = 2*x_radius*x_radius;
  two_y_radius_square = 2*y_radius*y_radius;
  x = 0;
  y = y_radius;
  d1 = y_radius_square - (x_radius_square * y_radius) + (0.25 * x_radius_square);
  dx =  two_y_radius_square * x;
  dy =  two_x_radius_square * y;
  do {
    putpixel(200+x,200+y,15);
    putpixel(200-x,200-y,15);
    putpixel(200+x,200-y,15);
    putpixel(200-x,200+y,15);
    if (d1 < 0)
    {
     x = x+1;
     y = y;
     dx = dx + two_y_radius_square;
     d1 = d1 + dx + y_radius_square;
    }
    else
    {
      x = x+1;
      y = y-1;
      dx = dx + two_y_radius_square;
      dy = dy - two_x_radius_square;
      d1 = d1 + dx - dy + y_radius_square;
    }
    delay(50);
  } while (dx < dy);
  d2 = y_radius_square * ( x + 0.5) * ( x + 0.5 ) + x_radius_square * (y - 1) * (y-1) - x_radius_square * y_radius_square;
  do {
    putpixel(200+x,200+y,15);
    putpixel(200-x,200-y,15);
    putpixel(200+x,200-y,15);
    putpixel(200-x,200+y,15);

    if (d2 >0)
    {
      x = x;
      y = y-1;
      dy = dy - two_x_radius_square;
      d2 = d2 - dy + x_radius_square;
    }
    else
    {
      x = x+1;
      y = y-1;
      dy = dy - two_x_radius_square;
      dx = dx + two_y_radius_square;
      d2 = d2 + dx -dy + x_radius_square;
    }
    delay(50);
  } while ( y> 0);
  getch();
}
