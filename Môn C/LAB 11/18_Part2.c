#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char x,x_arr[20];
	int f_arr(char a, char a_arr[20]);
	int i,t=0;
	
	for(i=0;i<5;i++)
		{
		printf("\nNhap vao chuoi thu %d: ",i+1);
		fflush(stdin);
		scanf("%s",x_arr);
		printf("\nNhap ki tu can tim: ");
		fflush(stdin);
		x = getchar();
		t = f_arr(x,x_arr);
		printf("\nKi tu xuat hien %d lan",t);
		}
}
int f_arr(char a, char a_arr[20]){
	char *p;
	int j,t=0;
	p = a_arr;
	for(j=0;j<strlen(a_arr);j++)
		{
		if(*p == a)
		{
			t+=1;
		} 
		p++;}
	return (t);
}
