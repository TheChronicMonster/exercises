#include <stdio.h>

int main(int argc, char *argv[])
{
  int numbers[4] = { 0 };
  char name[4] = { 'a' };

  // print the data raw
  printf("numbers: %d %d %d %d\n",
		  numbers[0], numbers[1], numbers[2], numbers[3]);
  printf("name each: %c %c %c %c\n",
		  name[0], name[1], name[2], name[3]);
  printf("name: %s\n", name);

  // setup the numbers
  numbers[0] = 1;
  numbers[1] = 2;
  numbers[2] = 3;
  numbers[3] = 4;

  // setup the names
  name[0] = 'J';
  name[1] = 'P';
  name[2] = 'Z';
  name[3] = '\0';

  // now print after the setup
  printf("numbers: %d %d %d %d\n",
		  numbers[0], numbers[1], numbers[2], numbers[3]);
  printf("name each: %c %c %c %c\n",
		  name[0], name[1], name[2], name[3]);
  // print name like a string
  printf("name: %s\n", name);

  // another way to use string
  char *another = "JPZ";

  printf("*another: %s\n", another);
  printf("another each: %c %c %c %c\n", 
		  another[0], another[1], another[2], another[3]);

  return 0;	  
}
