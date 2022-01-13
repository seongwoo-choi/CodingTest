'''
문자열과 내장함수
'''
msg = "It is time"
print(msg.upper())
print(msg.lower())
print(msg)

tmp = msg.upper()
print(tmp)
print(tmp.find('T'))  # 인덱스 번호가 찍힌다.
print(tmp.count('T'))  # 문자 T 의 갯수
print(tmp[:2])  # substring
print(tmp[3:5])  # substring
print(tmp[-2:])  # substring
print(len(tmp))
for i in range(len(msg)):
    print(msg[i], end="")
print()

for x in msg:
    print(x, end='')
print()

for x in msg:
    if x.isupper():
        print(x, end='')
print()

for x in msg:
    if x.islower():
        print(x, end=' ')
print()

for x in msg:
    if x.isalpha():
        print(x, end='')
print()

tmp = 'AZ'
for x in tmp:
    print(ord(x))

tmp = 'az'
for x in tmp:
    print(ord(x))

tmp=65
print(chr(tmp))