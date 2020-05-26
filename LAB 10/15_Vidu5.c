#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	a=b=c=0;
	
	printf("\n Enter 1st integer: ");
	scanf("%d",&a);
	printf("\nEnter 2nd integer: ");
	scanf("%d",&b);
	c=adder(a,b);
	
	printf("\n\na&b in main() are: %d, %d",a,b);
	printf("\nc in main() is: %d",c);
}
int adder(int a, int b)
{
	int c;
	c = a + b;
	a*=a;
	b+=5;
	printf("\n\na&b within adder function are: %d, %d",a,b);
	printf("\nc within adder fuction is: %d",c);
	return (c);
}
