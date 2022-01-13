'''
조건문 if(분기, 중첩)

x = 11
if x >= 10:
    if x%2 == 1:
        print('10 이상의 홀수')

x = 9
if x > 0:
    if x<10:
        print('10 보다 작은 자연수')
    else:
        print('몰까요')
x = 8
if x > 0 and x < 10:
    print("10보다 작은 자연수")

x = 8
if 0 < x < 10:
    print("10보다 작은 자연수")
'''
x=10
if x>0:
    print("양수")
else:
    print("음수")