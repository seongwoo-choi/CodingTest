import sys

sys.stdin = open("in1.txt", "rt")

n, m = map(int, input().split(" "))
arr = [0] * (n + m + 1)

for i in range(1, n + 1):
    for j in range(1, m + 1):
        arr[i + j] += 1

for i in range(len(arr)):
    if arr[i] == max(arr):
        print(i, end=" ")

# if m > n:
#     for i in range(n + 1, m + 2):
#         print(i, end=" ")
# elif m == n:
#     print(n + 1)
# elif m < n:
#     for i in range(m + 1, n + 2):
#         print(i, end=" ")
