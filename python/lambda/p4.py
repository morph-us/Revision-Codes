
def myfun(n):
    return lambda a:a*n

mydoubler = myfun(2)
mytripler = myfun(3)


print(mydoubler(9))
print(mytripler(9))
