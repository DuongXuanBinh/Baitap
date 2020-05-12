#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float doC;
	
	printf("Nhap do C: ");
	scanf("%f",&doC);
	
	printf("\nDo F tuong ung la: %f",9*doC/5+12);

	return 0;
}
