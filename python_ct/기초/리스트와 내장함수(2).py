'''
리스트와 내장함수(2)
'''
a = [23, 12, 36, 53, 19]
# 0, 1, 2
print(a[:3])

# 1, 2, 3
print(a[1:4])

# 19
print(a[-1:])

# 36, 53, 19
print(a[-3:])

# 리스트 값이 몇 개 인지
print(len(a))

for i in range(len(a)):
    print(a[i], end=' ')
print()

for x in a:
    print(x, end=' ')
print()

for x in a:
    if x % 2 == 1:
        print(x, end=' ')
print()

# x는 a의 튜플로 출력.
# (인덱스 번호, 밸류값)
for x in enumerate(a):
    print(x)

# 튜플이 리스트와 다른 점 => 값을 새롭게 할당할 수 없다.
# const 리스트!
# b[0] = 7 -> 불가능!
b = (1, 2, 3, 4, 5)
print(b[0])

# x는 (index, value) => x[0]:index, x[1]:value
for x in enumerate(a):
    print(x[0], x[1])
print()

# 보통은 idx, value 알규먼트 두개로 해서 사용한다.
for (idx, value) in enumerate(a):
    print(idx, value)
print()

# all -> for 문이 돌아서 x 에는 a 리스트 값 하나하나 들이 들어오고 조건문과 비교
# 60>x 라는 조건이 하나라도 거짓이 되면 False 를 반환하고
# 모든 조건문이 참이어야 True 를 반환한다.
# all 은 모든 조건문이 참이어야 한다.
if all(60 > x for x in a):
    print("yes")
else:
    print("no")

# any -> 조건이 한 번 이라도 참이면 True 를 반환.
# 모두 거짓일 때 False 를 반환
if any(11 > x for x in a):
    print("yes")
else:
    print("no")
