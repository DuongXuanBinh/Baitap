#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	printf("Gia tri cua x la: %d\n",x=(2+3)*6);
	printf("Gia tri cua x la: %d\n",x=(12+16)/2*3);
	printf("Gia tri cua x = y la: %d\n",x=y=(2+3)/4);
	printf("Gia tri cua y la: %d\n",y=3+2*(x=7/2));
	printf("Gia tri cua x la: %d\n",x=(int)3.8+3.3);
	printf("Gia tri cua x la: %d\n",x=(2+3)*10.5);
	printf("Gia tri cua x la: %d\n",x=3/5*22.0);
	printf("Gia tri cua x la: %d\n",x=22.0*3/5);
	return 0;
}
