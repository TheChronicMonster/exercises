#include <stdio.h>
#include <string.h>

int main()
{
  int i = 0, sum = 0;
  char name[50];

  printf("\nEnter a name\n");
  scanf("%s", name);

  printf("The ASCII value of the name is\n");
  while(name[i]!='\0')
  {
    printf("%c = %d\n", name [i], name [i]);
    sum = sum + name [i];
    i++;
  }
  printf("\nSum of all characters is %d\n", sum);

  return 0;
}

