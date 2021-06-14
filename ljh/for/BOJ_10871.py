arr = list()
N, X = map(int, input().split(' '))
arr.extend(map(int, input().split(' ')))
for i in range(len(arr)):
    if arr[i] < X:
        print(arr[i], end=' ')