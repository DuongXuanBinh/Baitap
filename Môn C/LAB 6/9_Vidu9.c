#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x;
	char i,ans;
	i=' ';
	do
	{
		x=0;
		ans='y';
		printf("\nEnter sequence of character:");
		do{
			i=getchar();
			x++;
		}while(i!='\n');
		i=" ";
		printf("\nNumber of Characeters entered is: %d",--x);
		printf("\nMore sequences (y/n)?");
		ans = getchar();
	}while(ans=='Y'||ans=='y');
	return 0;
}
