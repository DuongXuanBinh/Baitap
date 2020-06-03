#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(){
	char str1[15] = "New York";
	char str2[15] = "Washington";
	char chr = 'a',loc;
	
	loc = strchr(str1,chr);
	if(loc!=NULL)
		printf("%c occurs in %s\n",chr,str1);
	else
		printf("%c does not occur in %s\n",chr,str1);
		
	loc = strchr(str2,chr);
	if(loc!=NULL)
		printf("%c occurs in %s\n",chr,str2);
	else
		printf("%c does not occur in %s\n",chr,str2);
	
}
