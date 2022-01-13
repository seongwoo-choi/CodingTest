# import sys
# input.txt 에서 파일을 읽는다.
# sys.stdin = open("input.txt", "rt")

# .split(" ") -> input 으로 두 개의 값이 띄어져서 들어오는데 " " 를 구분자로 삼아서 잘라버린다.
n, k = map(int, input("n, k 두 수를 입력 : ").split(" "))
c = 0
# a = []

for i in range(1, n+1):
    # i 가 n 의 약수
    if n % i == 0:
        c += 1
    # k 번째 약수 발견 == i -> 반복문 종료
    if c == k:
        print(i)
        break
# 약수를 발견 하지 못한 경우
else:
    print(-1)


# a = []
#
# for i in range(1, n + 1):
#     if n % i == 0:
#         a.append(i)
#
# a.sort()
#
# for i in range(len(a)):
#     if len(a) < k:
#         c = -1
#         print(c)
#         break
#     c = a[k-1]
#
# if c != -1 and c != 0:
#     print(c)

