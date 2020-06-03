#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float r,a,b,c;
	
	printf("Nhap ban kinh hinh tron: \n");
	scanf("%f",&r);
	printf("Chu vi hinh tron là: %f\n",r * 2 *3.14);
	printf("Dien tich hinh tron la: %f\n",pow(r,2)*3.14);
	
	printf("Nhap canh hinh vuong: \n");
	scanf("%f",&a);
	printf("Chu vi hinh vuong la: %f\n",4*a);
	printf("Dien tich hinh vuong la: %f\n",pow(a,2));
	
	printf("Nhap chieu dai hinh chu nhat: \n");
	scanf("%f",&b);
	printf("Nhap chieu rong hinh chu nhat: \n");
	scanf("%f",&c);
	printf("Chu vi hinh chu nhat la: %f\n",(b+c)*2);
	printf("Dien tich hinh chu nhat la: %f",b*c);
	return 0;
}
