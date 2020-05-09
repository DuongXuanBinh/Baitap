#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	x = 5;
	y = 2;
	printf("So nguyen la %d & %d\n",x,y);
	printf("Tong la %d\n",x+y);
	printf("Hieu la %d\n",x-y);
	printf("KQ nhan la %d\n",x*y);
	printf("KQ chia la %d\n",x/y);
	printf("So du phep chia la %d\n",x%y);
	getchar();
	return 0;
}
