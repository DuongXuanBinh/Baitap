#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int productcode;
	float orderamount, rate= 0.0;
	printf("\nPlease enter the product code:");
	scanf("%d",&productcode);
	printf("\nPlease enter the order amount:");
	scanf("%f",&orderamount);
	if(productcode==1)
	{
		if(orderamount >= 500)
			rate = 0.12;
		if(orderamount >= 300)
			rate = 0.08;
		else
			rate = 0.02;
	}
	else if(productcode==2)
	{
		if(orderamount>=2000)
			rate = 0.1;
		else if(orderamount>=1500)
			rate = 0.05;
	}
	else if(productcode==3)
	{
		if(orderamount>=5000)
			rate = 0.1;
		else if(orderamount>=2500)
			rate = 0.05;
	}
	orderamount -= orderamount * rate;
	printf("\nThe net orderamount is %.2f",orderamount);					
	return 0;
}
