'''
변수입력과 연산자
a = input("숫자를 입력하세요 : ")
print(a)

# 값을 띄어쓰기로 입력할 것이기 때문에 split 을 사용
a, b = input("숫자를 입력하세요 : ").split()
print(a+b)

a, b = input("숫자를 입력하세요 : ").split()
a = int(a)
b = int(b)
print(a+b)

# 두 개의 숫자를 받아서 정수화 시킨다. map => 각 각 입력받은 숫자를 a와 b에 mapping 한다.
a, b = map(int, input("숫자를 입력하세요 : ").split())
print(a+b)
print(a-b)
print(a*b)
print(a/b)
print(a//b)
print(a%b)
print(a**b)
'''

a=4.3
b=5
c=a+b
print(type(c))