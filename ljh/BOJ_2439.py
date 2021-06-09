N = 10
tmp = 0
for i in range(N-1, 0, -1):
    for j in range(i):
        tmp = j
        print(' ', end='')
    for k in range(0, N-tmp-1):
        print('*', end='')
    print('')
for last in range(0, N):
    print('*', end='')
