#include <graphics.h>
#include <stdio.h>
int main()
{
	int gdriver=DETECT, gmode;
	initgraph(&gdriver,&gmode,NULL);
	circle(200, 200, 180);
  circle(250,250,30);
  circle(350,250,30);
  arc(300,300,270,270,100);
	getch();
}
