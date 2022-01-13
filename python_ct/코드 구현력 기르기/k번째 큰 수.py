import sys

sys.stdin = open("in1.txt", "rt")

n, k = map(int, input().split(" "))
a = list(map(int, input().split()))
# 중복 제거 하는 자료 구조
res = set()

# 배열의 원소 3개를 뽑아 더한 후 저장, 배열 내의 모든 값을 더한다.
for i in range(len(a)):
    for j in range(i+1, len(a)):
        for m in range(j+1, len(a)):
            res.add(a[i]+a[j]+a[m])

res = list(res)
res.sort(reverse=True)
print(res[k-1])