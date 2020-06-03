#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct strucintcal
{
	char name[20];
	int numb;
	float amt;
}xyz;
void main(){

printf("\nEnter customer name: ");
gets(xyz.name);
printf("\nEnter customer number: ");
scanf("%d",&xyz.numb);
printf("\nEnter Principal amount: ");
scanf("%f",&xyz.amt);
intcal (xyz);
}
void intcal(struct {char name[20];
					int numb;
					float amt;
					}abc)
{
	float si, rate = 5.5, yrs = 2.5;
	si = (abc.amt*rate*yrs)/100;
	printf("\nThe customer name is %s",abc.name);
	printf("\nThe customer number is %d",abc.numb);
	printf("\nThe amount is %f",abc.amt);
	printf("\nThe interest is %f",si);
	return;
}

