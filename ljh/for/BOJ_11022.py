TC = int(input())
for i in range(TC):
    A, B = map(int, input().split(' '))
    if i == TC - 1:
        print("Case #" + str(i + 1) + ": " + str(A) + " + " + str(B) + " = " + str(A + B), end='')
    else:
        print("Case #" + str(i + 1) + ": " + str(A) + " + " + str(B) + " = " + str(A + B))
