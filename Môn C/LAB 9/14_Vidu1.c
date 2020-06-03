#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char *ptr;
	char word[10];
	int i, vowcnt=0;
	printf("\nEnter a word: ");
	scanf("%s",word);
	
	ptr=word;
	for(i=0;i<strlen(word);i++)
	{
		switch(word[i])
			{
				case'a':
				case'i':
				case'u':
				case'o':
				case'e':
					vowcnt++;
					break;
			}
		ptr++;
	}
	printf("\nThe word is: %s \nThe number of vowels in the word is: %d",word,vowcnt);
	return 0;
}
