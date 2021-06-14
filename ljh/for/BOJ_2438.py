N = int(input())

for i in range(N):
    if i > 0:
        print('')
    for j in range(i + 1):
        print('*', end='')