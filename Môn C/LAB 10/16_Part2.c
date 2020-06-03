#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int binhphuong(int x);
int main() {
	int x;
	printf("Nhap gia tri cho x: ");
	scanf("%d",&x);
	binhphuong(x);
	printf("Binh phuong cua x la: %d",binhphuong(x));
}
int binhphuong (int x){
	int binhphuong;
	binhphuong = x * x;
	return(binhphuong);
}
