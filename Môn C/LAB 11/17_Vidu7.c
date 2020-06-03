#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(){
	char compname[20]="Microsoft";
	int len,ctr;
	
	len = strlen(compname);
	for(ctr = 0;ctr<len;ctr++)
		printf("%c * ",compname[ctr]);
}
