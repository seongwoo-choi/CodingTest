'''
변수명 정하기
1) 영문과 숫자, _ 로 이루어진다.
2_ 대소문자를 구분한다.
3) 문자나, _ 로 시작한다.
4) 특수문자를 사용하면 안된다.(&, % 등)
5) 키워드를 사용하면 안된다.(if, for 등)
'''

a = 1
A = 2
A1 = 4
print(a, A, A1)

a, b, c = 3, 2, 1
print(a, b, c)

# 값 교환
a, b = 10, 20
print(a, b)
a, b = b, a
print(a, b)

# 변수 타입
a = 123452314914240812414124142
print(a, type(a))
a = 12.12341424121324142412412424
# 실수는 8 바이트 까지만 저장 한다.
print(a, type(a))
a = 'study'
print(a, type(a))

# 출력 방식
print(f"{a} {b} {c} asdf")
# print를 변경시킨다.
print(a, b, c, sep=', ')
print(a, b, c, sep='')
print(a, b, c, sep='\n')
# 줄 바꿈하기 싫을 때 end
print(a, end=' ')
print(b, end=' ')
print(c)