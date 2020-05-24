#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char x[10],y[10];
	char *pt1,*pt2;
	int i,j;
	
	printf("Nhap vao chuoi ky tu: ");
	scanf("%s",x);
	
	pt1=x;
	pt2=y;
	
	for(i=0,j=strlen(x)-1;i<strlen(x),j<strlen(x);i++,j--)
		*(pt2+j)=*(pt1+i);
	

	printf("Dao chieu mang thanh: %s",pt2);
	return 0;
}
