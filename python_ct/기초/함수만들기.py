'''
함수 만들기

def add(a, b):
    sum = a + b
    print(sum)

add(10, 3)

def add(a, b):
    sum = a + b
    return sum


x = add(3, 2)
print(x)
'''


def add(a, b):
    c = a + b
    d = a - b
    # 튜플 형태로 여러개 값을 반환
    return c, d


print(add(3, 2))


def isPrime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True


x = [12, 13, 7, 9, 19]
for i in x:
    if isPrime(i):
        print(i, end=' ')
