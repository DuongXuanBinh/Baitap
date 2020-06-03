#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	a=0;
	b=1;
	printf("%d, %d, ",a,b);
	
	for(;;)
		{
		c=a+b;
		printf("%d, ",c);
		a=b;
		b=c;
		}
	return 0;
}
