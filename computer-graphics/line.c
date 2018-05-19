#include <graphics.h>
#include <stdio.h>
int main()
{
	int gdriver=DETECT, gmode;
	initgraph(&gdriver,&gmode,NULL);
	line(200, 200, 300, 300);
	getch();
}
