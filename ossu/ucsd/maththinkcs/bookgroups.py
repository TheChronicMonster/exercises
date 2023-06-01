number = range(1,100)

for n in number:
    if (n % 3 == 2 and n % 4 == 3 and
        n % 5 == 4):
        print(n)