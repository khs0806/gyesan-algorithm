import sys
TC = int(input())
for i in range(TC):
    A, B = sys.stdin.readline().split(' ')
    sys.stdout.write(str(int(A) + int(B)))
    if i < TC - 1:
        sys.stdout.write('\n')