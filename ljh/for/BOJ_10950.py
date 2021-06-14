TC = int(input())

for i in range(TC):
    A, B = map(int, input().split(' '))
    if i == TC - 1:
        print(A+B, end='')
    else:
        print(A + B)