N = int(input())
for i in range(1, 10):
    if i == 9:
        print(str(N) + " * " + str(i) + " = " + str(N * i), end='')
    else:
        print(str(N) + " * " + str(i) + " = " + str(N * i))
