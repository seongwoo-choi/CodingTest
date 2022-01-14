import sys

sys.stdin = open("in1.txt", "rt")

n = int(input())
arr = list(map(str, input().split(" ")))

sum = 0
newArr = []
arr.append(" ")
a = " ".join(arr)

for i in " ".join(arr):
    if(i == " "):
        newArr.append(sum)
        sum=0
        continue
    i = int(i)
    sum += i
idx = newArr.index(max(newArr))
print(arr[idx])


