#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
    int a;
	printf("Nhap gia tri a: ");
	scanf("%d",&a);
	printf("Binh phuong cua a la: %.0lf",pow(a,2));
	return 0;
}
