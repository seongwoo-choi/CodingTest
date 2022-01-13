'''
반복문을 이용한 문제 풀이
1) 1부터 n 까지 홀수 출력
2) 1부터 n 까지 합 구하기
3) n 의 약수 출력 하기
'''
n = int(input('숫자를 입력 : '))
sum = 0
print('홀수 출력 :', end=' ')
for i in range(1, n):
    sum += i
    if i % 2 == 0:
        continue
    print(i, end=" ")
print()
print("합 :", sum)
print("n의 약수 :", end=" ")
for i in range(1, n + 1):
    if (n % i == 0):
        print(i, end=' ')
