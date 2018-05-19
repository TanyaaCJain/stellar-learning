#include<graphics.h>
#include<stdio.h>
#include <X11/Xlib.h>

void main()
{
  int gd=DETECT,gm;
  int i,r,x=0,y,xc,yc;
  float d;
  initgraph(&gd,&gm,"NULL");
  //printf("Enter Radius\n");
  //scanf("%d",&r);
  r=50;
  //printf("Enter Center of circle\n");
  //scanf("%d",&xc);
  xc = 150;
  //scanf("%d",&yc);
  yc = 150;
  d=1.25-r;
  y=r;
  do {
    if(d<0.0)
    {
      x=x+1;
      d=d+2*x+1;
    }
    else
    {
      x=x+1;
      y=y-1;
      d=d+2*x-2*y+10;
    }
    putpixel(xc+x,yc+y,5);
    putpixel(xc-y,yc-x,5);
    putpixel(xc+y,yc-x,5);
    putpixel(xc-y,yc+x,5);
    putpixel(xc+y,yc+x,5);
    putpixel(xc-x,yc-y,5);
    putpixel(xc+x,yc-y,5);
    putpixel(xc-x,yc+y,5);
  }
  while(x<y);
  getch();
}
