coins = [500, 100, 50, 10]
money = 570
cnt = 0
for coin in coins:
    a = money//coin
    cnt += a
    money -= a*coin

print(cnt)

