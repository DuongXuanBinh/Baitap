#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int giaithua(int x);
int main() {
	int x;
	printf("Gia tri cua x la: ");
	scanf("%d",&x);
	giaithua(x);
	printf("Giai thua cua x la %d",giaithua(x));
}
int giaithua(int x){
	int giaithua,i;
	giaithua = 1;
	for(i=1;i<=x;i++)
		giaithua = giaithua * i;
	return(giaithua);
}
