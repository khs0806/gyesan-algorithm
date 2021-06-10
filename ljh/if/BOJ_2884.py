H, M = map(int, input().split(' '))

if M >= 45:
    M = M - 45
elif M < 45:
    H = H - 1
    M = 60 + (M - 45)
if H == -1:
    H = 23
print(H, end=' ')
print(M)
