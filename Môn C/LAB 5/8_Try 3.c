#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("Nhap b: ");
	scanf("%d",&b);
	printf("Nhap c: ");
	scanf("%d",&c);
	
	if(a>b&&a>c)
		printf("a = %d la so lon nhat",a);
	else if(b>a&&b>c)
		printf("b = %d la so lon nhat",b);
	else if(c>a&&c>b)
		printf("c = %d la so lon nhat",c);
		
	return 0;
}
