#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	x=3456;
	y=231;
	
	if(x<2000||x>3000)
		printf("Gia tri cua x la: %d",x);
	else
		printf("Khong hop le");
	if(y>100&&y<500)
		printf("\nGia tri cua y la: %d",y);
	else
		printf("Khong hop le");
	return 0;
}
