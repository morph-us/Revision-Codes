import functools

li = [9,8,7,66,2,1]


max = functools.reduce((lambda x,y:x if x>y else y),li)

print(max)
