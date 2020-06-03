#include <stdio.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

main() {
	int x,y;
	
	printf("Nhap so thu nhat: \n");
	scanf("%d",&x);
	
	printf("Nhap so thu hai: \n");
	scanf("%d",&y);
	
	printf("Tong 2 so la: %d\n",x+y);
	printf("Hieu 2 so la: %d\n", x - y);
	printf("Tich 2 so la: %d\n",x*y);
	printf("Thuong 2 so la: %d\n",x/y);
	getch();
}
