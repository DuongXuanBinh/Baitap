#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
    float r;
    
	printf("Nhap ban kinh hinh tron: \n");
	scanf("%f",&r);
	
	printf("Chu vi cua hinh tron la: %f \n",r * 2 * 3.14);
	printf("Dien tich cua hinh tron la: %f", pow(r,2)*3.14);
	
	return 0;
}
