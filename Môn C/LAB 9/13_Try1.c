#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char x[10];
	char *pt;
	int i,t;
	
	printf("Nhap chuoi ky tu: ");
	scanf("%s",x);
	
	pt=x;
	
	if(strlen(x)%2==0)
	{
		for(i=0,j=strlen(x)-1;i<strlen(x),j<strlen(x);i++,j--)
			{
			if(pt[i]==pt[j])
				printf("%s: Day la chuoi doi xung",x);
			else
				printf("%s: Day khong phai chuoi doi xung",x);
			}
	}
	else
		printf("%s: Day khong phai chuoi doi xung",x);

	return 0;
}
