#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char s[20];
	void lowerCase(char s[20]);
	
	printf("Enter string: ");
	gets(s);
	lowerCase(s);
	return 0;
}
void lowerCase(char s[20]){
	int i;
	for(i=0;i<20;i++)
	{
		if(s[i]>='A' && s[i]<='Z')
			s[i]=s[i]+'a'-'A';
	}
	printf("Lower case: %s",s);	
	return 0;
}

