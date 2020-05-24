#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char x[10],y[10],z[10];
	char *pt1,*pt2,*pt3;
	int i,j,len=0;
	
	printf("Nhap ky tu chuoi thu nhat: ");
	scanf("%s",x);
	printf("Nhap ky tu chuoi thu hai: ");
	scanf("%s",y);
	
	pt1=&x[0];
	pt2=&y[0];
	pt3=&z[0];
	
	for(i=0;i<strlen(x);i++)
		*(pt3+len++)=*(pt1+i);
	
	for(j=0;j<strlen(y);j++)
		*(pt3+len++)=*(pt2+j);
		
	printf("%s",z);
	return 0;
}
