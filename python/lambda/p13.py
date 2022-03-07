
li = [1,2,3,4,5]

squares = list(map(lambda a:a*a,li))

print(li)
print(squares)

for i in range(len(li)):
    print(str(li[i])+ " : "+ str(squares[i]))
