#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char xephang;
	float luong,luongthuong;
	
	printf("Nhap xep hang: ");
	scanf("%s",&xephang);
	printf("Nhap luong: ");
	scanf("%f",&luong);

	if(xephang =='A')
		luongthuong = luong + 300;
	else if(xephang=='B')
		luongthuong = luong + 250;
	else	
		luongthuong = luong + 100;
	
	printf("Luong cuoi thang la: %f",luongthuong);
	return 0;
}
