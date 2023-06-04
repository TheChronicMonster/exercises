cards = range(10,99)

# 10, 90
# 49, 51

minimum = 49-10
maximum = 90-51
print(minimum, maximum)
# There are 39 pairs of numbers that add up to 100
# There are 90 cards
# For every card drawn, there are 88 safe draws.
# Except 50, 91-99 have 89 safe draws
# 80 cards have 88 safe draws
# 10 cards have 89 safe draws
safedraws = (80*88)+(10*89)
print(safedraws)

# I am mistaken. She takes "Some cards" So what's the max that can be drawn at any given time
# Answer is less than 90.
# 90 - 39 = 51, but it is less.
# more than 39
# more than 41
# 90 / 2 = 45 but 10 + 45 = 55

# 99, 98, 97, 96, 95, 94, 93, 92, 91, 50
# 80 / 2 = 40 + 10 = 50

# Yes, 50 is correct.
