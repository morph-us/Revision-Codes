
mylist = range(0,10)#["apple","banana","cherry"]

itr = iter(mylist)

for i in range(len(mylist)):
    print(next(itr))
