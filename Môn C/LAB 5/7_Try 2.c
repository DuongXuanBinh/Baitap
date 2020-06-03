#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("Nhap b: ");
	scanf("%d",&b);
	c = a + b;
	
	if(c>=1000)
		printf("Tong 2 so lon hon hoac bang 1000");
	else
		printf("Tong 2 so nho hon 1000");
	
	return 0;
}
