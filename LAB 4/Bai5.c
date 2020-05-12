#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int top,bottom,height;
	printf("Nhap day lon hinh thang: \n");
	scanf("%d",&top);
	
	printf("Nhap day nho hinh thang: \n");
	scanf("%d",&bottom);
	
	printf("Nhap chieu cao hinh thang: \n");
	scanf("%d",&height);
	
	printf("Dien tich hinh thang la: %f",(float)((bottom+top)*height)/2);

	
	return 0;
}
