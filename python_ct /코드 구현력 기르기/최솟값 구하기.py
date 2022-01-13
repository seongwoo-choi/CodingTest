arr = [5, 3, 7, 9, 2, 5, 2, 6]
# 파이썬에서 가장 큰 값 float('inf')
arrMin = float('inf')

for i in range(len(arr)):
    if arrMin > arr[i]:
        arrMin = arr[i]

print(arrMin)
