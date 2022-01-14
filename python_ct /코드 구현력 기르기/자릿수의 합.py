import sys

sys.stdin = open("in1.txt", "rt")

n = int(input())
arr = list(map(str, input().split(" ")))

sum = 0
newArr = []

for i in " ".join(arr):
    if (i.isdigit()):
        sum += int(i)
    else:
        if sum == 0:
            continue
        newArr.append(sum)
        sum = 0
idx = newArr.index(max(newArr))
print(arr[idx])
