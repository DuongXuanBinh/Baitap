#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main() {
	int x,y, *px, *py;
	px = &x;
	py = &y;
	x=15;
	y=20;
	printf("x=%d,y=%d\n",x,y);
	swap(px,py);
	printf("\nAfter interchaging x = %d, y = %d\n",x,y);
}
int swap(int *u, int*v)
{
	int temp;
	temp = *u;
	*u = *v;
	*v = temp;
	return;	
}
