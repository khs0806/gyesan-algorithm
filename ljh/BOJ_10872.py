#
# answer = 1
# for i in range(10, 0, -1):
#     answer = answer * i
# print(answer)

def factorial(N):
    if N > 1:
        return N * factorial(N - 1)
    else:
        return 1


print(factorial(10))
