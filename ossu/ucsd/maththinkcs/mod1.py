num = range(100,999)

for n in num:
    if (n % 2 == 1 and n % 3 == 1 and
        n % 4 == 1 and n % 5 == 1 and
        n % 6 == 1 and n % 7 == 1):
        print(n)
