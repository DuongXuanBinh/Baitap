#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a = 5, b = 6, c = 7;
	printf("int a = 5, b = 6, c = 7\n");
	printf("The value of a > b is \t%i\n\n", a>b);
	printf("The value of b < c is \t%i\n\n", b<c);
	printf("The value of a + b >= c is \t%i\n\n",a+b>=c);
	printf("The value of a -b <=b-c is \t%i\n\n",a-b<=b-c);
	printf("The value of b-a=b-c is \t%i\n\n",b-a==b - c);
	printf("The value of a*b!=c*c is \t%i\n\n",a*b!=c*c);
	printf("Result of a > 10 && b<5 = %d\n\n",a>10&&b<5);
	printf("Result of a>100 || b<50=%d\n\n",a>100||b<50);

	return 0;
}
