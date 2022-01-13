import sys

sys.stdin = open("in1.txt", "rt")

T = int(input())
for t in range(T):
    n, s, e, k = map(int, input().split(" "))
    a = list(map(int, input().split()))
    a = sorted(a[s-1:e])
    print(f"#{t+1} {a[k]}")