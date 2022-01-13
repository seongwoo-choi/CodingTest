'''
리스트와 내장함수(1)
'''
import random as r

b = list()
# print(b)

a = [1, 2, 3, 4, 5]
print(a)
# print(a[0])

b = list(range(1, 11))
# print(b)

c = a + b
# print(c)

# a.append(6)
# print(a)

# a.insert(3, 7)
# print(a)
# print(a.pop())
# print(a.pop(3))

# a.remove(4)
# print(a)

# 5라는 값이 몇 번 인덱스에 있는지 출력
# print(a.index(5))

a = list(range(1, 11))
print(a)

# a 라는 리스트 내부의 모든 값들의 합
print(sum(a))

# a 라는 리스트에서 가장 큰 값을 찾는다.
# max -> 인자값들 중에 최대값을 찾는다.
print(max(a))

# a 라는 리스트에서 가장 작은 값을 찾는다.
# min -> 인자값들 중에서 최소값을 찾는다.
print((min(a)))
print((min(7, 5, 3, 2)))

# 무작위로 섞어라
r.shuffle(a)
print(a)

# 오름차순으로 정렬
a.sort()
print(a)

# 내림차순
a.sort(reverse=True)
print(a)

# 빈 리스트로 초기화
a.clear()
print(a)