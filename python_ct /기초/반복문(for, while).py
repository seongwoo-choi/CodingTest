'''
반복문(for, while)
a=range(1, 11)
print(list(a))

for i in range(10):
    print("hello")

for i in range(10, 0, -1):
    print(i)

i=1
while(i<=10):
    print(i)
    i+=1

i=10
while(i>=1):
    print(i)
    i-=1

i=1
while True:
    print(i)
    if i == 10:
        break
    i+=1


for i in range(1, 11):
    if i%2 == 0:
        continue
    print(i)

'''

# for else -> 정상적으로 for 문이 종료되면 else 문 실행
for i in range(1, 11):
    print(i)
    if i>15:
        break
else:
    print(11)
