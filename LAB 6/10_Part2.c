#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,j,giaithua;
	giaithua = 1;
	printf("Nhap so: ");
	scanf("%d",&j);
	for(i=1;i<=j;i++)
		giaithua=giaithua*i;
	printf("Giai thua cua %d la %d",j,giaithua);
	return 0;
}
