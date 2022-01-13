'''
람다 함수(익명 함수 혹은 람다 표현식)

def plus_one(x):
    return x + 1

print(plus_one(1))

# 매개변수 x, x+2 반환값
# 람다 함수를 사용하려면 변수에 할당해야 한다.
plus_two = lambda x: x + 2
print(plus_two(1))
'''


def plus_one(x):
    return x + 1


# 람다는 표현식!
# 내장 함수의 인자로 사용될 때 유용한다.
a = [1, 2, 3]
# map 함수
# 인자가 두 개이고 첫번째 인자는 함수, 두번째 인자는 자료
# 두번째 인자(자료)를 첫번째 인자(함수)에 대입.
# a 리스트 원소를 plus_one 함수에 대입
# [2, 3, 4] 출력
print(list(map(plus_one, a)))

# 이 때 람다식 사용하면 편하다.
print(list(map(lambda x: x + 1, a)))
