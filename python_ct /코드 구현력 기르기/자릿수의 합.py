import sys

sys.stdin = open("in1.txt", "rt")

n = int(input())
arr = list(map(str, input().split(" ")))

sum = 0
newArr = []
print(arr)
for i in arr:
    sum=0
    for x in i:
        sum += int(x)
    newArr.append(sum)
idx = newArr.index(max(newArr))
print(arr[idx])
