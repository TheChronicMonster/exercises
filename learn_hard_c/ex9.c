#include <stdio.h>

int main(int argc, char *argv[])
{
	int i = 0;

	while (i < 25) {
		printf("%d\n", i);
		i++;
	}
	printf("\n");

	while (i > 0) {
		printf("%d\n", i);
		i--;
	}
	printf("\n");

	while (i < 100) {
		if ((i % 3 == 0) && (i % 5 == 0)) {
			printf("foo fighters\n");
			i++;
		} else if (i % 5 == 0) {
			printf("goo\n");
			i++;
		} else if (i % 3 == 0) {
			printf("foo\n");
			i++;
		} else {
			printf("%d\n", i);
			i++;
		}
	}
		
	return 0;
}
