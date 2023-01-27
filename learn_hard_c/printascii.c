#include <stdio.h>

// print every ASCII

int main()
{
	int i;

	for (i=0; i<=255; i++) 
	{
		printf("The ASCII value of %c equals %d\n", i,i);
	}
	return 0;
}
