# include <stdio.h>

int main(int argc, char *argv[])
{
	int i = 0;

	if (argc == 1) {
		printf("You don't have any arguments!\n");
	} else if (argc > 1 && argc < 4) {
		printf("You are cool. Here are your args:\n");

		for (i = 0; i < argc; i++) {
			printf("%s ", argv[i]);
		}
		printf("\n");
	} else {
		printf("You have too many arguments. Cannot process.\n");
	}

	return 0;
}

