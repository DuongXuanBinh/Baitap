#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char a,str[81],*ptr;
	printf("\nEnter a sentence: ");
	gets(str);
	printf("\nEnter character to search for: ");
	a= getchar();
	ptr = strchr(str,a);
	printf("\nString starts at address: %u",str);
	printf("\nFirst occurence of the character is at address: %u",ptr);
	printf("\nPosition of first occurence (starting from 0)is: %d",ptr-str);
}
