#include <stdio.h>

int main()
{
  char ch; char ll;

  printf("Enter an uppercase letter\n");
  scanf("%c",&ch);

  if (ch >= 65 && ch <= 90) {
    ll = ch + 32;
    printf("The lowercase letter is %c\n",ll);
  } else {
    printf("\nThat's not an uppercase letter :p\n");
  }
  return 0;
}
