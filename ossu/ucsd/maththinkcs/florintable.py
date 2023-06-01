numbers = range(1,25)
print("7x - 13y = c")
for n in numbers:
    print(n, "|", n+1)
    print(7 * n + 13 * (n+1) * -1)