#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int main(){
	char ten[20],chucdanh[20];
	int i;
	
	for(i=0;i<5;i++)
	{
		printf("\nNhap ten nguoi thu %d: ",i+1);
		fflush(stdin);
		scanf("%s",ten);
		printf("\nNhap chuc danh cua nguoi thu %d: ",i+1);
		scanf("%s",chucdanh);
		strcat(chucdanh,ten);
		printf("\n%s",chucdanh);
	}
}
