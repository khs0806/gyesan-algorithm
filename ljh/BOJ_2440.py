N = 5
tmp = 0
for i in range(N, 0, -1):
    for j in range(i):
        tmp = j
        print('*', end='')
    if i > 1:
        print('')
